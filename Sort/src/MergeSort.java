import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int [] arr1,int [] arr2){
        int combine [] = new int[arr1.length+arr2.length];
        int index = 0;
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                combine[index] = arr1[i];
                index++;
                i++;
            }else{
                combine[index] = arr2[j];
                index++;
                j++;
            }
        }
        while(i<arr1.length){
            combine[index] = arr1[i];
            index++;
            i++;
        }
        while(j<arr2.length){
            combine[index] = arr2[j];
            index++;
            j++;
        }
        return combine;
    }
    public static int[] mergeSortArray(int [] arr){
        if(arr.length ==1)return arr;
        int mid = arr.length/2;
        int left[] = mergeSortArray(Arrays.copyOfRange(arr,0,mid));
        int right[] = mergeSortArray(Arrays.copyOfRange(arr,mid,arr.length));
        return mergeSort(left,right);
    }
    public static void main(String[] args) {
        int a[] ={1,3,7,8};
        int b[] ={2,4,5,6};
        int c[] = {3,1,6,8,2,5};
//        System.out.println(Arrays.toString(mergeSort(a,b)));
        System.out.println(Arrays.toString(mergeSortArray(c)));
        /*int c[] = mergeSort(a,b);
        for(int i = 0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }*/
    }
}