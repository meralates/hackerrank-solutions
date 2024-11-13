import java.util.Scanner;
//https://hackerrank.com/challenges/java-regex/problem?isFullScreen=true
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
    }
}
class MyRegex {
    String pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}" +
                     "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
}