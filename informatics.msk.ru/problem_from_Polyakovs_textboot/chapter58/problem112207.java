package chapter58;

import java.util.Random;
import java.util.Scanner;

public class problem112207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            System.out.printf("%s ", (int)(Math.abs(r.nextDouble()) * (b - a) + a));
        }
    }
}
