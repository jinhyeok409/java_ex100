package java_ex100;
import java.util.Scanner;

public class ex34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            if (a!=0){
                System.out.println(a);
            }
            else{
                System.out.println(a);
                break;
            }
            continue;
        }
        sc.close();
    }


}