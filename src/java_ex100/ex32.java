package java_ex100;
import java.util.Scanner;

public class ex32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = str.charAt(0);
        checkreputation(c);

        sc.close();
    }

    public static void checkreputation (char score){
        switch (score)
        {
            case 'A':
                System.out.println("best!!!");
                break;
            case 'B':
                System.out.println("good!");
                break;
            case 'C':
                System.out.println("run!");
                break;
            case 'D':
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
        }
    }

}