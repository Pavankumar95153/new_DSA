public class PracticeRecu1 {
    static int func1(int n){
        if(n==1) return 1;
        else{
            return n +func1(n/2);
        }
    }
    static void func2(int n){
        if(n==1) return;
        func2(n/2);
        System.out.println(n%2);

    }

    static void func3(int n){
        if(n>1){
            func3(n-1);
        }
        for(int i=0;i<n;i++){
            System.out.print("*");
        }

    }
    static void fun4(int x)
    {
        if(x > 0)
        {
            fun4(--x);
            System.out.print(x + " ");
            fun4(--x);
        }
    }

    static void abc(String s)
    {
        if(s.length() == 0)
            return;

        abc(s.substring(1));
        abc(s.substring(1));
        System.out.print(s.charAt(0));
    }
    static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
    public static void main(String[] args) {
        System.out.println( sum(5,10));
    }
}