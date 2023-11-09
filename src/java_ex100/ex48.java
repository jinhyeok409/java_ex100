package java_ex100;
import java.util.Scanner;

public class ex48 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 주민등록번호 입력 받기
        String jumin = scanner.next();
        // 성별 정보 입력 받기
        int gender = scanner.nextInt();

        // 주민등록번호에서 생년월일 추출
        int year = Integer.parseInt(jumin.substring(0, 2));

        // 기준년도 설정 (2018년)
        int baseYear = 2012;

        // 성별 정보에 따라 출생 년도 계산
        if (gender == 1 || gender == 2) {
            year += 1900;
        } else if (gender == 3 || gender == 4) {
            year += 2000;
        }

        // 현재 나이 계산
        int age = (baseYear - year) + 1;

        System.out.println(age);

    }
}
