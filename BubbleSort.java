import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for(int i=0; i< arr.length; i++){
            boolean Swapped = false;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    Swapped = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr ={20,50,10,12,12,45,67,90};
        bubbleSort(arr);
        System.err.println(Arrays.toString(arr));//stable algorithm
    }
}
