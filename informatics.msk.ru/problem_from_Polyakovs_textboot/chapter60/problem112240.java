package chapter60;

import java.util.Scanner;

public class problem112240 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == getDivisorsSum(i)) System.out.println("YES");
        else System.out.println("NO");
    }

    public static int getDivisorsSum(int a) {
        int sum = 0;
        for (int i = 1; i < a; i ++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
