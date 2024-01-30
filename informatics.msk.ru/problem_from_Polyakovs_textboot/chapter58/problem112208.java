package chapter58;

import java.util.Scanner;

public class problem112208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        boolean l = false;
        for (int i = 10000; i < 99999; i++) {
            if (i % a == b && i % c == d) {
                System.out.printf("%s ", i);
                l = true;
            }
        }
        if (!l) System.out.println(-1);
    }
}
