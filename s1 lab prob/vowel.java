import java.util.Scanner;
public class Vowel{
    public static String checkCharType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) != -1) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }
    public static String[][] analyzeString(String str) {
        String[][] table = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            table[i][0] = String.valueOf(str.charAt(i));
            table[i][1] = checkCharType(str.charAt(i));
        }
        return table;
    }
    public static void displayTable(String[][] table) {
        System.out.println("Char\tType");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[][] result = analyzeString(input);
        displayTable(result);
        sc.close();
    }
}
