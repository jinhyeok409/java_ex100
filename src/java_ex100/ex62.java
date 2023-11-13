package java_ex100;
import java.util.Scanner;

public class ex62 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grade = scanner.nextInt();

        int classNumber = scanner.nextInt();

        int studentNumber = scanner.nextInt();

        if (grade > 0 && grade <= 3 && classNumber > 0 && classNumber <= 20 && studentNumber > 0 && studentNumber <= 999) {
            System.out.printf("%d%02d%03d\n", grade, classNumber, studentNumber);
        }

        scanner.close();




    }

}
