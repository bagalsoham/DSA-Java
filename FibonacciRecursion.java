public class FibonacciRecursion {
    public static int fib(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Recursive case
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String[] args) {
        int n = 10; // You can change this to any positive number
        System.out.println("Fibonacci number at position " + n + " is: " + fib(n));
    }
}
