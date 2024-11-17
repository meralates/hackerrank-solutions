import java.util.Arrays;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
//anagram=ayni harflere sahip
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() != b.length()) {//uzunluklar esit degilse direkt false
            return false;
        }
        //stringleri arraya cevirip kiyasliyoruz
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        return Arrays.equals(arrA, arrB);
    }

}