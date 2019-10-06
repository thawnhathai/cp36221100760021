package lab7;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        int score;
        do {
            System.out.println("Enter your score," + "and I will tell you grade: ");

            score = SC.nextInt();


            if (score >= 0 && score < 50)
                System.out.println("Grade F.");
            else if (score >= 50 && score < 55)
                System.out.println("Grade D.");
            else if (score >= 55 && score < 60)
                System.out.println("Grade D+.");
            else if (score >= 60 && score < 65)
                System.out.println("Grade C.");
            else if (score >= 65 && score < 70)
                System.out.println("Grade C+.");
            else if (score >= 70 && score < 75)
                System.out.println("Grade B.");
            else if (score >= 75 && score < 80)
                System.out.println("Grade B+.");
            else if (score >= 80 && score <= 100)
                System.out.println("Grade A.");
            else
                System.out.println("กรุณากรอกคะแนนในช่วง 0-100.");
        }while (!(score >= 0 && score <=100));
    }
}
