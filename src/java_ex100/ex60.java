package java_ex100;
import java.util.Scanner;

public class ex60 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 터널 a, b, c의 높이를 입력받습니다.
        int heightA = scanner.nextInt();
        int heightB = scanner.nextInt();
        int heightC = scanner.nextInt();

        // 차의 높이
        int carHeight = 170;

        if (heightA <= carHeight) {
            System.out.println("CRASH " + heightA);
        } else if (heightB <= carHeight) {
            System.out.println("CRASH " + heightB);
        } else if (heightC <= carHeight) {
            System.out.println("CRASH " + heightC);
        } else {
            System.out.println("PASS");
        }
    }

}
