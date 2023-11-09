package java_ex100;
import java.util.Scanner;

public class ex45 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a, b, c 값 입력 받기
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 판별식 계산
        double discriminant = b * b - 4 * a * c;

        // 해 계산
        if (discriminant > 0) {
            // 두개의 실근
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("%.2f\n%.2f\n", root1, root2);
        } else if (discriminant == 0) {
            // 중근
            double root = -b / (2 * a);
            System.out.printf("%.2f\n", root);
        } else {
            // 허근
            System.out.println("실근이 없습니다.");
        }


    }
}
