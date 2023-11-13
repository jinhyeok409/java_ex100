package java_ex100;
import java.util.Scanner;

public class ex77 {
    public static void main(String[] args) {
        // 입력 받기
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // 결과 출력
        int result = calculateFactorial(n);
        System.out.println(result);
    }

    // 팩토리얼 계산 함수
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}