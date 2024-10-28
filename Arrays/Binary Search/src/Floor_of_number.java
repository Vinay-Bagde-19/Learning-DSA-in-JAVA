public class Floor_of_number {
    public static void main(String[] args) {
        int[] arr = {2, 3, 8, 10, 15, 25, 30, 45, 98};
        int target = 12;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    // return the index of target if found
    //When condition get violated return end which will be the smallest number just before target
    static int floor(int[] arr, int target){

        //but if the target is the smallest number than the smallest number in the array
        if (target < arr[0]){
            return -1;
        }

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
        return end;
    }
}
