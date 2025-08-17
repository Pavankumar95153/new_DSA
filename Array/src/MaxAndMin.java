import java.util.Arrays;

public class MaxAndMin {
    public static int[] minAndMax(int [] nums){
        int minimum = nums[0];
        int maximum = nums[0];
        for(int num:nums){
            if(num>maximum){
                maximum=num;
            } else if (num<minimum) {
                minimum=num;
            }
        }
        return new int[]{maximum,minimum};
    }

    public static void main(String[] args) {
        int[] myList1 = {5, 3, 8, 1, 6, 9};
        for(int num:minAndMax(myList1)){
            System.out.println(num);
        }
    }
}