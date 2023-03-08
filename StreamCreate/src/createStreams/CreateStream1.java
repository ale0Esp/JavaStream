package createStreams;

import domain.Student;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream1 {
    public static void main(String[] args) {
        Stream<String> str1 = Stream.of("My value");
        str1.forEach(System.out::println);
        Stream<String> str2 = Stream.of("curso 1","curso 2","curso 3","curso 4");
        str2.forEach(System.out::println);
        String[] arrStr = {"c","c++","python","java"};
        Stream<String> str3 = Stream.of(arrStr);
        str3.forEach(System.out::println);
        Stream<Student> st = Stream.<Student>builder()
                .add(new Student("a01",15,1.8,7.0))
                .add(new Student("b01",16,1.8,8.0))
                .build();
        st.forEach(s-> System.out.println(s.getuID()));
        IntStream nm = IntStream.range(0, 21);
        nm.forEach(System.out::println);
    }
}
