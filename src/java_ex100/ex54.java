package java_ex100;
import java.util.Scanner;

public class ex54 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a % b == 0) {
            System.out.printf("%d*%d=%d%n", b, a / b, a);
        } else if (b % a == 0) {
            System.out.printf("%d*%d=%d%n", a, b / a, b);
        } else {
            System.out.println("none");
        }

        scanner.close();
    }
}
