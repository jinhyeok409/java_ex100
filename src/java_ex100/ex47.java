package java_ex100;
import java.util.Scanner;

public class ex47 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();


        if (((year%4==0) && (year%100!=0)) || (year%400==0))
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }

        sc.close();


    }
}
