package chapter59;

import java.math.BigInteger;
import java.util.Scanner;

public class problem112185 {
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
    public static BigInteger get_representation(int n, int s) {
        BigInteger result = BigInteger.ZERO;
        int k = 0;
        while (n > 0) {
            result = result.add(BigInteger.valueOf(10).pow(k).multiply(BigInteger.valueOf(n % s)));
            k += 1;
            n /= s;
        }
        return result;
    }
}
