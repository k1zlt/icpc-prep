package chapter59;

import java.util.Scanner;

public class problem112188 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        if (n == 1) {
            System.out.println("1");
            return;
        }
        if (n == 2) {
            System.out.println("1 1");
            return;
        }
        System.out.printf("%d %d ", a, b);
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.printf("%d ", c);
            a = b;
            b = c;
        }
    }
}
