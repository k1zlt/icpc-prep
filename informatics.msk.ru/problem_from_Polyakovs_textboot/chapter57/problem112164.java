package chapter57;

import java.util.Scanner;

public class problem112164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.printf("%s%s%s%s", isinA(x, y), isinB(x, y), isinC(x, y), isinD(x, y));
    }

    public static int isinA(double x, double y) {
        if (y <= 1) return 1;
        return 0;
    }
    public static int isinB(double x, double y) {
        if (y <= -x) return 1;
        return 0;
    }
    public static int isinC(double x, double y) {
        if (x * x + y * y <= 1) return 1;
        return 0;
    }
    public static int isinD(double x, double y) {
        if (Math.pow(x-1, 2) + Math.pow(y, 2) <= 1) return 1;
        return 0;
    }
}
