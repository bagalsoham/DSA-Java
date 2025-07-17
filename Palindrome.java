
public class Palindrome {
    public static void main(String[] args) {
        int []n = {1,2,3,2,1,1};
        int flag = 0;
        int a = n.length;
        for(int i = 0; i < a/2; i++){
            if (n[i] != n[a-i-1]){
                flag = 1;
                System.out.println("Not a Palindrome");
                break;
            }
        }
        if (flag == 0){
            System.out.println("Palindrome");
        }
        
    }
}