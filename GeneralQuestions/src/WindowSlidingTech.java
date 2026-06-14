public class WindowSlidingTech {

     static int max_value = Integer.MIN_VALUE;
     static int winSum = 0;
     public static int winSliding(int arr[],int k, int n){
         for(int i=0;i<k;i++){
             winSum += arr[i];
         }
         for(int i=k;i<n;i++){
             winSum = winSum-arr[i-k]+arr[i];
             max_value = Math.max(max_value,winSum);
         }
         return max_value;
     }

    public static void main(String[] args) {
        int arr[]= {2,9,31,-4,21,7};
        int n = arr.length;
        int k=3;
        System.out.println(winSliding(arr,k,n));
    }
}