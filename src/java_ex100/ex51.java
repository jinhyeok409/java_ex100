package java_ex100;
import java.util.Scanner;

public class ex51 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();  // 휴지통의 자동 압축 기준인 수치 n을 입력 받습니다.

        // 압축 알고리즘 적용
        int compressedValue = ((n % 10) * 10 + (n / 10)) * 2;

        // 결과 출력
        System.out.println(compressedValue);

        // 압축된 값이 50 이하인지를 확인하여 출력
        if (compressedValue <= 50) {
            System.out.println("GOOD");
        } else {
            System.out.println("OH MY GOD");
        }

        scanner.close();


    }
}
