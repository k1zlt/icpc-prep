package chapter60;

import java.util.Scanner;

public class problem112198 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        boolean resultPrinted = false;
        for (int i = start; i <= end; i++) {
            boolean result = true;
            for (int j = 1; j <= 9 && result; j++) result = result && (getDigitsSum(i * j) == getDigitsSum(i));
            if (result) {
                resultPrinted = true;
                System.out.printf("%s ", i);
            }
        }
        if (!resultPrinted) System.out.println(0);
    }
    public static int getDigitsSum(int a) {
        int sum = 0;
        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }
}
