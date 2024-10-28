public class LS_usingForEach {
        public static void main(String[] args) {
            int[] nums = {10,20,25,65,45,50};
            int target = 50;
            int ans = linearSearch(nums, target);
            System.out.println("Element is present at index : " + ans);

            //Using second function which return boolean value
            System.out.println("Element is present : " + linearSearch2(nums, target));
        }

        //search in the array: return the element if item found
        // otherwise return -1
        public static int linearSearch(int[] arr, int target){
            if (arr.length == 0){
                return -1;
            }

            //run a forEach loop to search
            for (int element : arr){
                if (element == target){
                    return element;
                }
            }

            //if target not found in the array return -1
            return -1;
        }

        //OR
    //Return true if found and false if not found
    public static boolean linearSearch2(int[] arr, int target){
        if (arr.length == 0){
            return false;
        }

        //run a forEach loop to search
        for (int element : arr){
            if (element == target){
                return true;
            }
        }

        //if target not found in the array return false
        return false;
    }
}

