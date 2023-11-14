package java_ex100;
import java.util.Scanner;

public class ex93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = new String[7];
        for (int i = 0; i < 7; i++) {
            words[i] = scanner.next();
        }

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        System.out.print("몇 번째 단어를 물어볼까요? ");
        int k = scanner.nextInt();

        System.out.println(k + "번째 단어는 " + words[k - 1] + "입니다.");

        scanner.close();
    }
}
