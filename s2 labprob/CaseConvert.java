import java.util.*;
public class CaseConvert{
    public static char toUpper(char ch) {
        if (ch >= 'a' && ch <= 'z') return (char)(ch - 32);
        return ch;
    }
    public static char toLower(char ch) {
        if (ch >= 'A' && ch <= 'Z') return (char)(ch + 32);
        return ch;
    }
    public static String toUpperCase(String text) {
        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) sb.append(toUpper(c));
        return sb.toString();
    }
    public static String toLowerCase(String text) {
        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) sb.append(toLower(c));
        return sb.toString();
    }
    public static String toTitleCase(String text) {
        StringBuilder sb = new StringBuilder();
        boolean newWord = true;
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                sb.append(c);
                newWord = true;
            } else if (newWord) {
                sb.append(toUpper(c));
                newWord = false;
            } else {
                sb.append(toLower(c));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.println("\nOriginal: " + text);
        System.out.println("Manual Uppercase: " + toUpperCase(text));
        System.out.println("Manual Lowercase: " + toLowerCase(text));
        System.out.println("Manual Title Case: " + toTitleCase(text));
        System.out.println("Built-in Uppercase: " + text.toUpperCase());
        System.out.println("Built-in Lowercase: " + text.toLowerCase());

        sc.close();
    }
}
