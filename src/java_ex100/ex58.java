package java_ex100;
import java.util.Scanner;

public class ex58 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (isTrianglePossible(a, b, c)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        scanner.close();
    }

    public static boolean isTrianglePossible(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
