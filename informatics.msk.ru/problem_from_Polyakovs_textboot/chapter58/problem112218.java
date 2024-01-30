//package chapter58;

import java.util.Scanner;

public class problem112218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 4;
        if (k > n) {
            System.out.println(0);
            return;
        }
        while (n >= k) {
            k *= 4;
        }
        k /= 4;
        while (k >= 4) {
            System.out.printf("%s ", k);
            k /= 4;
        }
    }
}
