package java_ex100;
import java.util.Scanner;

public class ex78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 초기값 설정
        int result = scanner.nextInt();

        // 연산자에 따라 계산
        while (true) {
            char operator = scanner.next().charAt(0);

            // = 입력 시 계산 종료
            if (operator == '=') {
                break;
            }

            int operand = scanner.nextInt();

            switch (operator) {
                case '+':
                    result += operand;
                    break;
                case '-':
                    result -= operand;
                    break;
                case '*':
                    result *= operand;
                    break;
                case '/':
                    result /= operand;
                    break;
            }
        }

        // 결과 출력
        System.out.println(result);
    }
}
