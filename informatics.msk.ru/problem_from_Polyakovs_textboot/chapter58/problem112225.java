package chapter58;

import java.util.Scanner;

public class problem112225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int product = a;
        for (int i = 1; i < n; i++) product *= a;
        System.out.println(product);
    }
}
