package chapter60;

import java.util.Scanner;

public class problem112193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.abs(lcm(a, b)));
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
