package SearchIn2DArray;

import java.util.Arrays;

public class Maximum_In2DArray {
    public static void main(String[] args) {
        int [][] nums = {
                {23,4,3},
                {18,12,30,8},
                {75,45,2,50,6},
                {20,10}
        };

        int max = MaxNumIn2DArray(nums); // format of the return value [row, col]
        //Convert ans array toString
        System.out.println("Maximum number in the 2D array is: " + max);
    }

    //check for the target value in the 2D Array: if found return its position in 2D array
    //if not found return
    static int MaxNumIn2DArray(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max){
                    // When found create new array of int and return row and col value
                    max = arr[row][col];
                }
            }
        }

        // Not found
        return max;
    }
}
