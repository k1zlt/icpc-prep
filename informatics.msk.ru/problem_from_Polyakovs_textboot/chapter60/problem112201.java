package chapter60;

import java.util.Scanner;

public class problem112201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        boolean resultPrinted = false;
        for (int i = start; i <= end; i++) {
            if (isHyperPrime(i)) {
                resultPrinted = true;
                System.out.printf("%s ", i);
            }
        }
        if (!resultPrinted) System.out.println(0);
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
