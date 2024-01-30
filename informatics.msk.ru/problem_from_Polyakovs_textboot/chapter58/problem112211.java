//package chapter58;

import java.util.Scanner;

public class problem112211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean printed = false;
        for (int i = a; i <= b; i++) {
            if (String.valueOf(i*i).endsWith(String.valueOf(i))) {
                System.out.printf("%s ", i);
                printed = true;
            }
        }
        if (!printed) {
            System.out.println(-1);
        }
    }
}
