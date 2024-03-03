package chapter59;

import java.util.Arrays;
import java.util.Scanner;

public class problem112180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] out = new int[10];
        out[9] = n;
        for (int i = 9; i > 0; i--) {
            out[i-1] = out[i] / 8;
            out[i] = out[i] % 8;
            if (out[i-1] == 0) break;
        }
        System.out.println(String.join("", Arrays.stream(out).mapToObj(Integer::toString).toArray(String[]::new)));
    }
}
