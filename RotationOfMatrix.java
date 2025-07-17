import java.util.Arrays;
public class RotationOfMatrix {

    public static void rotatedMatrix(int [][]arr){
        //step 1 make transpose of matrix
        int m = arr.length;//gives row
        int n = arr[0].length;//gives column

        for(int i=0; i<m; i++){
            for(int j=i+1; j<n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //step 2 reverse each row
        for(int i=0; i<m; i++){
            int left = 0;
            int right = n-1;
            while(left<right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int [][]arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotatedMatrix(arr);
        rotatedMatrix(arr);
        for(var i : arr){
            System.out.println(Arrays.toString(i));
        }

    }
}
