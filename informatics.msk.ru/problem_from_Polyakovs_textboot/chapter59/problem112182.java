package chapter59;

import java.math.BigInteger;
import java.util.Scanner;

public class problem112182 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0) {
            System.out.println(get_binary_representation(n));
        } else {
            System.out.println("-" + get_binary_representation(-n));
        }
    }
    public static BigInteger get_binary_representation(int n) {
        BigInteger result = BigInteger.ZERO;
        int k = 0;
        while (n > 0) {
            result = result.add(BigInteger.valueOf(10).pow(k).multiply(BigInteger.valueOf(n % 2)));
            k+=1;
            n /= 2;
        }
        return result;
    }
}
