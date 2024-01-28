package chapter57;

import java.util.Scanner;

public class problem112167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (y < 2 - Math.pow(x, 2)) {
            if (y > x || y > 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
