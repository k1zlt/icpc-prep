package chapter60;

import java.util.Scanner;

public class problem112200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        if (isHyperPrime(in)) {
            System.out.println("YES");
        } else System.out.println("NO");
    }

    public static boolean isHyperPrime(int a) {
        while (a != 0) {
            if (!isPrime(a)) {
                return false;
            }
            a /= 10;
        }
        return true;
    }

    public static boolean isPrime(int a) {
        if (a == 1) return false;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
}
