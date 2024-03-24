package chapter61;

import java.util.*;

public class problem112251 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(decimalToBalancedTernary(n));
    }

    public static String decimalToBalancedTernary(int n) {
        if (n == 0) return "0";

        StringBuilder result = new StringBuilder();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "0");
        map.put(1, "1");
        map.put(-1, "#");
        while (n != 0) {
            int remainder = (n % 3 + 3) % 3;
            n = (int) Math.floor(n / 3.0);
            if (remainder == 2) {
                n++;
                remainder = -1;
            }
            result.insert(0, map.get(remainder));
        }

        return result.toString();
    }
}
