package chapter56;

import java.util.Scanner;

public class problem112146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        System.out.printf("%.3f%n", Math.PI * Math.pow(r, 2));
        System.out.printf("%.3f", Math.PI * 2 * r);
    }
}
