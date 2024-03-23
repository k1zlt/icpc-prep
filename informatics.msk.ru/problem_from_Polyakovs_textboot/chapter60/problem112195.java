package chapter60;

import java.util.Scanner;

public class problem112195 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(get_n_fibonachi(a));
    }

    public static int get_n_fibonachi(int n) {
        if (n == 1 || n == 2) return 1;
        int a = 1;
        int b = 1;
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
