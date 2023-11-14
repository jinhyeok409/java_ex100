package java_ex100;
import java.util.Arrays;
import java.util.Scanner;

public class ex97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int c = scanner.nextInt();

        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        // 키 오름차순으로 정렬
        Arrays.sort(heights);

        // 자리 배치 출력
        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(heights[i] + " ");
            count++;

            if (count == c) {
                System.out.println();
                count = 0;
            }
        }

        scanner.close();
    }
}