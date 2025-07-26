import java.util.*;

public class SecondLargestNumInArray {
    public static void main(String[] args) {
        int arr[] = {35,15,25,20,5};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}