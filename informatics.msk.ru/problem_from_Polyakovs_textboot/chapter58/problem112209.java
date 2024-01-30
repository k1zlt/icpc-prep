package chapter58;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem112209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (isDivisibleByOwnDigits(i)) {
                System.out.printf("%s ", i);
            }
        }
    }

    public static boolean isDivisibleByOwnDigits(int n) {
        List<Integer> a = new ArrayList<Integer>();
        int n2 = n;
        while (n2 > 0) {
            a.add(n2 % 10);
            n2 /= 10;
        }
        for (Integer i : a) {
            if (i == 0 || n % i != 0) {
                return false;
            }
        }
        return true;
    }
}
