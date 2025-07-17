public class InPlacePrefixSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Step 1: Row-wise prefix sum
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }

        // Step 2: Column-wise prefix sum
        for (int j = 0; j < cols; j++) {
            for (int i = 1; i < rows; i++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }

        // Print the modified matrix (which is now the prefix sum matrix)
        System.out.println("In-place Prefix Sum Matrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
