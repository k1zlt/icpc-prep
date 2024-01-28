//package chapter57;

import java.util.Scanner;

public class problem112168 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
//        System.out.println(y > Math.pow(x, 2) - 2);
//        System.out.println(y < x);
//        System.out.println(y < -x);
        if (y > Math.pow(x, 2) - 2) {
            if (y < x || y < -x) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
