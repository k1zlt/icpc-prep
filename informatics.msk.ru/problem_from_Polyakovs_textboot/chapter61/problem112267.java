package chapter61;

import java.util.Scanner;

public class problem112267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        int max = 0;
        for (int i = 0; i < in.length(); i++) {
            int k = Integer.parseInt(String.valueOf(in.charAt(i)));
            max = Math.max(max, k);
        }
        System.out.println(max);
    }
}
