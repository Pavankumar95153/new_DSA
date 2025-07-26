public class TestInterview implements Add {
    public static void main(String[] args){

        TestInterview testInterview = new TestInterview();
        int result=testInterview.addNum(2,5);
        System.out.println("result ->"+ result);

}

    @Override
    public int addNum(int a, int b) {
        return a+b;
    }

}