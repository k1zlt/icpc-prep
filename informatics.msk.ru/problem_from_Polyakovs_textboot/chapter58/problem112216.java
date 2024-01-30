package chapter58;

import java.util.Scanner;

public class problem112216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if (containsPair(a)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean containsPair(String a) {
        for (int i = 0; i < a.length(); i++)
            for (int j = i + 1; j < a.length(); j++) {
                if (a.charAt(i) == a.charAt(j)) return true;
            }
        return false;
    }
}
