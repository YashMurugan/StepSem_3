public class StringBuilt{
    public static void main(String[] args) {
        String sampleText = " Java Programming is Fun and Challenging! ";
        System.out.println("1. Original Length: " + sampleText.length());
        String trimmed = sampleText.trim();
        System.out.println("2. Trimmed String: '" + trimmed + "', Length: " + trimmed.length());
        System.out.println("3. Character at index 5: " + trimmed.charAt(5));
        System.out.println("4. Substring: " + trimmed.substring(5, 16));
        System.out.println("5. Index of 'Fun': " + trimmed.indexOf("Fun"));
        System.out.println("6. Contains 'Java': " + trimmed.contains("Java"));
        System.out.println("7. Starts with 'Java': " + trimmed.startsWith("Java"));
        System.out.println("8. Ends with '!': " + trimmed.endsWith("!"));
        System.out.println("9. Uppercase: " + trimmed.toUpperCase());
        System.out.println("10. Lowercase: " + trimmed.toLowerCase());
        System.out.println("11. Vowel Count: " + countVowels(trimmed));
        findAllOccurrences(trimmed, 'a');
    }
    public static int countVowels(String text) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < text.length(); i++) {
            if (vowels.indexOf(text.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
    public static void findAllOccurrences(String text, char target) {
        System.out.print("12. Positions of '" + target + "': ");
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
