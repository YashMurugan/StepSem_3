import java.util.*;
public class ASCII{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int ascii = (int) ch;
            System.out.println("Character: " + ch + " | ASCII: " + ascii + " | Type: " + classifyCharacter(ch));
        }
        System.out.println("Caesar Cipher (+3): " + caesarCipher(input, 3));
        displayASCIITable(65, 90);
        sc.close();
    }
    public static String classifyCharacter(char ch) {
        if (Character.isUpperCase(ch)) return "Uppercase Letter";
        if (Character.isLowerCase(ch)) return "Lowercase Letter";
        if (Character.isDigit(ch)) return "Digit";
        return "Special Character";
    }
    public static char toggleCase(char ch) {
        if (Character.isUpperCase(ch)) return (char) (ch + 32);
        if (Character.isLowerCase(ch)) return (char) (ch - 32);
        return ch;
    }
    public static String caesarCipher(String text, int shift) {
        StringBuilder sb = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                sb.append((char) ((ch - base + shift) % 26 + base));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void displayASCIITable(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i + " -> " + (char) i);
        }
    }
}
