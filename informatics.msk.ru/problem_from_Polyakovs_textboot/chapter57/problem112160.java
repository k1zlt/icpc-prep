package chapter57;

import java.util.Scanner;

public class problem112160 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a == b && a == c) {
            System.out.println(3);
        } else if (a != b && a != c && b != c) {
            System.out.println(0);
        } else {
            System.out.println(2);
        }
    }
}
