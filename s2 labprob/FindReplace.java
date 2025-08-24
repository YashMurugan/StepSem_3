import java.util.*;
public class FindReplace{
    public static List<Integer> findOccurrences(String text, String find) {
        List<Integer> positions = new ArrayList<>();
        int index = text.indexOf(find);
        while (index != -1) {
            positions.add(index);
            index = text.indexOf(find, index + 1);
        }
        return positions;
    }
    public static String manualReplace(String text, String find, String replace) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < text.length()) {
            if (i <= text.length() - find.length() && text.substring(i, i + find.length()).equals(find)) {
                result.append(replace);
                i += find.length();
            } else {
                result.append(text.charAt(i));
                i++;
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.print("Find: ");
        String find = sc.nextLine();
        System.out.print("Replace with: ");
        String replace = sc.nextLine();
        String manualResult = manualReplace(text, find, replace);
        String builtInResult = text.replace(find, replace);
        System.out.println("\nManual Replace: " + manualResult);
        System.out.println("Built-in Replace: " + builtInResult);
        System.out.println("Are both same? " + manualResult.equals(builtInResult));
        sc.close();
    }
}
