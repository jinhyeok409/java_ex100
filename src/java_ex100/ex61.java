package java_ex100;
import java.util.Scanner;

public class ex61 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 터널 a, b, c의 높이를 입력받습니다.
        int a = scanner.nextInt();
        String scansign  = scanner.next();
        int b = scanner.nextInt();
        int c = 0;

        char sign = scansign.charAt(0);

        if (sign == '+')
        {
            c = a+b;
            System.out.printf("%d",c);
        } else if ( sign == '-') {
            c = a-b;
            System.out.printf("%d",c);
        }else if ( sign == '*') {
            c = a*b;
            System.out.printf("%d",c);
        }else if ( sign == '/') {
            c = a/b;
            System.out.printf("%d",c);
        }




    }

}
