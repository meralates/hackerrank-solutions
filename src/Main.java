import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=true
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(s.substring(start, end));
    }
}