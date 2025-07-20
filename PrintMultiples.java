public class PrintMultiples {
    public static void printMul(int m, int k){
        if(k==1){
            System.out.println(m);
            return;
        }
        printMul(m, k-1);
        System.out.println(m*k);
    }
    public static void main(String[] args) {
        int m = 25;
        int k = 10;
        printMul(m,k);
        System.out.println();
    }
}
