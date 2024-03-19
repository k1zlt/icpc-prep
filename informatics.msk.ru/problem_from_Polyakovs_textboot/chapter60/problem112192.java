package chapter60;

import java.util.Scanner;

public class problem112192 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
    }

    public static  int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}
