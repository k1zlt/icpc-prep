package chapter58;

import java.util.Scanner;

public class problem112206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i * i;
        }
        System.out.println(sum);
    }
}
