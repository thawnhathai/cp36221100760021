package leb4;

import java.util.Scanner;

public class Exinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please,enter an integer:");
        int x = scanner.nextInt();
        System.out.println("Your entered integer: "+x);

        //input double
        System.out.print("Please,enter double: ");
        double y = scanner.nextInt();

        System.out.print("Your entered integer"+y);

        //input string
          System.out.println("Please,enter you name");
          String S = scanner.nextLine();

          System.out.println("You name is:"+S);
    }
}
