package Operations.mutable;

import domain.Employee;
import java.util.Map;
import java.util.stream.Collectors;

public class OperationsCollect2 {
    public static void main(String[] args) {
        Map<Long,String> emp = Employee.empList()
                .stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
        System.out.println(emp);
        
        Map<Employee.Gender,String> genderMap = Employee.empList()
                .stream()
                .collect(Collectors.toMap(Employee::getGender,Employee::getName,
                        (x,y)->String.join(",", x,y)));
        
        System.out.println(genderMap);
    }
}
