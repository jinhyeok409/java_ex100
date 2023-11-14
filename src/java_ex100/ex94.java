package java_ex100;
import java.util.Scanner;

public class ex94 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int openCount = 0;
        int closeCount = 0;

        for (char c : input.toCharArray()) {
            if (c == '(') {
                openCount++;
            } else if (c == ')') {
                closeCount++;
            }
        }

        System.out.println(openCount + " " + closeCount);

        scanner.close();
    }
}
