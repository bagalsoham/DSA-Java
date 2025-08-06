public class SortedArrayOrNot {
    public static boolean isSorted(int[] arr , int startIndex){
        // Base case: If we reach the last element, array is sorted
        if (arr.length - 1 == startIndex) {
            return true;
        }

        // If current element is greater than next, it's not sorted
        if (arr[startIndex] > arr[startIndex + 1]) {
            return false;
        } else {
            // Check the rest of the array recursively
            boolean restAns = isSorted(arr, startIndex + 1);
            return restAns;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {10, 5, 8, 20};
        
        System.out.println("arr1 is sorted: " + isSorted(arr1, 0)); // true
        System.out.println("arr2 is sorted: " + isSorted(arr2, 0)); // false
    }
}
