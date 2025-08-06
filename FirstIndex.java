public class FirstIndex {
    public static int firstIndex(int[] arr, int si, int data) {
        if (si == arr.length) {
            return -1;
        }

        // If current element matches
        if (arr[si] == data) {
            return si;
        }

        // Recursive call on the rest of the array
        return firstIndex(arr, si + 1, data);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 9, 5, 6};
        int data = 5;

        int index = firstIndex(arr, 0, data);
        if (index != -1) {
            System.out.println("First occurrence of " + data + " is at index: " + index);
        } else {
            System.out.println(data + " not found in the array.");
        }
    }
}
