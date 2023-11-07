package java_ex100;
import java.util.Scanner;

public class ex20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int sum = num1+num2+num3;
        float avr = sum/3;

        System.out.printf("%d\n",sum);
        System.out.print(Math.round(avr*100)/100.0);

        sc.close();
    }

}