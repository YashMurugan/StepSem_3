import java.util.*;
public class StringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();
        String trimmed = input.trim();
        System.out.println("Trimmed: " + trimmed);
        String replaced = trimmed.replace(" ", "_");
        System.out.println("Spaces replaced: " + replaced);
        String noDigits = trimmed.replaceAll("\\d", "");
        System.out.println("No digits: " + noDigits);
        String[] words = trimmed.split(" ");
        System.out.println("Words: " + Arrays.toString(words));
        String joined = String.join(" | ", words);
        System.out.println("Joined: " + joined);
        System.out.println("No punctuation: " + removePunctuation(trimmed));
        System.out.println("Capitalized: " + capitalizeWords(trimmed));
        System.out.println("Reversed words: " + reverseWordOrder(trimmed));
        System.out.println("Word Frequency:");
        countWordFrequency(trimmed);
        sc.close();
    }
    public static String removePunctuation(String text) {
        return text.replaceAll("\\p{Punct}", "");
    }
    public static String capitalizeWords(String text) {
        String[] words = text.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            if (w.length() > 0)
                sb.append(Character.toUpperCase(w.charAt(0)))
                  .append(w.substring(1).toLowerCase())
                  .append(" ");
        }
        return sb.toString().trim();
    }
    public static String reverseWordOrder(String text) {
        String[] words = text.split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
    public static void countWordFrequency(String text) {
        String[] words = text.toLowerCase().split("\\s+");
        Map<String, Integer> freq = new HashMap<>();
        for (String w : words) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }
        System.out.println(freq);
    }
}
