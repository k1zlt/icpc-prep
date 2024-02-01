package chapter58;

import java.util.Scanner;

public class problem112222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int product = 1;
        while (true) {
            int input = sc.nextInt();
            if (input == 0) break;
            sum += input;
            product *= input;
        }
        System.out.printf("%s %s", sum, product);
    }
}
