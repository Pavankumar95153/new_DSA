import java.util.Arrays;

public class QuickSort {
    public static void swap(int arr[],int firstIndex, int secondIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex]= temp;
    }
    public static int pivot(int arr[], int pivotIndex, int endIndex){
        int swapIndex = pivotIndex;
        for(int i= pivotIndex+1;i<=endIndex;i++){
            if(arr[i]<arr[pivotIndex]){
                swapIndex++;
                swap(arr,swapIndex,i);
            }
        }
        swap(arr, pivotIndex,swapIndex);
        return swapIndex;
    }

    public static void sort(int arr[], int left, int right){
        if(left<right){
            int index = pivot(arr,left,right);
            sort(arr,left,index-1);
            sort(arr,index+1,right);
        }

    }
    public static void main(String[] args) {
        int arr[] = {4,6,1,7,3,2,5};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}