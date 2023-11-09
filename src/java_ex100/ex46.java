package java_ex100;
import java.util.Scanner;

public class ex46 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hei1 = sc.nextInt();
        int hei2 = sc.nextInt();
        int hei3 = sc.nextInt();

        checkheight(hei1);
        checkheight(hei2);
        checkheight(hei3);
        sc.close();


    }

    public static void checkheight (int height){
        if (height > 170){
            System.out.println("PASS");
        }
        else {
            System.out.println("CRASH");
        }
    }
}
