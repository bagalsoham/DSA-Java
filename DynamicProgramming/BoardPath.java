package DynamicProgramming;

public class BoardPath {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(BPBU(n));
        System.err.println(BPBUSE(n));
        System.out.println(BPTD(0, n, new int[n]));
        System.out.println(BPPRecursion(0, n));
    }

    public static int BPPRecursion(int curr, int end) {
        if (curr == end) {
            return 1;// positive base case
        }
        if (curr > end) {
            return 0; // negative base case
        }
        int count = 0;
        for (int dice = 1; dice <= 6; dice++) {
            count += BPPRecursion(curr + dice, end);
        }
        return count;
    }

    public static int BPTD(int curr, int end, int[] dp) { // Board Path top down
        if (curr == end) {
            return 1;// positive base case
        }
        if (curr > end) {
            return 0; // negative base case
        }
        if (dp[curr] != 0) {
            return dp[curr]; // reuse the value
        }
        int count = 0;
        for (int dice = 1; dice <= 6; dice++) {
            count += BPTD(curr + dice, end, dp);
        }
        dp[curr] = count;// here changes is the curr and end remains the same and the solution is the
                         // count so store the count
        return count;
    }

    public static int BPBU(int end) {// bottom up
        int[] dp = new int[end + 6];
        dp[end] = 1; // base case value filled from before
        for (int i = end - 1; i >= 0; i--) {
            dp[i] = dp[i + 1] + dp[i + 2] + dp[i + 3] + dp[i + 4] + dp[i + 5] + dp[i + 6];
        }
        return dp[0];

    }
    public static long BPBUSE(int end) { // Space Efficient Bottom-Up
    long[] dp = new long[6];
    dp[0] = 1; // base case: only 1 way to stay at end

    for (int slide = 1; slide <= end; slide++) {
        long sum = 0;
        for (int val = 0; val < 6; val++) {
            sum += dp[val];
        }

        // Shift right: drop oldest, insert newest sum at dp[0]
        for (int j = 5; j > 0; j--) {
            dp[j] = dp[j - 1];
        }
        dp[0] = sum; // new value for next iteration
    }

    return dp[0];
}

}
