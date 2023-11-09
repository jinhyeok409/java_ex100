package java_ex100;
import java.util.Scanner;

public class ex49 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 시와 분 입력 받기
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        // 30분 빼기
        minute -= 30;

        // 분이 음수가 되면 시간에서 1 빼주고 분을 조정
        if (minute < 0) {
            hour -= 1;
            minute += 60;
        }

        // 시가 음수가 되면 23으로 조정
        if (hour < 0) {
            hour = 23;
        }

        System.out.println(hour + " " + minute);


    }
}
