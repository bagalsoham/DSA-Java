public class BubbleSortRecursive {

    public static void bubbleSort(int[] arr, int si, int li) {
        // Base case: if the last index becomes 0, sorting is done
        if (li == 0) {
            return;
        }

        // If we've reached the end of this pass, start a new pass
        if (si == li) {
            bubbleSort(arr, 0, li - 1);
            return;
        }

        // Swap if needed
        if (arr[si] > arr[si + 1]) {
            int temp = arr[si];
            arr[si] = arr[si + 1];
            arr[si + 1] = temp;
        }

        // Continue this pass
        bubbleSort(arr, si + 1, li);
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        bubbleSort(arr, 0, arr.length - 1);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
