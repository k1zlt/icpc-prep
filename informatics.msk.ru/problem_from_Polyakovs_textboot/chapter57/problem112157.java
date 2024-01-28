package chapter57;

import java.util.Scanner;

public class problem112157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] l = new int[5];
        for (int i = 0; i < 5; i++) l[i] = sc.nextInt();
        int maxNum = l[0];
        int minNum = l[0];
        for (int i = 0; i < 5; i++) {
            maxNum = max(maxNum, l[i]);
            minNum = min(minNum, l[i]);
        }
        System.out.println(minNum);
        System.out.println(maxNum);
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
