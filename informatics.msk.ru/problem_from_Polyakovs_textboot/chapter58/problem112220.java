package chapter58;

import java.util.Scanner;

public class problem112220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = 0;

        while (a != 0 && b != 0) {
            int bigger = Math.max(a, b);
            int smaller = Math.min(a, b);
            bigger = bigger % smaller;
            a = bigger;
            b = smaller;
            k += 1;
        }
        System.out.printf("%s %s", a + b, k);
    }
}
