public class SumDigits {
    public static int sumOfDigits(int number){
        //base condition 
        if(number ==0){
            return 0;
        }
        return (number % 10) + sumOfDigits(number/10);
    }
    public static void main(String[] args) {
        int number = 123456;
        int result = sumOfDigits(number);
        System.out.println(result);
    }
}
