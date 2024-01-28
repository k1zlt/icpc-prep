package chapter57;

import java.util.Scanner;

public class problem112169 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (Math.pow(x, 2) + Math.pow(y, 2) < 1) {
            if (y > x || x < 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
