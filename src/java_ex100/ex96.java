package java_ex100;
import java.util.Scanner;
import java.util.Arrays;

public class ex96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[n];
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
            scores[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int[] sortedScores = Arrays.copyOf(scores, n);
        Arrays.sort(sortedScores);
        int thirdHighestScore = sortedScores[n - 3];

        for (int i = 0; i < n; i++) {
            if (scores[i] == thirdHighestScore) {
                System.out.println(names[i]);
                break;
            }
        }

        scanner.close();
    }
}
