package java_ex100;
import java.util.Scanner;

public class ex57 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menu1 = scanner.nextInt();
        int menu2 = scanner.nextInt();

        int[] calories = {400, 340, 170, 100, 70};

        int totalCalories = calories[menu1 - 1] + calories[menu2 - 1];

        if (totalCalories > 500) {
            System.out.println("angry");
        } else {
            System.out.println("no angry");
        }

        scanner.close();
    }
}
