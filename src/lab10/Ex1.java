package lab10;

public class Ex1 {

    public static void B (int x){
        System.out.println("Hell B"+x);
    }//B

    public static void main(String[] args){
        System.out.println("Hell Main");
        A();
        A();
        B(10);
        int s =c(10,20);
        System.out.println(s);
        System.out.println(c (50,50)*5);
    }//main
    public static void A(){
     System.out.println("Hell A");
    }//A
    public static  int c(int x, int y){
      int Z =x+y;
      System.out.println("Hello c "+Z);
      B(Z);

      return Z;
    }
}
