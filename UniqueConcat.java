import java.util.*;

public class UniqueConcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<String> arr = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            arr.add(sc.nextLine());
        }

        System.out.println(maxLength(arr, 0, ""));
    }

    static int maxLength(List<String> arr, int i, String ans) {
        // base case
        if (i == arr.size()) {
            if (isUnique(ans)) {
                return ans.length();
            }
            return 0;
        }

        int include = 0;
        // include current string only if it keeps unique property
        if (isUnique(ans + arr.get(i))) {
            include = maxLength(arr, i + 1, ans + arr.get(i));
        }

        // skip current string
        int exclude = maxLength(arr, i + 1, ans);

        // return maximum length found
        return Math.max(include, exclude);
    }

    // helper to check if string has all unique characters
    static boolean isUnique(String s) {
        boolean[] seen = new boolean[26];
        for (char c : s.toCharArray()) {
            if (seen[c - 'a']) return false;
            seen[c - 'a'] = true;
        }
        return true;
    }
}
