public class Main {
    static void printFunc(int test){
        if(test < 1) return;
        else {
            System.out.printf("%d",test);
            printFunc(test -1);
            System.out.printf("%d",test);
            return;
        }
    }
    public static void main(String[] args) {
        printFunc(3);
    }
}