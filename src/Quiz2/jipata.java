package Quiz2;

import java.util.Scanner;

public class jipata {
    private static void Continue(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want to Continue (Y/N): ");
        char c = sc.next().charAt(0);
        if (c =='Y' || c =='y')showOption();
        else {
            System.out.println("Good Bye.");
            System.exit(1);}
    }
    public static void main(String[] args) {
        showOption();
    }
    private static void showOption(){
        Scanner sc = new Scanner(System.in);
        int select;
        do {
            System.out.println("#### Welcome to Jipata System ####");
            System.out.println("Please, select options below: ");
            System.out.println("1. Body Mass Index(BMI)");
            System.out.println("2. Geometry Capacity");
            System.out.println("3. Working with Array");
            System.out.println("4. Exit");
            System.out.print("Select: ");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    BMI();
                    break;
                case 2:
                    GenometryCapasity();
                    break;
                case 3:
                    WorkingWithArray();
                    break;
                case 4:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Please, select 1-4.");
            }
        }while (select < 1 || select > 4) ;

    }

    private static void WorkingWithArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t1. Array 1D");
        System.out.println("\t2. Array 2D");
        System.out.print("\tSelect: ");
        int select = sc.nextInt();
        if (select ==1)
            Array1D();
        else Array2D();

    }

    private static void Array2D() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many row: ");
        int row = sc.nextInt();
        System.out.print("How many column: ");
        int column = sc.nextInt();
        int myArray[][] = new int[row][column];
        //input data
        double total = 0.0;
        for (int i = 0; i < myArray.length ; i++) {
            for(int j = 0; j<myArray[i].length;j++) {
                System.out.print("Enter integer " + (i + 1) + ": ");
                myArray[i][j] = sc.nextInt();
                total += myArray[i][j];
            }
        }
        System.out.println("The average value of array 2D: "+(total/(row*column)));

        Continue();
    }

    private static void Array1D() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many data: ");
        int size = sc.nextInt();
        int myArray[] = new int[size];
        //input data
        double total = 0.0;
        for (int i = 0; i < myArray.length ; i++) {
            System.out.print("Enter integer "+(i+1)+": ");
            myArray[i] = sc.nextInt();
            total += myArray[i];
        }
        showArray(myArray);
        System.out.println("The average value in array: "+(total/myArray.length));

        Continue();
    }

    private static void showArray(int[] myArray) {
        System.out.print("Data in array");
        for (int val: myArray) {
            System.out.print(val+" ");
        }
        System.out.println();
    }

    private static void GenometryCapasity() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t1. Circle");
        System.out.println("\t2. Pyramid");
        System.out.print("\tSelect: ");
        int select = sc.nextInt();
        if (select ==1)
            Circle();
        else Pyramid();

    }

    private static void Pyramid() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width: ");
        double w = sc.nextDouble();
        System.out.print("Enter Length: ");
        double l = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        //System.out.println(w+" "+h);
        double x = (1.0 / 3.0) * (w * l) * h;
        System.out.println("The capacity of Pyramid is: "+x);

        Continue();

    }

    private static void Circle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius (r): ");
        double r = sc.nextDouble();

        double v = (4.0 / 3.0) * 3.141 * (r * r * r);
        System.out.println("The capacity of Circle is: "+v);

        Continue();
    }


    private static void BMI() {
        Scanner sc = new Scanner(System.in);
        //input data
        System.out.print("Input your weight(kg.): ");
        double w = sc.nextDouble();
        System.out.print("Input your height(cm.): ");
        double h = sc.nextDouble();
        h = h/100;

        double bmi = w / (h * h);
        System.out.println("Your BMI is : " + bmi);

        //Continue?
        Continue();
    }
}





