import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestAtos {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       List<Integer> num=numbers.stream().map(x -> numbers.get(x)).collect(Collectors.toList());
       System.out.println("list of numbers"+ num);
    }
//    int a[]= {1,2,3,4,5,6,7,8,9,10};




}