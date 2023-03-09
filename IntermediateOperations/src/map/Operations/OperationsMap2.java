package map.Operations;

import domain.Employee;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperationsMap2 {
    public static void main(String[] args) {
        Stream<Employee> emp = Employee.empList().stream();
        Map<Boolean,List<Employee>> maplist = emp
                .collect(Collectors.partitioningBy(x->x.getIncome()<1500));
        System.out.println("maplist = " + maplist);
    }
}
