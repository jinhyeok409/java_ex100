package java_ex100;
import java.util.Scanner;

public class ex95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        int[] alphabetCount = new int[26];

        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                alphabetCount[c - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            char currentChar = (char) ('a' + i);
            System.out.println(currentChar + ":" + alphabetCount[i]);
        }

        scanner.close();
    }
}