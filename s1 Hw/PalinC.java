import java.util.Scanner;
public class PalinC{
    public static boolean isPalindrome1(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }
    public static boolean isPalindrome2(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindrome2(str, start+1, end-1);
    }
    public static boolean isPalindrome3(String str) {
        char[] original = str.toCharArray();
        char[] reverse = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reverse[i] = str.charAt(original.length - 1 - i);
        }
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        System.out.println("Logic 1: " + isPalindrome1(input));
        System.out.println("Logic 2: " + isPalindrome2(input, 0, input.length()-1));
        System.out.println("Logic 3: " + isPalindrome3(input));
        sc.close();
    }
}
