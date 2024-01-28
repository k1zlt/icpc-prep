package chapter57;

import java.util.Scanner;

public class problem112162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = sc.nextInt();
        if (month > 0 && month < 13) {
            System.out.println(days[month - 1]);
        } else {
            System.out.println(0);
        }
    }
}
