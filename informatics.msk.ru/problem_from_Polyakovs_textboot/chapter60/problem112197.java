package chapter60;

import java.util.*;

public class problem112197 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        Set<Integer> results = new HashSet<>();
        int k = 0;
        for (int i = start; i <= end; i++) {
            int r = getDivisorsSum(i);
            if (i != r && isInRange(r, start, end) && getDivisorsSum(r) == i && !results.contains(i)) {
                System.out.printf("(%s,%s)%n", i, r);
                results.add(r);
                k+=1;
            }
        }
        if (k == 0) System.out.println(0);
    }

    public static boolean isInRange(int i, int start, int end) {
        return start <= i && i <= end;
    }

    public static int getDivisorsSum(int a) {
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum+=i;
            }
        }
        return sum;
    }
}
