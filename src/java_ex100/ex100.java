package java_ex100;
import java.util.Random;
import java.util.Scanner;

public class ex100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int answer = random.nextInt(100) + 1;
        int guess;

        while (true) {
            System.out.print("숫자를 입력하세요: ");
            guess = scanner.nextInt();

            if (guess == answer) {
                System.out.println("정답입니다.");
                break;
            } else if (guess > answer) {
                System.out.println("더 작은 수를 입력하세요.");
            } else {
                System.out.println("더 큰 수를 입력하세요.");
            }
        }

        scanner.close();
    }
}
