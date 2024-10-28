package ForGivenRange;

public class LS_inGivenRange {
    public static void main(String[] args) {
        int[] nums = {10,20,25,65,45,50,75,2,-65,-45,27};
        int target = 2;
        int start = 1;
        int end = 9;
        int ans = linearSearchForGivenRange(nums, target, start, end);
        System.out.println("Element is present at index : " + ans);
    }

    //search in the array from start to end: return the index if item found
    // otherwise return -1
    public static int linearSearchForGivenRange(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }

        //run a for loop to search
        for (int index = start; index <= end; index++) {
            //check for element at every index from Start point to the End point if it is = target
            if (arr[index] == target){
                return index;
            }
        }

        //if target not found in the array return -1
        return -1;
    }
}
