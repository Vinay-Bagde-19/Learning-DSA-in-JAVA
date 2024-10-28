public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        //int[] arr = {-12, -10, -5, 0, 2, 3, 8, 10, 25, 30, 45, 98}; //Ascending
        int[] arr = {85, 45, 36, 30, 25, 22, 18, 10, 5, 2, 0, -5, -10};
        int target = 45;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //Find whether the array is sorted in Ascending or Descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start) / 2;

            //If mid is equal to target return mid
            if (arr[mid] == target){
                return mid;
            }

            //Check if it is Ascending
            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                }
                else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {  // Do this when it is Descending
                if (target > arr[mid]){
                    end = mid - 1;
                }
                else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
