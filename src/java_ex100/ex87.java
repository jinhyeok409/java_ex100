package java_ex100;
import java.util.Scanner;

public class ex87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();

        if (n < 3) {
            System.out.println("길이는 3 이상이어야 합니다.");
            return;
        }

        printSquare(n);
    }

    static void printSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
