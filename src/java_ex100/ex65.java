package java_ex100;
import java.util.Scanner;

public class ex65 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i=1; i<=a; i++){
            if(i%3 == 0)System.out.printf("X ");
            else System.out.printf(i+ " ");
        }
    }
}
