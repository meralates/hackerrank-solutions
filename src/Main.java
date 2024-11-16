import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        scanner.close();

        //stringi cevirip orjinalle kıyasla
        String reversed = new StringBuilder(A).reverse().toString();

        if(A.equals(reversed)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}