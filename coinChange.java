public class coinChange {
    public static void main(String[] args) {
        int[] denom = { 1, 2, 5 }; // coin denominations
        int amount = 5; // target amount

        // Call the recursive function starting with an empty answer string and 0 as the
        // starting index
        CoinChangeCombination(denom, amount, "", 0);
        System.out.println("----");
        CoinChangePermutation(denom, amount, "");
    }

    public static void CoinChangeCombination(int[] denom, int amount, String ans, int lastDenomIndex) {
        if (amount == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = lastDenomIndex; i < denom.length; i++) {
            if (amount >= denom[i]) {
                CoinChangeCombination(denom, amount - denom[i], ans + denom[i] + " ", i);
            }
        }
    }

    public static void CoinChangePermutation(int[] denom, int amount, String ans) {
        if (amount == 0) {
            System.out.println(ans);
            return;
        }
        if (amount < 0) {
            return;
        }
        for (int i = 0; i < denom.length; i++) {
            CoinChangeCombination(denom, amount - denom[i], ans + denom[i] + " ", i);
        }
    }

}
