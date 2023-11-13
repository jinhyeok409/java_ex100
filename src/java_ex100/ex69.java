package java_ex100;
import java.util.Scanner;

public class ex69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();

        int result = a + (n-1)*d;

        System.out.printf("%d",result);


    }
}
