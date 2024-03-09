package chapter59;

import java.util.Scanner;

public class problem112187 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(get_representation(n));
    }
    public static StringBuilder get_representation(int n) {
        if (n == 0) return new StringBuilder("0");
        StringBuilder stringBuilder = new StringBuilder();
        while (n != 0) {
            if (n % (-2) == -1) {
                n = n / (-2) + 1;
                stringBuilder.append('1');
            } else {
                stringBuilder.append(Math.abs(n % (-2)));
                n /= -2;
            }
        }
//        stringBuilder.append('1');
        return stringBuilder.reverse();
    }
}