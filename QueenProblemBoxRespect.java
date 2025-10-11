public class QueenProblemBoxRespect {
    public static void main(String[] args) {
        int n = 4;
        boolean[] board = new boolean[n];
        int tq = 2;
        int count = queenCombinationBoxRespect(board, 0, 0, tq, "");
        System.out.println("Total combinations: " + count);
    }

    public static int queenCombinationBoxRespect(boolean[] board, int col, int qpsf, int tq, String ans) {
        if (qpsf == tq) {
            System.out.println(ans);
            return 1; // one valid combination
        }
        if (col == board.length) {
            return 0;
        }

        int count = 0;

        // place queen
        board[col] = true;
        count += queenCombinationBoxRespect(board, col + 1, qpsf + 1, tq, ans + "b" + col + "q" + qpsf + " ");
        board[col] = false;

        // don't place queen
        count += queenCombinationBoxRespect(board, col + 1, qpsf, tq, ans);

        return count;
    }
}
