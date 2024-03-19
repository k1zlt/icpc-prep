import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 1000000007;
        int result = 0;
        for (int i = 1; i < Math.min(n + 1, m); i++) {
            double i2 = i;
            i2 = Math.pow(Math.sqrt(i2), 2);
            while (true) {
                if (i % i2 == 0) {
                    result += i2;
                    break;
                }
                i2 = Math.pow(Math.sqrt(i2) - 1, 2);
            }
            result %= m;
        }
        System.out.println(result);
    }
}