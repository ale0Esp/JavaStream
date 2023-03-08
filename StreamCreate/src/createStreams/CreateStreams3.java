package createStreams;

import domain.Student;
import java.util.*;
import java.util.stream.*;

public class CreateStreams3 {
    public static void main(String[] args) {
        IntStream arr = Arrays.stream(new int[]{1,2,3,4,5,6});
        arr.forEach(System.out::println);
        Stream<String> names = Arrays.stream(new String[]{"Maria","Daniel","Pame","Ale"});
        names.forEach(System.out::println);
       // names.count(); Exception ´cause the stream has close before 
        Set<String> languajes = new HashSet<>();
        languajes.add("java");
        languajes.add("c");
        languajes.add("python");
        Stream<String> lStr =languajes.stream();
        lStr.forEach(System.out::println);
        List<Student> students = new ArrayList<>();
        students.add(new Student("a01",15,1.8,7.0));
        students.add(new Student("a01",15,1.8,7.0));
        students.add(new Student("a01",15,1.8,7.0));
        Stream<Student> stStreams = students.parallelStream();
        stStreams.forEach(s-> System.out.println(s));
        
    }
}
