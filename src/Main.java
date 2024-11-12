import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        //for ABD
        NumberFormat usFormat= NumberFormat.getCurrencyInstance(Locale.US);
        String us =usFormat.format(payment);

        //hindistan icin ozel olustur
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String india = indiaFormat.format(payment);

        //cin
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaFormat.format(payment);

        //Fransa
        NumberFormat frenchFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String french = frenchFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("French: " + french);
    }
}
