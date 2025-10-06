import java.util.ArrayList;

public class PermutationRecursion {
    public static ArrayList<String> getPermutations(String str) {
        if (str.length() == 0) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        char c = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> recResult = getPermutations(ros);
        ArrayList<String> myResult = new ArrayList<>();

        for (String rrs : recResult) {
            for (int i = 0; i <= rrs.length(); i++) {
                String val = rrs.substring(0, i) + c + rrs.substring(i);
                myResult.add(val);
            }
        }

        return myResult;
    }

    public static void main(String[] args) {
        String input = "abc";
        ArrayList<String> permutations = getPermutations(input);

        System.out.println("All permutations of \"" + input + "\":");
        for (String perm : permutations) {
            System.out.println("\"" + perm + "\"");
        }
    }
}
