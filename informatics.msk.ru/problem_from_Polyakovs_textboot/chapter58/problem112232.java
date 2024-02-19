package chapter58;

import java.util.HashMap;
import java.util.Scanner;

public class problem112232 {
    public static String convert(int numerator, int denominator) {
        StringBuilder ans = new StringBuilder();
        ans.append(numerator / denominator).append(",");

        HashMap<Integer, Integer> l = new HashMap<>();
        int index = 0;
        numerator = numerator % denominator;
        l.put(numerator, index);
        boolean t = false;

        while (!t) {
            if (numerator == 0) {
                break;
            }

            int digit = numerator * 10 / denominator;
            numerator = numerator * 10 - (numerator * 10 / denominator) * denominator;

            if (!l.containsKey(numerator)) {
                ans.append(digit);
                index++;
                l.put(numerator, index);
                t = false;
            } else {
                ans.append(digit).append(")");
                ans.insert(l.get(numerator) + ans.indexOf(",") + 1, "(");
                t = true;
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = sc.nextInt();
        int denominator = sc.nextInt();
        String result = convert(numerator, denominator);
        System.out.println(result);
    }
}
