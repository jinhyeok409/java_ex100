package java_ex100;
import java.util.Scanner;

public class ex40 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float length = sc.nextFloat();


        if (length >=50 && length <=60)
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
