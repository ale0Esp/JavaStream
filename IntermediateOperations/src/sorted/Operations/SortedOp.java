package sorted.Operations;

import domain.Employee;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedOp {

    public static void main(String[] args) {
        List<Employee> empList = Employee.empList();
        List<String> strList = Arrays.asList("Maria", "Juan", "Ale", "Kath");
        Arrays.asList(5, 3, 7, 3, 2, 8, 4, 2, 1)
                .stream().sorted().forEach(System.out::println);
        strList.stream().sorted().forEach(System.out::println);
        System.out.println("Empl lis w alphabetic order");
        empList.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("Empl lis w age order");
        empList.stream()
                .sorted(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return o1.getAge() - o2.getAge();
                    }
                })
                .forEach(System.out::println);
                System.out.println("Empl lis w incomes order");
        empList.stream()
                .filter(x->x.getAge()>20)
                .sorted((x,y)->(int)(x.getIncome()-y.getIncome()))
                .forEach(System.out::println);
    }
}
