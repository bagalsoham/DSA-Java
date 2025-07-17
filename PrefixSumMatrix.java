public class PrefixSumMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] prefixSum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                prefixSum[i][j] = matrix[i][j];

                if (i > 0) {
                    prefixSum[i][j] += prefixSum[i - 1][j];
                }

                if (j > 0) {
                    prefixSum[i][j] += prefixSum[i][j - 1];
                }

                if (i > 0 && j > 0) {
                    prefixSum[i][j] -= prefixSum[i - 1][j - 1]; // remove double count
                }
            }
        }

        // Print the prefix sum matrix
        System.out.println("Prefix Sum Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(prefixSum[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
