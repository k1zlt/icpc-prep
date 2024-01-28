//package chapter57;

import java.util.Scanner;

public class problem112171 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (
                (x < 1) &&
                (y > 1 - x) &&
                (((y < 2 * Math.pow(x, 2) && x > 0.5 && x < 1)) || (y > 2 * Math.pow(x, 2)))
        ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}