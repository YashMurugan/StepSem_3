
import java.util.Scanner;
public class CharFreq{
    public static String[][] frequencyTable(String str) {
        int[] freq = new int[256]; // ASCII
        for (int i = 0; i < str.length(); i++) freq[str.charAt(i)]++;
        int uniqueCount = 0;
        for (int f : freq) if (f > 0) uniqueCount++;

        String[][] table = new String[uniqueCount][2];
        int idx = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                table[idx][0] = String.valueOf((char)i);
                table[idx][1] = String.valueOf(freq[i]);
                idx++;
            }
        }
        return table;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] result = frequencyTable(input);
        System.out.println("Char\tFreq");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + row[1]);
        }
        sc.close();
    }
}
