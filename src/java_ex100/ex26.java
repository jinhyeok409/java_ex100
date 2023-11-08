package java_ex100;
import java.util.*;

public class ex26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isTrue;
        isTrue = sc.nextBoolean();

        if (isTrue == true)
        {
            System.out.println(false);
        }
        else if (isTrue == false)
        {
            System.out.println(true);
        }
        sc.close();
    }

}