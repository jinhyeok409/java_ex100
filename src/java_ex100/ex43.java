package java_ex100;
import java.util.Scanner;

public class ex43 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 양의 정수 n 입력 받기
        int n = sc.nextInt();

        // 한글 숫자 표현 배열
        String[] koreanNumbers = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
        String[] unit1 = {"", "십", "백", "천"};
        String[] unit2 = {"", "만", "억", "조", "경"};

        // 입력된 수를 문자열로 변환하여 자릿수별로 한글로 변환
        String nStr = Integer.toString(n);
        int len = nStr.length();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < len; i++) {
            int digit = nStr.charAt(i) - '0';
            if (digit != 0) {
                result.append(koreanNumbers[digit]);
                result.append(unit1[(len - 1 - i) % 4]);
            }
            if ((len - 1 - i) % 4 == 0) {
                result.append(unit2[(len - 1 - i) / 4]);
            }
        }

        System.out.println(result.toString());
    }
}
