package java_ex100;
import java.util.Scanner;

public class ex82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 시작 단과 마지막 단 입력받기
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        // 구간의 구구단 출력
        printMultiplicationTable(start, end);
    }

    // 구간의 구구단 출력 함수
    public static void printMultiplicationTable(int start, int end) {
        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }

            System.out.println(); // 각 단 출력 후 빈 줄 추가
        }
    }
}

