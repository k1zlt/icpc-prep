package chapter60;

import java.util.Scanner;

public class problem112196 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (areFriends(a, b)) System.out.println("YES");
        else System.out.println("NO");
    }

    public static boolean areFriends(int a, int b) {
        return getDivisorsSum(a) == b && getDivisorsSum(b) == a;
    }

    public static int getDivisorsSum(int a) {
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

