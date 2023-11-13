package java_ex100;
import java.util.Scanner;

public class ex73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] value = {1, 10, 2, 20, 3, 30, 4, 40, 5, 50, 6, 60, 7, 70, 8, 80, 9, 90, 10, 100, 11, 110, 12, 120};
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int sum = value[n1-1] + value[n2-1];

        System.out.printf("%d",sum);
        scanner.close();

    }
}
