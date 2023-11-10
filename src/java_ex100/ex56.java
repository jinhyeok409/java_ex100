package java_ex100;
import java.util.Scanner;

public class ex56 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int flippedCount = 0;
        for (int i = 0; i < 4; i++) {
            int state = scanner.nextInt();
            if (state == 1) {
                flippedCount++;
            }
        }

        String result;
        if (flippedCount == 0) {
            result = "모";
        } else if (flippedCount == 1) {
            result = "도";
        } else if (flippedCount == 2) {
            result = "개";
        } else if (flippedCount == 3) {
            result = "걸";
        } else {
            result = "윷";
        }

        System.out.println(result);

        scanner.close();
    }
}
