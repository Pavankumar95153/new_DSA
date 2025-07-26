public class MagicIndex {


    public static int magicFast(int arr[], int start,int end){
        if(end<start) return -1;
        int mid = (start+end)/2;
        if(arr[mid]== mid){
            return mid;
        }/*else if(arr[mid]>mid){
            return magicFast(arr,start,mid-1);
        }else{
            return magicFast(arr,mid-1, end);
        }*/
        int leftIndex = Math.min(mid-1,arr[mid]);
        int left = magicFast(arr,start,leftIndex);
        if(left >=0) return left;

        int rightIndex = Math.max(mid+1,mid);
        int right = magicFast(arr,rightIndex,end);
        return  right;


    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11};
        int start = arr[0];
        int end =arr[arr.length-1];
        System.out.println( magicFast(arr,start,end));
    }

}