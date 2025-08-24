import java.util.*;
public class TextFormat{
    public static List<String> splitWords(String text) {
        List<String> words = new ArrayList<>();
        int start = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                if (start < i) words.add(text.substring(start, i));
                start = i + 1;
            }
        }
        if (start < text.length()) words.add(text.substring(start));
        return words;
    }
    public static List<String> justify(List<String> words, int width) {
        List<String> lines = new ArrayList<>();
        int i = 0;
        while (i < words.size()) {
            int len = words.get(i).length();
            int j = i + 1;
            while (j < words.size() && len + 1 + words.get(j).length() <= width) {
                len += 1 + words.get(j).length();
                j++;
            }
            StringBuilder sb = new StringBuilder();
            int spaces = width - len;
            int gaps = j - i - 1;
            if (gaps > 0 && j < words.size()) {
                int extra = spaces / gaps;
                int rem = spaces % gaps;
                for (int k = i; k < j - 1; k++) {
                    sb.append(words.get(k));
                    for (int s = 0; s <= extra; s++) sb.append(" ");
                    if (rem-- > 0) sb.append(" ");
                }
                sb.append(words.get(j - 1));
            } else {
                for (int k = i; k < j; k++) {
                    sb.append(words.get(k));
                    if (k != j - 1) sb.append(" ");
                }
                while (sb.length() < width) sb.append(" ");
            }
            lines.add(sb.toString());
            i = j;
        }
        return lines;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.print("Line width: ");
        int width = sc.nextInt();
        List<String> words = splitWords(text);
        List<String> lines = justify(words, width);
        System.out.println("\nJustified Text:");
        for (String line : lines) System.out.println("|" + line + "|");
        sc.close();
    }
}
