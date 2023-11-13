package java_ex100;
import java.util.Scanner;

public class ex84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 정수 n 입력받기
        System.out.print("삼각형의 높이(n)를 입력하세요: ");
        int n = scanner.nextInt();

        // 역삼각형 출력
        printReverseTriangle(n);
    }

    // 역삼각형 출력 함수
    public static void printReverseTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            // 별표 출력

            // 공백 출력
            for (int k = 1; k <= i; k++) {
                if ( k == 1 )
                {
                    System.out.print("-");
                }else {
                    System.out.print("*");
                }


            }

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 줄 바꿈
            System.out.println();
        }
    }
}
