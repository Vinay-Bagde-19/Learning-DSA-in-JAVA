package Array2D;

import java.util.Arrays;

//This work on the 2D Matrix which is linear sorted. ex row1 = 1,2,3; row2 = 4,5,6; row3 = 7,8,9;
public class BinarySearch2DArrayLinearSorted {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8 ,9}
        };

        System.out.println(Arrays.toString(search(arr, 9)));
    }


    static int[] search(int[][] matrix, int target){
        int row = matrix.length;
        int cols = matrix[0].length;

        if (row == 1){
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = row - 1;
        int cMid = cols/2;

        // Run loop till 2 rows are remaining
        while (rStart < (rEnd - 1)){ //While this is true it will have more than 2 rows
            int mid = rStart + (rEnd - rStart)/2;

            if (matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target){
                rStart = mid;
            }
            else {
                rEnd = mid;
            }
        }

        //now we have two rows
        //Check whether the target is in the column of 2 row
        if (matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target){
            return new int[]{rStart + 1, cMid};
        }

        //Search in 1st Half
        if (target <= matrix[rStart][cMid-1]){
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }

        //Search in 2nd Half
        if (target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1]){
            return binarySearch(matrix, rStart, cMid+1, cols-1, target);
        }

        //Search in 3rd Half
        if (target <= matrix[rStart+1][cMid-1]){
            return binarySearch(matrix, rStart+1, 0, cMid-1, target);
        }

        //Search in 4th Half
        else {
            return binarySearch(matrix, rStart+1, cMid+1, cols-1, target);
        }
    }

    //Simple Binary Search in row provided and between the columns provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;

            if (matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            else if (matrix[row][mid] > target) {
                cEnd = mid - 1;
            }
            else {
                cStart = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }
}
