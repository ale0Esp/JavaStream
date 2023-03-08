package domain;

import java.util.Arrays;
import java.util.List;

public class Employee implements Comparable<Employee>{

    private Long id;
    private String name;
    private double income;
    private Gender gender;
    private int age;

    public Employee() {
    }

    public Employee(Long id, String name, double income, Gender gender, int age) {
        this.id = id;
        this.name = name;
        this.income = income;
        this.gender = gender;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }

    public static enum Gender {
        MAN, WOMAN
    }
    public boolean isMan(){
        return this.gender==Gender.MAN;
    }
    public boolean isWoman(){
        return this.gender==Gender.WOMAN;
    }
    

    public static List<Employee> empList() {
        return Arrays.asList(
                new Employee(1L, "Ale", 1200.0, Gender.MAN, 23),
                new Employee(2L, "Pame", 1800.0, Gender.WOMAN, 30),
                new Employee(3L, "Kath", 1200.0, Gender.WOMAN, 18),
                new Employee(4L, "Josue", 2400.0, Gender.MAN, 25),
                new Employee(5L, "Daniel", 3000.0, Gender.MAN, 24),
                new Employee(6L, "Laura", 1000.0, Gender.WOMAN, 23),
                new Employee(7L, "Pedro", 1200.0, Gender.MAN, 34),
                new Employee(8L, "Jaqueline", 2400.0, Gender.WOMAN, 17),
                new Employee(9L, "Juan", 1800.0, Gender.MAN, 23),
                new Employee(10L, "Ale", 1200.0, Gender.MAN, 23),
                new Employee(11L, "Andrea", 1400.0, Gender.WOMAN, 23)
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id:").append(id);
        sb.append(", name:").append(name);
        sb.append(", income:").append(income);
        sb.append(", gender:").append(gender);
        sb.append(", age:").append(age);
        return sb.toString();
    }
    
}
