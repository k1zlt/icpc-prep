package chapter58;

import java.util.Scanner;

public class problem112230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 6) {
            System.out.println(0);
        } else if (n < 28) {
            System.out.println("6");
        } else if (n < 496) {
            System.out.println("6 28");
        } else if (n < 8128) {
            System.out.println("6 28 496");
        } else if (n < 33550336) {
            System.out.println("6 28 496 8128");
        } else {
            System.out.println("6 28 496 8128 33550336");
        }
    }
}
