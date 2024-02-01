package chapter58;

import java.util.Scanner;

public class problem112223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (true) {
            int input = sc.nextInt();
            if (input == 0) break;
            min = Math.min(min, input);
            max = Math.max(max, input);
        }
        System.out.printf("%s %s", min, max);
    }
}
