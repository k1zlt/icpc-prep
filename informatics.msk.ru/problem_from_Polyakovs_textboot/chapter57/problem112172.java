package chapter57;

import java.util.Scanner;

public class problem112172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (
                (y < 1 && y > x - 1 && x > 0) ||
                (Math.pow(x, 2) + Math.pow(y, 2) < 1 && x > 0)
        ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
