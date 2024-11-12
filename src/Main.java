import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-bigdecimal/problem?isFullScreen=true
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Arrays.sort(s,0,n,(a,b)->{
            BigDecimal bd1 = new BigDecimal(a);
            BigDecimal bd2 = new BigDecimal(b);
            return bd2.compareTo(bd1);
        });
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
