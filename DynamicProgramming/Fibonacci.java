package DynamicProgramming;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 50; // Example input
        long[] a = new long[n + 1]; // Array to store computed Fibonacci values
        System.out.println(Fibrecursion(n, a));
    }

    public static long Fibrecursion(int n, long[] a) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (a[n] != 0) { // check if already computed
            return a[n];
        }
        long fib1 = Fibrecursion(n - 1, a);
        long fib2 = Fibrecursion(n - 2, a);
        long fn = fib1 + fib2;
        a[n] = fn; // store result
        return fn;
    }
}
