package java_ex100;
import java.util.Scanner;

import java.util.Scanner;

public class ex88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n > 50) {
            System.out.println("n은 50 이하여야 합니다.");
            return;
        }

        int sum = calculateSeriesSum(n);
        System.out.println(sum);
    }

    static int calculateSeriesSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
        }

        return sum;
    }
}
