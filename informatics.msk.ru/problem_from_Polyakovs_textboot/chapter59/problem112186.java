package chapter59;

import java.math.BigInteger;
import java.util.Scanner;

public class problem112186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        if (n >= 0) {
            System.out.println(get_representation(n, s));
        } else {
            System.out.println("-" + get_representation(-n, s));
        }
    }
    public static StringBuilder get_representation(int n, int s) {
        if (n == 0) return new StringBuilder("0");
        BigInteger result = BigInteger.ZERO;
        StringBuilder stringBuilder = new StringBuilder();
        char[] hex = new char[]{ '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        while (n > 0) {
            stringBuilder.append(hex[n % s]);
            n /= s;
        }
        return stringBuilder.reverse();
    }
}
