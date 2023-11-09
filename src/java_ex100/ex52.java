package java_ex100;
import java.util.Scanner;

public class ex52 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if ( n > 10 && n < 21)
        {
            System.out.printf("%dth",n);
        }
        else
        {
            if ( n%10 == 1 )
            {
                System.out.printf("%dst",n);
            }
            else if ( n%10 == 2 )
            {
                System.out.printf("%dnd",n);
            }
            else if ( n%10 == 3 )
            {
                System.out.printf("%drd",n);
            }
            else {
                System.out.printf("%dth",n);
            }

        }


    }
}
