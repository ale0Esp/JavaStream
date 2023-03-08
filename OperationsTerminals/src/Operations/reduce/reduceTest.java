package Operations.reduce;

import domain.Employee;
import java.util.List;
import java.util.stream.IntStream;

public class reduceTest {

    public static void main(String[] args) {
        List<Employee> empList = Employee.empList();
        int[] arrN = {4, 7, 9, 5, 34, 5, 45, 45, 67, 8, 53, 3, 45, 57, 34, 56, 3, 2};
        System.out.println("Addition of int arr " + IntStream.of(arrN).sum());
        System.out.println("average of int arr " + IntStream.of(arrN).average().getAsDouble());
        System.out.println("max of int arr " + IntStream.of(arrN).max().getAsInt());
        System.out.println("min of int arr " + IntStream.of(arrN).min().getAsInt());
        System.out.println("count of int arr " + IntStream.of(arrN).count());
        //working w employee}
        System.out.println("sum of employee incomes: " + empList.stream()
                .mapToDouble(Employee::getIncome).sum());
        System.out.println("Employee w income max w maptodouble: " + empList.stream()
                .mapToDouble(Employee::getIncome).max().getAsDouble());
        System.out.println("Employee w income max w max: " + empList.stream()
                .max((x,y)->(int)(x.getIncome()-y.getIncome())).get());
    }
}
