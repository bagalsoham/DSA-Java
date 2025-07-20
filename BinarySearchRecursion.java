class BinarySearchRecursion{
    public static int binarySearchRecursion(int[] arr,int low,int high,int x){
        int result =-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                return binarySearchRecursion(arr,mid +1, high, x);
            }
            else{
                return binarySearchRecursion(arr, low, mid-1, x);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr   = {2,4,8,12,16,19,21,27,29,35};
        int low=0;
        int high= arr.length -1;
        int x = 29;

        int result = binarySearchRecursion(arr,low,high,x);
        System.out.println(result);
    }
}