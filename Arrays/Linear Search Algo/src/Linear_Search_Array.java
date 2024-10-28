public class Linear_Search_Array {
    public static void main(String[] args) {
        int[] nums = {10,20,25,65,45,50};
        int target = 65;
        int ans = linearSearch(nums, target);
        System.out.println("Element is present at index : " + ans);
    }

    //search in the array: return the index if item found
    // otherwise return -1
    public static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        //run a for loop to search
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
            if (arr[index] == target){
                return index;
            }
        }

        //if target not found in the array return -1
        return -1;
    }
}
