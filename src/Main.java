import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static class Prime{
        public void checkPrime(int...numbers) //birden fazla int alacak
        {
            boolean isFirst=true;
            for (int num : numbers){
                if (isPrime(num)){
                    if (!isFirst){
                        System.out.print(" "); //ilk sayıda boşluk olmaması için
                    }
                    System.out.println(num);//asalları yazdırır
                    isFirst=false;
                }
            }
            System.out.println(); //metod sonrası yeni satır
        }
        private boolean isPrime(int num){
            if (num<2){
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++){
                if (num%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Prime prime = new Prime();
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        prime.checkPrime(num1);
        prime.checkPrime(num1,num2);
        prime.checkPrime(num1,num2,num3);
        prime.checkPrime(num1,num2,num3,num4,num5);

        scanner.close();
    }
}