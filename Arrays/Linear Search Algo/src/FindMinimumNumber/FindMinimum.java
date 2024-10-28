package FindMinimumNumber;

public class FindMinimum {
    public static void main(String[] args) {
        int[] nums = {10,2,-10,-40,56,85,9,0};
        int minNum = FindMinimumNumber(nums);
        System.out.println(minNum);
    }

    //finding Minimum Number
    static int FindMinimumNumber(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
