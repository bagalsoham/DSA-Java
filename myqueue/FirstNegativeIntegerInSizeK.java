package myqueue;

import java.util.LinkedList;

public class FirstNegativeIntegerInSizeK {
    public static void main(String[] args) {
        int[] arr = { 1, -2, 3, -4, 5 };
        int k = 3;
        LinkedList<Integer> q = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                q.addLast(i);
            }
        }
        for (int i = k; i < arr.length; i++) {
            if (!q.isEmpty()) {
                System.out.print(arr[q.getFirst()] + " ");
            } else {
                System.out.print("0 ");
            }
            while (!q.isEmpty() && q.peek() <= i - k) {
                q.removeFirst();
            }
            if (arr[i] < 0) {
                q.addLast(i);
            }
        }
        if (!q.isEmpty()) {
            System.out.print(arr[q.getFirst()] + " ");
        } else {
            System.out.print("0 ");
        }
    }
}
