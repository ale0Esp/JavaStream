package map.Operations;

import domain.Employee;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class OperationsMap {
    public static void main(String[] args) {
//        IntStream.rangeClosed(0, 5)
//                .map(x->x*x)
//                .forEach(System.out::println);
//        IntStream.rangeClosed(1, 10)
//                .map(x->x*2)
//                .forEach(System.out::println);

           List<Employee> empList = Employee.empList();
         
           double sum = empList.stream()
                   .filter(Employee::isWoman)
                   .mapToDouble(x->x.getIncome())
                   .sum();
           double averageIncomes = sum/empList.stream()
                   .filter(Employee::isWoman).count();
                   
            System.out.println("Incomes woman" + averageIncomes);  
    }
}
