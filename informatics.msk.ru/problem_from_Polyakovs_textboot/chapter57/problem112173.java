package chapter57;

import java.util.Scanner;

public class problem112173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (
                (Math.pow(x, 2) + Math.pow(y, 2) < 1) ||
                        (y < 1 && y > 0 && x > 0 && x < 1)
        ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
