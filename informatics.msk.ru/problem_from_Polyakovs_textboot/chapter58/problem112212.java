package chapter58;

import java.util.Scanner;

public class problem112212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        while (n > 0) {
            if (n % 10 % 2 == 0) k+=1;
            n /= 10;
        }
        System.out.println(k);
    }
}
