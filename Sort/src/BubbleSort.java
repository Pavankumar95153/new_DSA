public class BubbleSort {
        public static void bubbleSort(int arr[], int n){
            n = arr.length;
            int temp;
            for(int i = 0;i<n;i++){
                for(int j = i+1;j<n-1;j++){
                    if(arr[i] > arr[j+1]){
                         temp = arr[i];
                        arr[i] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 1, 3 };
        int n = arr.length;
        bubbleSort(arr,n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

}