package chapter60;

import java.util.Scanner;

public class problem112191 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(get_len(a));
    }

    private static int get_len(int a) {
        return Integer.toString(a).length();
    }
}
