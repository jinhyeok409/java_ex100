package java_ex100;
import java.util.Scanner;

public class ex74 {
    public static void main(String[] args) {
        // 입력 받기
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // 약수 찾기
        findAndPrintDivisors(N);
    }

    public static void findAndPrintDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
