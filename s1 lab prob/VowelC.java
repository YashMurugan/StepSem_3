import java.util.Scanner;
public class VowelC {
    public static String checkCharType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32); // to lowercase
        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) != -1) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }
    public static int[] countVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            String type = checkCharType(str.charAt(i));
            if (type.equals("Vowel")) vowels++;
            else if (type.equals("Consonant")) consonants++;
        }
        return new int[]{vowels, consonants};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int[] result = countVowelsConsonants(input);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
        sc.close();
    }
}
