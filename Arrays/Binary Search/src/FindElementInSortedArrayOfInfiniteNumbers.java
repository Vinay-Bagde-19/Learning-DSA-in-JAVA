/**
 https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

 Suppose you have a sorted array of infinite numbers, how would you search an element in the array?
 Source: Amazon Interview Experience.
 */
public class FindElementInSortedArrayOfInfiniteNumbers {
    public static void main(String[] args) {

    }

//    static int range(int[] arr, int target){
//        //first find the range
//        // first start with a box of size 2 from 0 to 1
//        int start =
//    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                // the ans found
                return mid;
            }
        }
        return -1;
    }
}