public class NaturalNum1toN {
    public static void numbers(int n){
        if(n>0){
            numbers(n-1);
            System.out.println(n);

        }
    }

    public static void main(String[] args) {
        numbers(10);
    }
}