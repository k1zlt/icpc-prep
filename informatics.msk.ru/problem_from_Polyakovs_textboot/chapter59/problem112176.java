package chapter59;

import java.util.Scanner;

public class problem112176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }
    }
}
