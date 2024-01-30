package chapter58;

import java.util.Scanner;

public class problem112217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 != 0) n -= 1;
        boolean result = false;
        while (n > 0) {
            System.out.printf("%s ", (int)Math.pow(2, n));
            result = true;
            n -= 2;
        }
        if (!result) {
            System.out.println(0);
        }
    }
}
