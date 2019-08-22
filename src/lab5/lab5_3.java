package lab5;

import java.util.Scanner;

public class lab5_3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int day;
            long hr,minute,seconds;
            System.out.println("Enter second:");
            long input_second =sc.nextLong(); //1000000 s

            day = (int) (input_second / (60 * 60 * 24));
            System.out.println("Day: "+day);

            hr = (input_second - (day * 60 * 60 * 24)) / (60 * 60);
            System.out.println("H: "+day);
        }
    }

