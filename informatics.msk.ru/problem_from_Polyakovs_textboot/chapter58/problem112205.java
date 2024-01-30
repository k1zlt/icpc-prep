package chapter58;

import java.util.Scanner;

public class problem112205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            System.out.printf("%s*%s=%s%n", i, i, i*i);
        }
    }
}
