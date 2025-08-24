import java.util.*;
public class StringPerf{
    public static long testStringConcat(int n) {
        String s = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            s += "Java";
        }
        return System.currentTimeMillis() - start;
    }
    public static long testStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            sb.append("Java");
        }
        return System.currentTimeMillis() - start;
    }
    public static long testStringBuffer(int n) {
        StringBuffer sb = new StringBuffer();
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            sb.append("Java");
        }
        return System.currentTimeMillis() - start;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter iterations: ");
        int n = sc.nextInt();
        System.out.println("\n=== Performance ===");
        System.out.println("String: " + testStringConcat(n) + " ms");
        System.out.println("StringBuilder: " + testStringBuilder(n) + " ms");
        System.out.println("StringBuffer: " + testStringBuffer(n) + " ms");
        sc.close();
    }
}
