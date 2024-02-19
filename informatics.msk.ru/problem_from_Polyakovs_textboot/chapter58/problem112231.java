package chapter58;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class problem112231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int N = sc.nextInt();
        List<int[]> intlist = new ArrayList<int[]>();
        for (int i = 0; i <= N / a; i++)
            for (int j = 0; j <= N / b; j++)
                for(int k = 0; k <= N / c; k++) {
                    int result = i * a + j * b + k * c;
                    if (result == N) {
                        intlist.add(new int[]{i, j, k});
                    } else if (result > N) {
                        break;
                    }
                }
        System.out.println(intlist.size());
        for (int[] i: intlist) {
            System.out.println(String.join(" ", Arrays.stream(i).mapToObj(String::valueOf).toArray(String[]::new)));
        }
    }
}
