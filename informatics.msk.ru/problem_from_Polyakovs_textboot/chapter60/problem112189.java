package chapter60;

import java.util.Scanner;

public class problem112189 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(get_min(a, b, c));
    }

    public static int get_min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}
