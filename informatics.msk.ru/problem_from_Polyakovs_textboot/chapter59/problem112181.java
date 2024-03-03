package chapter59;

import java.util.Scanner;

public class problem112181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] representations = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        int n = sc.nextInt();
        String[] out = new String[4];
        out[3] = String.valueOf(n);
        for (int i = 3; i >= 0; i--) {
            String representation = representations[Integer.parseInt(out[i]) % 16];
            if (i == 0) {
                out[i] = representation;
                break;
            }
            out[i - 1] = String.valueOf(Integer.parseInt(out[i]) / 16);
            out[i] = representation;
        }
        System.out.println(String.join("", out));
    }
}
