public class LastIndex {
    public static int lastIndex(int[] arr, int si, int data) {
        // Base case
        if (si == arr.length) {
            return -1;
        }

        // Recursive call to search in the rest of the array
        int indexInRest = lastIndex(arr, si + 1, data);

        // If found in rest, return that
        if (indexInRest != -1) {
            return indexInRest;
        }

        // Otherwise, check current element
        if (arr[si] == data) {
            return si;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 9, 5, 6};
        int data = 5;

        int index = lastIndex(arr, 0, data);
        if (index != -1) {
            System.out.println("Last occurrence of " + data + " is at index: " + index);
        } else {
            System.out.println(data + " not found in the array.");
        }
    }
}
