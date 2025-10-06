public class mergedSort {
    public static void main(String[] args) {
        int arr[] = {7, 2, 6, 3, 9, 1, 5};

        int sorted[] = mergeSort(arr, 0, arr.length - 1);

        for (int i : sorted) {
            System.out.print(i + " ");
        }
    }

    public static int[] mergeTwoSortedArrays(int arr1[], int arr2[]) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        if (i == arr1.length) {
            while (j < arr2.length) {
                merged[k++] = arr2[j++];
            }
        }
        if (j == arr2.length) {
            while (i < arr1.length) {
                merged[k++] = arr1[i++];
            }
        }
        return merged;
    }

    public static int[] mergeSort(int arr[], int left, int right) {
        if (left == right) { 
            int[] baseResult = new int[1];
            baseResult[0] = arr[left];
            return baseResult;
        }
        int mid = (left + right) / 2;
        int[] firstHalf = mergeSort(arr, left, mid);
        int[] secondHalf = mergeSort(arr, mid + 1, right);
        return mergeTwoSortedArrays(firstHalf, secondHalf);
    }
}
