package java_ex100;
import java.util.Scanner;

public class ex39 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();

        int min = 0;

        if (n>m)
        {
            min = m;
        }
        else
        {
            min = n;
        }

        if (min > a)
        {
            System.out.printf("%d",a);
        }
        else
        {
            System.out.printf("%d",min);
        }

        sc.close();


    }
}
