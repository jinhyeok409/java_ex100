package java_ex100;
import java.util.Scanner;

public class ex86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n % 2 == 0 || n < 3 || n > 99) {
            System.out.println("홀수이면서 3부터 99까지의 값을 입력해주세요.");
            return;
        }

        printTriangle(n);
    }

    static void printTriangle(int n) {
        for (int i = 1; i <= n; i += 2) {
            // 공백을 적절히 삽입하여 삼각형 모양 출력
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }

            // 별을 출력
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
