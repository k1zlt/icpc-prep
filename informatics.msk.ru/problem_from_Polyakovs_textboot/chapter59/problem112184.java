package chapter59;

import java.math.BigInteger;
import java.util.Scanner;

public class problem112184 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0) {
            System.out.println(get_hexadecimal_representation(n));
        } else {
            System.out.println("-" + get_hexadecimal_representation(-n));
        }
    }
    public static StringBuilder get_hexadecimal_representation(int n) {
        if (n == 0) return new StringBuilder("0");
        BigInteger result = BigInteger.ZERO;
        StringBuilder stringBuilder = new StringBuilder();
        char[] hex = new char[]{ '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        while (n > 0) {
            stringBuilder.append(hex[n % 16]);
            n /= 16;
        }
        return stringBuilder.reverse();
    }
}
