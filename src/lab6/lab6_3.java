package lab6;

import java.util.Scanner;

public class lab6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input your weight(kg.): ");
        double w = sc.nextDouble();
        System.out.println("Input your height(cm.): ");
        double h = sc.nextDouble();
        h = h/100;


        double bmi = w / (h * h);
        System.out.println("Your BMI is : " + bmi);
    }
}
