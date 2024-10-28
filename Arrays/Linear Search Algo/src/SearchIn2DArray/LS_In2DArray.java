package SearchIn2DArray;

import java.util.Arrays;

public class LS_In2DArray {
    public static void main(String[] args) {
        int [][] nums = {
                {23,4,3},
                {18,12,30,8},
                {75,45,2,50,6},
                {20,10}
        };
        int target = 50;
        int[] ans = search2D(nums, target); // format of the return value [row, col]
        //Convert ans array toString
        System.out.println(Arrays.toString(ans));
    }

    //check for the target value in the 2D Array: if found return its position in 2D array
    //if not found return
    static int[] search2D(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    // When found create new array of int and return row and col value
                    return new int[]{row,col};
                }
            }
        }

        // Not found
        return new int[]{-1,-1};
    }
}
