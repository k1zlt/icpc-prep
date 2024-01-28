package chapter57;

import java.util.Scanner;

public class problem112158 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        char[] letters = {'A', 'B', 'C'};
        for (int i = 0; i < 3; i++) ages[i] = sc.nextInt();
        int maxNum = max(ages);
        if (ages[0] == ages[1] && ages [1] == ages[2]) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < 3; i++) {
            if (maxNum == ages[i]) System.out.printf("%s ", letters[i]);
        }
    }

    public static int max(int[] numbers) throws Exception {
        if (numbers.length == 0) throw new Exception("List should contain at least one number");
        int maxNum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (maxNum < numbers[i] ) {
                maxNum = numbers[i];
            }
        }
        return maxNum;
    }
}
