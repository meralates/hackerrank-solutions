import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String a = scanner.nextLine();
         String b = scanner.nextLine();

        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);

        BigInteger sum = num1.add(num2);
        BigInteger product = num1.multiply(num2);
        System.out.println(sum);
        System.out.println(product);

    }
}