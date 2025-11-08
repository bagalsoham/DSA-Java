import java.util.Scanner;

public class SunnyBuilding {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            int  maxH = Integer.MIN_VALUE;
            for(int i = 0; i<n;i++){
                int num = sc.nextInt();
                if (num >= maxH) {
                    ans++;
                    maxH = num ;

                }
            }
            System.out.println(ans);
        }
     }
}