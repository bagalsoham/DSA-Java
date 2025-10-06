import java.util.ArrayList;

public class AllSubsequencesString {
    public static ArrayList<String> getSubSeq(String str){
        if(str.length() ==0){
            ArrayList<String> baseRes = new ArrayList<>();
            baseRes.add(" ");
            return baseRes;
        }
        char c = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> myRes = new ArrayList<>();
        ArrayList<String> recResult = getSubSeq(ros);

        for(int i=0;i<recResult.size(); i++){
            myRes.add(recResult.get(i)); 
            myRes.add(c + recResult.get(i));   
        }

        
        return myRes;
    }
    public static void main(String[] args) {
        String input = "abcd";
        ArrayList<String> subsequences = getSubSeq(input);
    
        System.out.println("All subsequences of \"" + input + "\":");
        for (String seq : subsequences) {
            System.out.println("\"" + seq + "\"");
        }
    }
    
}
