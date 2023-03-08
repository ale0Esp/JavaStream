package filter.operations;

import domain.Employee;
import java.util.List;
import java.util.function.Predicate;

public class OperationsFilter {

    public static void main(String[] args) {
        List<Employee> empList = Employee.empList();
        System.out.println("Filter men");
        empList.stream()
                .filter(Employee::isMan)
                .forEach(System.out::println);
        System.out.println("\nEmployee girls");
        empList.stream()
                .filter(x->x.isWoman())
                .forEach(System.out::println);
        System.out.println("Employee >25");
        empList.stream()
                .filter(x->x.getAge()>25)
                .forEach(System.out::println);
        System.out.println("Employee >20 and men");
        empList.stream()
                .filter(x-> x.isMan() && x.getAge()>23)
                .forEach(System.out::println);
        System.out.println("Employee man and name start a");
        empList.stream()
                .filter(Employee::isMan)
                .filter(x->x.getName().startsWith("A"))
                .forEach(System.out::println);
        System.out.println("Employee man and incomes >1500");
        empList.stream()
                .filter(x-> x.isMan()&& x.getIncome()>1500)
                .forEach(System.out::println);
        System.out.println("Employee owman and incomes >1500");
        Predicate<Employee> pr1 = (x->x.isWoman());
        Predicate<Employee> pr2 = (x->x.getAge()>18);
        Predicate<Employee> pr3 = (x->x.getIncome()>100);
        Predicate<Employee> prf = pr1.and(pr2).and(pr3);
        empList.stream()
                .filter(prf)
                .forEach(System.out::println);
        System.out.println("Quantity employee "+  empList.stream().filter(prf).count()) ;
    }
}




/********Another Forms**********/

/*Filter predi ate
*.filter(new Predicate<Employee>() {
                    @Override
                    public boolean test(Employee t) {
                        return t.isMan();
                    }

                }
*/