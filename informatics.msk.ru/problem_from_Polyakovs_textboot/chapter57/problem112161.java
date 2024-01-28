package chapter57;

import java.util.Scanner;

public class problem112161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 12 || a == 1 || a == 2) {
            System.out.println("winter");
        } else if (a >= 3 && a <= 5) {
            System.out.println("spring");
        } else if (a >= 6 && a <= 8) {
            System.out.println("summer");
        } else if (a >= 9 && a <= 11) {
            System.out.println("autumn");
        } else {
            System.out.println("NO");
        }
    }
}
