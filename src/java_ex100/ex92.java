package java_ex100;
import java.util.Scanner;

public class ex92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        try {
            System.out.println("3초 동안 숫자를 기억하세요...");
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        System.out.print("몇 번째 숫자를 물어볼까요? ");
        int k = scanner.nextInt();

        System.out.println(k + "번째 숫자는 " + numbers[k - 1] + "입니다.");

        scanner.close();
    }
}
