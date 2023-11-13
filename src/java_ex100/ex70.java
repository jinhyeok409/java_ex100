package java_ex100;
import java.util.Scanner;

public class ex70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();

        int r = (int) Math.pow(d,n-1);
        int result = a*r;

        System.out.printf("%d",result);


    }
}
