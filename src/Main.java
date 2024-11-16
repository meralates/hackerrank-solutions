import java.time.LocalDate;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month=scanner.nextInt();
        int day=scanner.nextInt();
        int year=scanner.nextInt();

        LocalDate date=LocalDate.of(year,month,day); //belirtilen tarihi oluştur

        String dayOfWeek=date.getDayOfWeek().toString();
        System.out.println(dayOfWeek);
        scanner.close();
    }
}