public class MaxSumArray {
    public static int maxSumSubArr(int arr[],int n, int k){
         int max_sum = Integer.MIN_VALUE;

        for(int i=0; i<n-k;i++){
            int currentSum =0;
            for(int j=i;j<k;j++){
                currentSum += arr[j];
            }
            max_sum = Math.max(currentSum,max_sum);

        }
        return max_sum;
    }

    public static void main(String[] args) {
        int arr[]= {5,2,-1,0,1};
        int n = arr.length;
        int k=3;
        System.out.println(maxSumSubArr(arr,n,k));
    }
}