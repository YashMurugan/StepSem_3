import java.util.Scanner;
public class Unique{
    public static int getLength(String str) {
        int count = 0;
        try { while (true) { str.charAt(count); count++; } }
        catch (Exception e) {}
        return count;
    }
    public static char[] uniqueChars(String str) {
        int len = getLength(str);
        char[] temp = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == c) {
                    isUnique = false; break;
                }
            }
            if (isUnique) temp[index++] = c;
        }
        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = temp[i];
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] unique = uniqueChars(input);
        System.out.print("Unique characters: ");
        for (char c : unique) System.out.print(c + " ");
        sc.close();
    }
}
