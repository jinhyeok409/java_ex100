package java_ex100;
import java.util.Scanner;

public class ex72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            if (num > maxValue) {
                maxValue = num;
            }
        }

        scanner.close();


    }
}
