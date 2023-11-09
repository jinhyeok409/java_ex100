package java_ex100;
import java.util.Scanner;

public class ex50 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // BMI 수치 입력 받기
        double bmi = scanner.nextDouble();

        // 비만 판정
        String result;
        if (bmi < 18.5) {
            result = "저체중";
        } else if (bmi >= 18.5 && bmi <= 23) {
            result = "정상체중";
        } else {
            result = "과체중";
        }

        System.out.println(result);


    }
}
