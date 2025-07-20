import java.util.Scanner;

public class FactorialRecursion {

    public static int factorialFunction(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialFunction(n - 1);  // directly return
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = factorialFunction(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
