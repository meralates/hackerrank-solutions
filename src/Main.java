import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
public class Main {
    static int breadth;
    static int height; //mainde de kullanabilmek icin static
    static boolean flag = true;
    static {
        Scanner sc = new Scanner(System.in);
        breadth = sc.nextInt();
        height = sc.nextInt();

        if(breadth<=0||height<=0){
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");

        }
    }
    public static void main(String[] args) {
        if(flag){
            int area=breadth*height;
            System.out.println(area);
        }

    }
}