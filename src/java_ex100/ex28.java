package java_ex100;
import java.util.Scanner;

public class ex28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        checkEvenOdd(a);
        checkEvenOdd(b);
        checkEvenOdd(c);

        sc.close();
    }

    public static void checkEvenOdd (int num){
        if (num % 2 == 1){
            System.out.print("");
        }
        else {
            System.out.println(num);
        }
    }

}