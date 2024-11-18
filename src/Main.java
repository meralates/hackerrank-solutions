import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
//
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            try{
                Pattern.compile(pattern);
                System.out.println("valid");
            } catch (PatternSyntaxException e) {
                System.out.println("invalid");
            }
            testCases--;
        }
        in.close();
    }
}