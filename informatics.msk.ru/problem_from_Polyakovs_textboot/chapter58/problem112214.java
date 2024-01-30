package chapter58;

import java.util.Scanner;

public class problem112214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] num = String.valueOf(n).split("");
        if (num.length > 1)
            for (int i = 0; i < num.length-1; i++) {
                if (num[i].equals(num[i+1])) {
                    System.out.println("YES");
                    return;
                }
            }
        System.out.println("NO");
    }
}
