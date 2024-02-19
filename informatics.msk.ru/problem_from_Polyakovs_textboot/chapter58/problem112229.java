package chapter58;

import java.util.Scanner;

public class problem112229 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPerfect(n)) {
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    System.out.printf("%s ", i);
                }
            }
        } else {
            System.out.println(0);
        }
    }

    public static boolean isPerfect(int n) {
        int k = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                k += i;
            }
        }
        return k == n;
    }
}
