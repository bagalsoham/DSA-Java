public class MissingNo {        
    public static void main(String[] args) {
        
        int []n = {1,2,3,4,5,7,8,9,10};
        int a = n.length;
        int sumOfNaturalNo = (a+1)*(a+2)/2;
        int sum = 0;
        for (int i = 0; i < a; i++){
            sum = sum + n[i];
        }
        int missingNo = sumOfNaturalNo - sum;
        System.out.println(missingNo);
    }
}

