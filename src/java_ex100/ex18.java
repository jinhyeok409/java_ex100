package java_ex100;
import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c = str.charAt(0);
		int num = (int)c;
		
		System.out.printf("%d", num);
		sc.close();
		
	}

}
