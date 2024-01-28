package chapter57;

import java.util.Scanner;

public class problem112163 {
    static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        System.out.println(getSolution(month, day));
    }

    public static int getSolution(int month, int day) {
        if (month > 12 || month < 1) return -1;
        int daysLeft = days[month-1] - day;
        if (daysLeft < 0) return -1;
        for (int i = month; i < 12; i++) {
            daysLeft += days[i];
        }
        return daysLeft;
    }
}
