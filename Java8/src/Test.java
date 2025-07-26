import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args){

      List<Employee> list = Stream.of(new Employee(1,"Pavan","100000","testpavan@gmail.com","Prog"),
              new Employee(2,"Pavan","20000","testKumar@gmail.com","QA"),
              new Employee(3,"Pavan","50000","testSai@gmail.com","Devops"),
              new Employee(4,"Kumar","150000","testKumar@gmail.com","Prog")).collect(Collectors.toList());

      Comparator<Employee> compareSalary = Comparator.comparing(Employee::getSal);

        Map <String,Employee>employeeSal=list.stream().collect(Collectors.groupingBy(Employee::getDev,
                Collectors.collectingAndThen(Collectors.maxBy(compareSalary), Optional::get)));
//        System.out.println(employeeSal);

        String str = "PavanKumar";
        Map<String,Long> countMap=Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countMap);

    }

}