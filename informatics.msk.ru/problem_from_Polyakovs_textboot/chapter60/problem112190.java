package chapter60;

import java.util.Scanner;

public class problem112190 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        System.out.printf("%d %d%n", get_min(a, b, c, d, e), get_max(a, b, c, d, e));
        System.out.printf("%.2f", ((float)get_sum(a, b, c, d, e) - get_min(a, b, c, d, e) - get_max(a, b, c, d, e))/3);
    }

    public static int get_min(int a, int b, int c, int d, int e) {
        return Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
    }

    public static int get_max(int a, int b, int c, int d, int e) {
        return Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);
    }

    public static int get_sum(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }
}
