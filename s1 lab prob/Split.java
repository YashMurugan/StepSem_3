import java.util.Scanner;
public class Split{
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }
    public static String[] customSplit(String str) {
        int len = findLength(str);
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') wordCount++;
        }
        String[] words = new String[wordCount];
        int index = 0;
        String temp = "";
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != ' ') {
                temp += str.charAt(i);
            } else {
                words[index++] = temp;
                temp = "";
            }
        }
        words[index] = temp; 
        return words;
    }
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String[] custom = customSplit(input);
        String[] builtin = input.split(" ");
        System.out.println("\nCustom Split:");
        for (String w : custom) System.out.println(w);
        System.out.println("\nBuilt-in Split:");
        for (String w : builtin) System.out.println(w);
        System.out.println("\nArrays Equal? " + compareArrays(custom, builtin));
        sc.close();
    }
}
