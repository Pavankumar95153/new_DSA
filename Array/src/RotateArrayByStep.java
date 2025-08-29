import java.util.Arrays;

public class RotateArrayByStep {


    public static void rotate(int [] nums,int k){
        k= k%nums.length;
        for(int start=0,end =nums.length-k-1;
            start<end;
            start++,end--){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]= temp;
        }
        for(int start = nums.length-k,end= nums.length-1;start<end;start++,end--){
            int temp = nums[start];
            nums[start]= nums[end];
            nums[end]=temp;
        }

        for(int start=0,end=nums.length-1;start<end;start++,end--){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]= temp;
        }
    }



    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        rotate(nums1, k1);
        System.out.println("Test case 1: Rotated array: " + Arrays.toString(nums1));  // prints "Rotated array: [5, 6, 7, 1, 2, 3, 4]"



    }

}