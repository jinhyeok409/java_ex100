package java_ex100;
import java.util.Scanner;

public class ex59 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] winningNumbers = new int[7];
        for (int i = 0; i < 7; i++) {
            winningNumbers[i] = scanner.nextInt();
        }

        int[] userNumbers = new int[6];
        for (int i = 0; i < 6; i++) {
            userNumbers[i] = scanner.nextInt();
        }

        int result = checkLottoResult(winningNumbers, userNumbers);
        printResult(result);

        scanner.close();
    }

    public static int checkLottoResult(int[] winningNumbers, int[] userNumbers) {
        int matchingNumbers = 0;
        boolean bonusNumberMatched = false;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (userNumbers[i] == winningNumbers[j]) {
                    matchingNumbers++;
                    break;
                }
            }
        }

        if (matchingNumbers == 5) {
            for (int i = 0; i < 6; i++) {
                if (userNumbers[i] == winningNumbers[6]) {
                    bonusNumberMatched = true;
                    break;
                }
            }
        }

        if (matchingNumbers == 6) {
            return 1; // 1등
        } else if (matchingNumbers == 5 && bonusNumberMatched) {
            return 2; // 2등
        } else if (matchingNumbers == 5) {
            return 3; // 3등
        } else if (matchingNumbers == 4) {
            return 4; // 4등
        } else if (matchingNumbers == 3) {
            return 5; // 5등
        } else {
            return 0; // 꽝
        }
    }

    public static void printResult(int result) {
        if (result == 0) {
            System.out.println("0 꽝!");
        } else {
            System.out.println(result);
        }
    }
}