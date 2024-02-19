package chapter58;

import java.util.Scanner;

public class problem112228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean printed = false;
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.printf("%s ", i);
                printed = true;
            }
        }
        if (!printed) System.out.println(0);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
