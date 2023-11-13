package java_ex100;
import java.util.Scanner;

public class ex71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력된 정수의 합 계산
        int sum = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            // 빈 줄을 입력하면 입력 종료
            if (line.isEmpty()) {
                break;
            }

            // 정수로 변환하여 합산
            try {
                int num = Integer.parseInt(line);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("정수를 입력하세요.");
            }
        }

        // 결과 출력
        System.out.println(sum);

        // Scanner 닫기
        scanner.close();


    }
}
