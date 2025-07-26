import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int arr [] = {35,4,10,25,5};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp=0;
                if(arr[i]> arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]+" ");
        }
//        Arrays.stream(arr).sorted().forEach(System.out::println);
    }
}