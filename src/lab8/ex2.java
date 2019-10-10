package Lab8;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        int num[] = new int[5];

        //input data to array
        for (int i = 0; i < num.length ; i++) {

            System.out.print("Enter an integer["+(i+1)+"]:");
            num[i] = SC.nextInt();
        }//for

        //show data in array
        System.out.print("Data in array: ");
        for (int i:num){
            System.out.print(i+" ");
        }

        //find maximum

        int max = num[0];
        for (int i:num){
            if (max < i)
                max = i;
        }
        System.out.println("\nThe maximum number: "+max);


        //find minimum
        int min = num[0];
        for (int i:num){
            if (min > i)
                min = i;
        }
        System.out.println("The minimum number: "+min);

        //find average
        int total = 0;
        for(int i:num){
            total+= i;
        }
        System.out.println("The average number:"+(total/num.length));
    }
}







