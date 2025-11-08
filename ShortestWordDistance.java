import java.util.Scanner;

public class ShortestWordDistance {
    private static int Min_distance(String[] words , String word1, String word2){
        int a1 =-1;
        int a2 =-1;
        int min = words.length;
        for(int i = 0; i<words.length;i++){
            if(words[i].equals(word1)){
                a1 =i;
            }
            if (words[i].equals(word2)) {
                a2 = i;
            }
            if(a1 != -1 && a2 != -1){
                min = Math.min(min, Math.abs(a1-a2));
            }

        }
        return min;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }
        String w1= sc.next();
        String w2= sc.next();
        int ans = Min_distance(arr,w1,w2);
        System.out.println(ans);
    }

}
