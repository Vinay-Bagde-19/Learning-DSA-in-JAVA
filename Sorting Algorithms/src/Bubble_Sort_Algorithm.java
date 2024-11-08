import java.util.Arrays;

public class Bubble_Sort_Algorithm {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void bubbleSort(int[] arr){
        boolean swapped;
        //Run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //For each step, max item will come at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
                //Swap
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    //Make swapped to true
                    swapped = true;
                }
            }
            //If you did not swap for a particular value of i, it means the array is sorted hence stop the loops
            if (!swapped){ //!false = true. We can also write (swapped == false)
                break;
            }
        }
    }
}
