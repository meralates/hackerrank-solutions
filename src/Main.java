import java.io.*;
import java.util.*;
//https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }
        scanner.close();
    }
}
