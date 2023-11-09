package java_ex100;
import java.util.Scanner;

public class ex41 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();


        if ((length >=30 && length <=40)||(length >=60 && length <=70))
        {
            System.out.print("win");
        }
        else
        {
            System.out.print("lose");
        }

        sc.close();


    }
}
