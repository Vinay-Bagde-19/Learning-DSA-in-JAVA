//Works only on Sorted Arrays Ascending order
public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {-12, -10, -5, 0, 2, 3, 8, 10, 25, 30, 45, 98};
        int target = 45;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        /** find the middle element
         mid = (start + end) / 2  "But this might be possible that (start + end) exceed the integer range"

         So, we Should Use : "mid = start + (end - start) / 2"

         Ex.: if start = 0, end = 15 : mid = 0 + (10 - 0)/2  == 0 + 5 == 5
         */
        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
