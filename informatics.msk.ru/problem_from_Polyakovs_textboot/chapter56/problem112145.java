package chapter56;

import java.util.Scanner;

public class problem112145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.printf("%s+%s+%s=%s%n", a, b, c, a+b+c);
        System.out.printf("%s*%s*%s=%s%n", a, b, c, a*b*c);
        System.out.printf("(%s+%s+%s)/3=%.3f%n", a, b, c, (a+b+c)/3.0);
    }
}
