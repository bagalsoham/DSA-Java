import java.util.Deque;
import java.util.LinkedList;

public class MaxInWindowOfSizeK {
    public static void printMax(int[] arr, int k){
        Deque<Integer> dq = new LinkedList<>();
        for(int i=0;i<k;i++){// process first k elements
            while (!dq.isEmpty() && arr[i] > arr[dq.getLast()]) {
                dq.removeLast();// remove smaller elements
            }
            dq.addLast(i);
        }
        for(int i=k;i<arr.length;i++){ // process rest of the elements
            System.out.println(arr[dq.getFirst()] + ""); // print max of previous window
            //value at front should be the part of current window
            while(!dq.isEmpty() && dq.getFirst() <= i-k){
                dq.removeFirst();
            }     
            while(!dq.isEmpty() && arr[i] >= arr[dq.getLast()]){ // >= to maintain stable order and remove older one
                dq.removeLast();// remove smaller elements from back
            }
            dq.addLast(i);
        }
        System.out.println(arr[dq.getFirst()] + ""); // print max of last window

    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,4,5,2,3,6};
        int k = 3;
        printMax(arr,k);
    }
}