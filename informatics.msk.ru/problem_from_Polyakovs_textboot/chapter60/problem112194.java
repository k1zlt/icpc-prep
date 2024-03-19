package chapter60;

import java.util.Scanner;

public class problem112194 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(func(a));
    }

    public static int func(int a) {
        int res = 0;
        while (a > 0) {
            res *= 10;
            res += a % 10;
            a /= 10;
        }
        return res;
    }
}
