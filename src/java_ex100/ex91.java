package java_ex100;
import java.util.Scanner;

public class ex91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        rotateAndPrint(numbers);

        scanner.close();
    }

    private static void rotateAndPrint(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < i + numbers.length; j++) {
                System.out.print(numbers[j % numbers.length] + " ");
            }
            System.out.println();
        }
    }
}
