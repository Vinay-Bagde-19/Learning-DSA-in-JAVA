public class Find_Rotation_Count_In_Rotated_SortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        System.out.println(countRotation(arr));
    }

    private static int countRotation(int[] arr) {
        int pivot = findPivot(arr);
        return pivot+1;
    }

    //Use this when array does not contain duplicate elements
    static int findPivot(int[] arr){
        int start =  0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            //Case 1
            if (mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            //Case 2
            if (mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            //Case 3
            if (arr[mid] <= arr[start]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }

    //Use this when array contains duplicate elements
    static int findPivotWithDuplicates(int[] arr){
        int start =  0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            //Case 1
            if (mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            //Case 2
            if (mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            // If elements at middle, start and end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                //Skip the duplicates

                // NOTE: what if these elements at start and end were the pivot??
                // Check if start is pivot
                if (arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                //check if end is pivot
                if (arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
