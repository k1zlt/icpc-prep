//package chapter56;

import java.util.Scanner;

public class problem112148 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int f = n / 100;
        int s = n / 10 - 10 * f;
        int t = n - f * 100 - s * 10;
        System.out.printf("%s %s %s", f, s, t);
    }
}
