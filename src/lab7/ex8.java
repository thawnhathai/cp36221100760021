package Lab7;

public class ex8 {
    public static void main(String[] args) {

        for (int i = 8; i >=1; i--) {
            for (int j = 8; j >= i; j--) {
                System.out.print("*");
            }//for j
        }
        System.out.println();

        for (int i = 1; i <=8 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.println(j+"");
            }//for j
            System.out.println();
        }//for i
        System.out.println("\n\n");

        int count =1;
        for (int i = 1; i <=8 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(count + " ");
                count++;
            }//for
            System.out.println();
        }//for



    }
}

