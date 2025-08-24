import java.util.*;
public class TextPrss{
    public static String cleanInput(String input) {
        input = input.trim().replaceAll("\\s+", " ");
        return input.substring(0,1).toUpperCase() + input.substring(1); 
    }
    public static void analyzeText(String text) {
        String[] words = text.split("\\s+");
        int wordCount = words.length;
        int sentenceCount = text.split("[.!?]").length;
        int charCount = text.replace(" ", "").length();
        String longestWord = "";
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "");
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
        }
        char mostCommon = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommon = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println("\n=== TEXT ANALYSIS ===");
        System.out.println("Words: " + wordCount);
        System.out.println("Sentences: " + sentenceCount);
        System.out.println("Characters (no spaces): " + charCount);
        System.out.println("Longest word: " + longestWord);
        System.out.println("Most common character: " + mostCommon);
    }
    public static String[] getWordsSorted(String text) {
        String[] words = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        Arrays.sort(words);
        return words;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== TEXT PROCESSOR ===");
        System.out.print("Enter a paragraph: ");
        String input = scanner.nextLine();
        String cleaned = cleanInput(input);
        analyzeText(cleaned);
        String[] sortedWords = getWordsSorted(cleaned);
        System.out.println("\n=== SORTED WORDS ===");
        for (String word : sortedWords) {
            System.out.println(word);
        }
        System.out.print("\nEnter a word to search: ");
        String searchWord = scanner.nextLine().toLowerCase();
        boolean found = Arrays.asList(sortedWords).contains(searchWord);
        System.out.println("Word \"" + searchWord + "\" found: " + found);
        scanner.close();
    }
}
