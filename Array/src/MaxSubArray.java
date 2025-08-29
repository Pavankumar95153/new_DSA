import java.util.Arrays;


public class MaxSubArray {

    // WRITE THE MAXSUBARRAY METHOD HERE //
    //                                   //
    //                                   //
    //                                   //
    //                                   //
    ///////////////////////////////////////
    public static int maxSubarray(int[] nums){
        int maxSum = nums[0];
        int currentSum = nums[0];
        for(int i=1;i<nums.length;i++){
            currentSum = Math.max(nums[i],currentSum+nums[i]);
            maxSum = Math.max(currentSum,maxSum);
        }
        return maxSum;

    }



    public static void main(String[] args) {
        // Example 1: Simple case with positive and negative numbers
        int[] inputCase1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result1 = maxSubarray(inputCase1);
        System.out.println("Example 1: Input: " + Arrays.toString(inputCase1) + "\nResult: " + result1);


    }

}