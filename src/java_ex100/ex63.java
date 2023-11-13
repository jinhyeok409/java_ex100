package java_ex100;
import java.util.Scanner;

public class ex63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();

        System.out.printf("%d", day*24);

        scanner.close();
    }
}
