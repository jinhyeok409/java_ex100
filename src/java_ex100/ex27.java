package java_ex100;
import java.util.Scanner;

public class ex27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (a>b) ? a : b;

        System.out.printf("%d",c);
        sc.close();
    }

}