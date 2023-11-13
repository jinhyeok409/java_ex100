package java_ex100;

import java.util.Scanner;

public class ex83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 정수 n 입력받기
        System.out.print("삼각형의 높이(n)를 입력하세요: ");
        int n = scanner.nextInt();

        // 삼각형 출력
        printTriangle(n);
    }

    // 삼각형 출력 함수
    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            // 별표 출력
            for (int j = 1; j <= i; j++) {
                if(j==1)
                {
                    System.out.print("-");
                }
                else {
                    System.out.print("*");
                }
            }

            // 줄 바꿈
            System.out.println();
        }
    }
}
