package chapter59;

import java.util.Scanner;

public class problem112175 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n*n; i++) {
            result.append("*");
            if ((i + 1) % n == 0) {
                result.append("\n");
            }
        }
        System.out.println(result);
    }
}
