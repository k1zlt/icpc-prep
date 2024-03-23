//package chapter61;

import java.util.Scanner;

public class problem112245 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        if (in.charAt(0) != '-') {
            System.out.println(convert_to_decimal(in));
        } else {
            System.out.println("-" + convert_to_decimal(in.substring(1)));
        }
    }
    public static int convert_to_decimal(String in) {
        int k = 0;
        int res = 0;
        while (!in.isEmpty()) {
            String remainder = String.valueOf(in.charAt(in.length()-1));
            in = in.substring(0, in.length()-1);
            res += (int) (Integer.parseInt(remainder) * Math.pow(2, k));
            k++;
        }
        return res;
    }
}
