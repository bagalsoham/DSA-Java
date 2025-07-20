import java.util.Scanner;

public class PowerRecursion {
    public static long powerFind(long a, long b) {
        if (b == 0) return 1;
        if (b == 1) return a;

        long halfPower = powerFind(a, b / 2);
        long result = halfPower * halfPower;

        if (b % 2 == 0) {
            return result;
        } else {
            return a * result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();  // For example, input: 2
        long b = sc.nextLong();  // For example, input: 32

        long result = powerFind(a, b);
        System.out.println(result);  // Output: 4294967296
    }
}
