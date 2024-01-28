package chapter56;

import java.util.Scanner;

public class problem112147 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double two = a * a;
        double four = two * two;
        System.out.printf("%.3f%n", four * four * two);
    }
}
