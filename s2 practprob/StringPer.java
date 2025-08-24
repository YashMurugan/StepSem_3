public class StringPer {
    public static void main(String[] args) {
        System.out.println("=== PERFORMANCE COMPARISON ===");
        long start = System.nanoTime();
        concatenateWithString(1000);
        long end = System.nanoTime();
        System.out.println("String time: " + (end - start) + " ns");
        start = System.nanoTime();
        concatenateWithStringBuilder(1000);
        end = System.nanoTime();
        System.out.println("StringBuilder time: " + (end - start) + " ns");
        start = System.nanoTime();
        concatenateWithStringBuffer(1000);
        end = System.nanoTime();
        System.out.println("StringBuffer time: " + (end - start) + " ns");
        demonstrateStringBuilderMethods();
        compareStringComparisonMethods();
    }
    public static String concatenateWithString(int n) {
        String result = "";
        for (int i = 0; i < n; i++) result += "Java ";
        return result;
    }
    public static String concatenateWithStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("Java ");
        return sb.toString();
    }
    public static String concatenateWithStringBuffer(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) sb.append("Java ");
        return sb.toString();
    }
    public static void demonstrateStringBuilderMethods() {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.append("!!!");
        sb.insert(6, "Java ");
        sb.delete(0, 5);
        sb.reverse();
        System.out.println("StringBuilder Demo: " + sb);
    }
    public static void compareStringComparisonMethods() {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println("== : " + (s1 == s2));  
        System.out.println("== : " + (s1 == s3)); 
        System.out.println("equals: " + s1.equals(s3)); 
        System.out.println("equalsIgnoreCase: " + s1.equalsIgnoreCase("hello"));
        System.out.println("compareTo: " + s1.compareTo("Hello"));
    }
}
