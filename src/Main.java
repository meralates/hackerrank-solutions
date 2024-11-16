import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//https://www.hackerrank.com/challenges/duplicate-word/problem?isFullScreen=true
public class Main {
    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\s+\\1\\b)+"; //b kelime siniri/(\s+\1\b)tekrara bakar/(\w+) kelimeyi temsil eder
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); //buyuk kucuk harf duyarsiz esleme

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();
            Matcher m = p.matcher(input);

            while (m.find()) {//tkr eden kelimeleri kaldirmak icin
                input=input.replaceAll(m.group(), m.group(1));
            }
            System.out.println(input);
        }
        in.close();
    }
}