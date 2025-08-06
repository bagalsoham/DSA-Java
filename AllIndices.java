public class AllIndices {
    public static int[] allIndices(int[] arr, int si, int data, int count) {
        // Base case
        if (si == arr.length) {
            int[] base = new int[count];
            return base;
        }

        int[] indices;
        if (arr[si] == data) {
            indices = allIndices(arr, si + 1, data, count + 1);
            indices[count] = si; // Store current index a t correct position
        } else {
            indices = allIndices(arr, si + 1, data, count);
        }

        return indices; // ✅ return final array
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 5, 5, 9, 5};
        int data = 5;

        int[] result = allIndices(arr, 0, data, 0);

        System.out.print("Indices of " + data + ": ");
        for (int index : result) {
            System.out.print(index + " ");
        }
    }
}
