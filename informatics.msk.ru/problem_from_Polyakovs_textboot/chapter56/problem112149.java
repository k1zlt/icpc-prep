package chapter56;

import java.util.Scanner;

public class problem112149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.printf("%.3f", Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2)));
    }
}
