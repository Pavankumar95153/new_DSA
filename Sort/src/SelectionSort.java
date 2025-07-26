public class SelectionSort {
    static void selectionSrot(int arr[])
    {
        for(int i = 0 ;i<arr.length-1;i++){
            int min_index = i; //assume current element is smaller
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
                int temp = arr[i];
                arr[i]= arr[min_index];
                arr[min_index]= temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        selectionSrot(arr);
        for(int values: arr){
            System.out.println(values);
        }
       /* for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/
    }
}