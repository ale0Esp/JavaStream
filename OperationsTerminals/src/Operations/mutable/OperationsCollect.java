package Operations.mutable;

import domain.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class OperationsCollect {
    public static void main(String[] args) {
        
//        List namesEmp = Employee.empList().stream()
//                .map(Employee::getName)
//                .collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
        
        List namesEmp = Employee.empList().stream()
                .map(Employee::getName)
                .collect(Collectors.toList());//toSet, toMap
                                          
        SortedSet<String> namesEmp2 = Employee.empList().stream()
                .map(Employee::getName)
                .collect(Collectors.toCollection(TreeSet::new));//toSet, toMap
        System.out.println(namesEmp2);
    }
}
