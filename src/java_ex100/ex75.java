package java_ex100;
import java.util.Scanner;
import java.util.Scanner;

public class ex75 {
    public static void main(String[] args) {
        // 입력 받기
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // 소수 판단 및 출력
        if (isPrime(number)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // 약수가 있으면 소수가 아님
            }
        }

        return true; // 약수가 1과 자기 자신 뿐이면 소수
    }
}
