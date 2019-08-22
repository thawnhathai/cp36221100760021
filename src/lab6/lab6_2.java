package lab6;

import java.util.Scanner;

public class lab6_2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double i;
       System.out.print("Input length in inch: ");
       i = sc.nextDouble();
       double m = i*0.0254;
       System.out.print(i+ "inch is equal to "+m+"meters.");
    }
}
