public class SuperPrimeCut {
    public static boolean isPrime(int n){
        if(n <=1)return false;

        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static boolean superPrimeCut(int h){
        if(h<10) return isPrime(h);
        else if (isPrime(h)) {
            return superPrimeCut(h/10);
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(superPrimeCut(2333));
    }
}