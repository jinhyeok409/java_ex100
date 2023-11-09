package java_ex100;
import java.util.Scanner;

public class ex44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();


        if (day == 1 || day == 3 || day == 5 || day == 7)
        {
            System.out.print("oh my god");
        }
        else
        {
            System.out.print("enjoy");
        }

        sc.close();


    }
}
