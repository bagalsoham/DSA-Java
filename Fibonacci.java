import java.util.Scanner;

public class Fibonacci {
    public static int fibonacciFinding(int n){
        int result=0;
        if(n<=1){
            return n;
        }else{

            result = fibonacciFinding(n-1) + fibonacciFinding(n-2);
        }
        return result;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = fibonacciFinding(n);
        System.out.println("Result : " + result);

    }
}
