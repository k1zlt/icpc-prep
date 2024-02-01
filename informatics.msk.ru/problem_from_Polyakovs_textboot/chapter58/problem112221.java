package chapter58;

import java.util.Scanner;

public class problem112221 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            sum += input;
            product *= input;
        }
        System.out.printf("%s %s", sum, product);
    }
}
