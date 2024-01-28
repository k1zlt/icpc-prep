package chapter56;

import java.util.Random;
import java.util.Scanner;

public class problem112152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        double start = sc.nextDouble();
        double end = sc.nextDouble();
        for (int i = 0; i < 5; i++) {
            System.out.printf("%.3f ", r.nextDouble()*(end-start)+start);
        }
    }
}
