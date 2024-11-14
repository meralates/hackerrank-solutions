import java.util.Scanner;
//https://www.hackerrank.com/challenges/valid-username-checker/problem?isFullScreen=true

class UsernameValidator {
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}
public class Main {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String username = scan.nextLine();

            if (username.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
        }
    }
}