package java_ex100;
import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 1;
		
		for (int i = 0; i < b; i++) {
			sum = sum * 2;
		}
		
		sum = sum * a;
		
		System.out.printf("%d\n",sum);
		
		sc.close();
		
	}

}
