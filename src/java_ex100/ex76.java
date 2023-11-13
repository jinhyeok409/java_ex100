package java_ex100;
import java.util.Scanner;

public class ex76 {
    public static void main(String[] args) {
        // 입력 받기
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a = number/10;
        int b = number%10;
        int result = (int) Math.pow(a,b);

        System.out.printf("%d",result);
    }
}
