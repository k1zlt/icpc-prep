//package chapter58;

import java.util.Scanner;

public class problem112219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = 0;
        while (a + b != Math.max(a, b)) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
            k += 1;
        }
        System.out.printf("%s %s", Math.max(a, b), k);
    }
}
