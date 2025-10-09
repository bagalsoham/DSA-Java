public class queenProblem {

    public static void main(String[] args) {
        int n = 4; // number of boxes
        int tq = 2; // total queens
        boolean[] boxes = new boolean[n];

        System.out.println("=== Queen Permutations ===");
        queenPermutation(boxes, 0, tq, "");

        System.out.println("\n=== Queen Combinations ===");
        queenCombination(boxes, 0, tq, "", -1);
    }

    // 📌 Queen Permutation: order matters (q0 in box1 and q1 in box2 is different from q1 in box1 and q0 in box2)
    public static void queenPermutation(boolean[] boxes, int qpsf, int tq, String ans) {
        if (qpsf == tq) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i] == false) {
                boxes[i] = true;
                queenPermutation(boxes, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ");
                boxes[i] = false; // backtrack
            }
        }
    }

    // 📌 Queen Combination: order doesn't matter (q0 in box1 and q1 in box2 is same as q1 in box1 and q0 in box2)
    public static void queenCombination(boolean[] boxes, int qpsf, int tq, String ans, int lastBoxUsed) {
        if (qpsf == tq) {
            System.out.println(ans);
            return;
        }
        for (int i = lastBoxUsed + 1; i < boxes.length; i++) {
            if (boxes[i] == false) {
                boxes[i] = true;
                queenCombination(boxes, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ", i);
                boxes[i] = false; // backtrack
            }
        }
    }
}
