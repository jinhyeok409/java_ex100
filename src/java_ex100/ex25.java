package java_ex100;
import java.util.Scanner;
public class ex25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a!=b) {
            System.out.print("1");
        }
        else {
            System.out.printf("0");
        }
        sc.close();
    }

}