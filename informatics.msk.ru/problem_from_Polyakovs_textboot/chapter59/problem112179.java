package chapter59;

import java.util.Scanner;

public class problem112179 {
    public static void main(String[] args) {
        int[] integers =          new int[] {     1,    4,   5,   9,   10,  40,   50,   90, 100, 400, 500,   900, 1000};
        String[] roman_numerals = new String[] {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM",  "M"};
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        StringBuilder out = new StringBuilder();
        for (int i = integers.length - 1; i > -1; i--) {
            while (in >= integers[i]) {
                in -= integers[i];
                out.append(roman_numerals[i]);
            }
        }
        System.out.println(out);
    }
}
