package lab10;

import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class Ex2 {


    public static void main(String[] args) {
        //max
        int max = Max(10,20);
        System.out.println("The maximum number is : "+max);
        //min
        System.out.println("The maximum number is : "+Min(10,20 ));
        //Multiple
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer 1:");
        int num1 =sc.nextInt();
        System.out.print("Enter an integer 2:");
        int num2 =sc.nextInt();

        int mul = Multiple(num1,num2);
    }
    private static int Multiple(int num1, int num2) {
        return num1*num2;
    }

    private static int Max(int x, int y) {
        int rs;
        if(x > y)
            rs =x;
        else
            rs = y;
        return rs;
    }
    private static int Min(int x, int y) {
        int rs;
        if (x<y)
            rs = x;
        else
            rs = y;
        return rs;
    }//min

}
