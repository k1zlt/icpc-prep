package chapter58;

import java.util.Scanner;

public class problem112215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(0)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
