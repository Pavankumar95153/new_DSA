public class SqurtOfNum {
    public static  int sqrt(int num){
        int ans =0;
        for(int i = 0;i*i<=num;i++){
            ans = i;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("squareRoot of num-->"+sqrt(121));
    }
}