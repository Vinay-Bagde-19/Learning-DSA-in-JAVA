import java.util.Arrays;

//Use the Algorithm when we are give a range 1 to n
public class Cycle_Sort_Algorithm {
    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 1, 4};
        CycleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void CycleSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i]-1; //correct = correct index of the element.
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
