package java_ex100;
import java.util.Scanner;

public class ex81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 최대값과 최소값 초기화
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // 5개의 정수 입력받기
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();

            // 최대값과 최소값 업데이트
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        // 최대값과 최소값 출력
        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);
    }
}
