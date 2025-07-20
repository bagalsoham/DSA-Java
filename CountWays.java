import java.util.Scanner;

public class CountWays {
    public static int countNum(int n) {
        if (n <= 1) {
            return n;
        } else {
            return countNum(n - 1) + countNum(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // n+1 because we want number of ways to reach nth stair
        int result = countNum(n + 1);
        System.out.println(result);
    }
}
