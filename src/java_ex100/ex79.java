package java_ex100;
import java.util.Scanner;

public class ex79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        String input = scanner.nextLine();

        // 대소문자 변환 후 출력
        String result = changeCase(input);
        System.out.println (result);
    }

    // 대소문자 변환 함수
    public static String changeCase(String sentence) {
        StringBuilder result = new StringBuilder();

        for (char ch : sentence.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(Character.toUpperCase(ch));
            }
        }

        return result.toString();
    }
}

