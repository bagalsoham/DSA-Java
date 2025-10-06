public class quickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quickSort(arr , 0 , arr.length - 1);
        for(int i : arr){
            System.out.print(i + " ");
        } 
    }
    public static void quickSort(int[] arr, int lo, int hi){
        
        if(lo >= hi) return;
        //partitioning 
        int mid = (lo + hi) / 2;
        int pivot = arr[mid];
        int left = lo , right = hi;
        while(left <= right){
            while(arr[left] < pivot) left++;
            while(arr[right] > pivot) right--;
            if(left <= right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        quickSort(arr   , lo , right);
        quickSort(arr   , left , hi);
    }
}
