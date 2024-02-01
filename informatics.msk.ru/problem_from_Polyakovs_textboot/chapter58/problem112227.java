package chapter58;

import java.util.Scanner;

public class problem112227 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            System.out.println("1 1");
        } else {
            System.out.print("1 1 ");
            int f = 1;
            int s = 1;
            for (int k = 2; k < n; k ++) {
                s = s + f;
                f = s - f;
                System.out.printf("%s ", s);
            }
        }
    }
}
