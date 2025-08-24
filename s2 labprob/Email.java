import java.util.*;
public class Email{
    public static boolean validate(String email) {
        int at = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        int dot = email.lastIndexOf('.');
        return at > 0 && at == lastAt && dot > at + 1 && dot < email.length() - 1;
    }
    public static void analyze(String email) {
        if (!validate(email)) {
            System.out.println(email + " → Invalid");
            return;
        }
        int at = email.indexOf('@');
        int dot = email.lastIndexOf('.');
        String user = email.substring(0, at);
        String domain = email.substring(at + 1);
        String domainName = email.substring(at + 1, dot);
        String ext = email.substring(dot + 1);
        System.out.println(email + " | " + user + " | " + domain + " | " + domainName + " | " + ext + " | Valid");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter emails (comma separated): ");
        String[] emails = sc.nextLine().split(",");
        System.out.println("\nEmail | Username | Domain | Domain Name | Extension | Status");
        for (String e : emails) {
            analyze(e.trim());
        }
        sc.close();
    }
}
