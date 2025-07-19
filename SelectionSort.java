import java.util.Arrays;

public class SelectionSort {    
    public static void selectionSort(int[] arr){
        for(int i =0;i<arr.length; i++){
            int min =i;
            for(int j=i+1;j<arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }

            }
            if(min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {20,50,12,17,19,25,97,16};
        selectionSort(arr);
        System.out.println("Sorted array is:");
        System.out.println(Arrays.toString(arr));
    }
}
