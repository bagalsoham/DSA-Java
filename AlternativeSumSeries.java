import java.util.Scanner;

public class AlternativeSumSeries {
    public static int  alternativeSumSeries(int number){
        if(number ==0){
            return 0;
        }
        if(number % 2 == 0){
            return alternativeSumSeries( number -1)-number;
        }
        else{
            return alternativeSumSeries(number -1 ) + number;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int result = alternativeSumSeries(number);
        System.out.println(result);
    }
}
