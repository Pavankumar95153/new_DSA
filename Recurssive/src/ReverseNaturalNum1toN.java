public class ReverseNaturalNum1toN {
    public static void numbers(int n){
        if(n>0){
            System.out.print(n+" ");
            numbers(n-1);
        }
    }

    public static void main(String[] args) {
        numbers(10);
    }
}