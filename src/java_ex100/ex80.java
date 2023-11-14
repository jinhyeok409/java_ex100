package java_ex100;
import java.util.Scanner;

public class ex80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        System.out.print("씨저 암호를 입력하세요: ");
        String cipherText = scanner.nextLine();

        // 복호화 후 출력
        String plainText = decryptCaesarCipher(cipherText);
        System.out.println("복호화가 된 평문: " + plainText);
    }

    // 씨저 암호 복호화 함수
    public static String decryptCaesarCipher(String cipherText) {
        StringBuilder plainText = new StringBuilder();

        for (char ch : cipherText.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                // 대문자인 경우 알파벳을 3글자 앞으로 이동
                char decryptedChar = (char) ((ch - 'A' - 3 + 26) % 26 + 'A');
                plainText.append(decryptedChar);
            } else if (Character.isLowerCase(ch)) {
                // 소문자인 경우 알파벳을 3글자 앞으로 이동
                char decryptedChar = (char) ((ch - 'a' - 3 + 26) % 26 + 'a');
                plainText.append(decryptedChar);
            } else {
                // 알파벳이 아닌 경우 그대로 추가
                plainText.append(ch);
            }
        }

        return plainText.toString();
    }
}
