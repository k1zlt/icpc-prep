package chapter58;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem112210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean printed = false;
        for (int i = a; i <= b; i++) {
            if (isOk(i)) {
                printed = true;
                System.out.printf("%s ", i);
            }
        }
        if (!printed) System.out.println(-1);
    }

    private static boolean isOk(int i) {
        List<Integer> n = new ArrayList<Integer>();
        int i2 = i;

        while (i2 > 0) {
            n.add(i2%10);
            i2 /= 10;
        }
        for(Integer j: n) {
            i -= (int) Math.pow(j, n.size());
        }
        return i == 0;
    }
}
