package chapter57;

import java.util.Scanner;

public class problem112156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int maxNum = max(max(a, b), max(b, c));
        int minNum = min(min(a, b), min(b, c));
        System.out.printf("%s%n%s", minNum, maxNum);
    }
    static int max(int a, int b) {
        if (a > b) return a;
        return b;
    }
    static int min(int a, int b) {
        if (a < b) return a;
        return b;
    }
}
