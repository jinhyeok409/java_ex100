package java_ex100;
import java.util.Scanner;

public class ex30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        checkEvenOdd(a);
        checkPlusMinus(a);
        sc.close();
    }

    public static void checkEvenOdd (int num){
        if (num % 2 == 1){
            System.out.println("odd");
        }
        else {
            System.out.println("even");
        }
    }

    public static void checkPlusMinus (int num){
        if (num > 0){
            System.out.println("plus");
        }
        else if (num < 0){
            System.out.println("minus");
        }
    }

}