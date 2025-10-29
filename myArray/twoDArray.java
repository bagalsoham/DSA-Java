    package myArray;

    import java.util.Scanner;

    public class twoDArray {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int [][] arr = new int[scn.nextInt()][scn.nextInt()];
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = scn.nextInt();// fill the array with values 
                }
            }
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
