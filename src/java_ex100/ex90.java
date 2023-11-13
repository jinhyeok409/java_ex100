package java_ex100;
import java.util.Scanner;

public class ex90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 출석 번호를 입력받을 횟수
        int n = 10;
        // 출석 번호를 저장할 배열
        int[] numbers = new int[n];

        // 출석 번호를 입력받아 배열에 저장
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 출석 번호를 거꾸로 출력
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}


