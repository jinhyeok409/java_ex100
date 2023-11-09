package java_ex100;
import java.util.Scanner;

public class ex38 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        float m = sc.nextFloat();

        float area = (n*m)/2;

        System.out.printf("%.1f",area);
        sc.close();


    }
}
