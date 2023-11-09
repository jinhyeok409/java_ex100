package java_ex100;
import java.util.Scanner;

public class ex53 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double sum = a + b;
        double difference1 = a - b;
        double difference2 = b - a;
        double product = a * b;
        double quotient1 = a / b;
        double quotient2 = b / a;
        double power1 = Math.pow(a, b);
        double power2 = Math.pow(b, a);

        double maxResult = Math.max(sum, Math.max(difference1, Math.max(difference2, Math.max(product, Math.max(quotient1, Math.max(quotient2, Math.max(power1, power2)))))));

        System.out.printf("%.6f\n", maxResult);

        scanner.close();
    }
}
