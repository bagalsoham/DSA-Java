public class printSubSeq {
    public static void main(String[] args) {
        String str = "abc";
        printSS(str , "");  
    }
    public static void printSS(String str , String ans){
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }
        char cc =   str.charAt(0);
        String ros = str.substring(1);
        printSS(ros, ans);
        printSS(ros, ans + cc);
    }
}
