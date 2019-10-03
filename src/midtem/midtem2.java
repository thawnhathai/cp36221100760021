package midtem;

import java.util.Scanner;

public class midtem2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        final double PI = 3.141;

        System.out.println("กรุณากรอกตัวเลขของรัศมี:");
        double r = sc.nextDouble();

        double Area = PI * r * r;
        System.out.println("พื้นที่ฐานของทรงกระบอก: " + Area);

        double h = 2 * PI * r;
        System.out.println("ความสูงของทรงกระบอก: " + h);

        double v = (4 / 3) * PI * r * r * r;
        System.out.println("ปริมาตรของทรงกระบอก: " + v);

    }
}