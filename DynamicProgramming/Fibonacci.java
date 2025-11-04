package DynamicProgramming;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 200; // Example input
        long[] a = new long[n + 1]; // Array to store computed Fibonacci values
        System.out.println(FibRec(n));
        System.out.println(FibTD(n, a));
        System.out.println(FibBU(n));
        System.out.println(FibBUSE(n));
    }
    public static long FibRec(int n)   { //simple recursion
        if (n == 0 || n == 1) {
            return n;
        }
        long fib1 = FibRec(n - 1);
        long fib2 = FibRec(n - 2);
        long fn = fib1 + fib2;
        return fn;
    }
    public static long FibTD(int n, long[] a) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (a[n] != 0) { // check if already computed
            return a[n];
        }
        long fib1 = FibTD(n - 1, a);
        long fib2 = FibTD(n - 2, a);
        long fn = fib1 + fib2;
        a[n] = fn; // store result
        return fn;
    }
    public static int FibBU(int  n){//bottom up
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static int FibBUSE(int n) { //bottom up space efficient
        int[] dp = new int[2];
        dp[0] = 0;
        dp[1] = 1;
        for(int slide =1; slide<=n; slide++){   
            int sum = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = sum;
        }
        return dp[1];
    }
}
