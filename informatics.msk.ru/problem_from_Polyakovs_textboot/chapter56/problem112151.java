package chapter56;

import java.util.Random;
import java.util.Scanner;

public class problem112151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s ", r.nextInt(end-start)+start);
        }
    }
}
