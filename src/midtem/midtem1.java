package midterm;

import java.util.Scanner;

public class midtem1{
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("Input Your Number 1 : ");
        int number1 = Keyboard.nextInt();
        System.out.print("Input Your Number 2 : ");
        int number2 = Keyboard.nextInt();
        System.out.println("Sum : "+(number1+number2));
    }

}
