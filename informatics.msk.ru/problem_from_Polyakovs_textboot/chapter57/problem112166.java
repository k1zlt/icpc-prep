package chapter57;

import java.util.Scanner;

public class problem112166 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (y < 0.5 && y < Math.sin(x) && x > 0 && x < 2 * Math.PI && y > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
