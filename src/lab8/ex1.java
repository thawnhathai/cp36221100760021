package Lab8;

public class ex1 {
    public static void main(String[] args) {

        int[] number = new int[5];
        System.out.println(number.length);

        number[4] = 10;
        number[1] = number[4]*2;

        for (int i:number) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i < number.length ; i++) {
            System.out.print(number[i]+" ");
        }




    }//main
}//class
