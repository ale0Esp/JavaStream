package createStreams;

import java.util.Random;
import java.util.stream.Stream;

public class CreateStreams2It {
    public static void main(String[] args) {
        Stream<Long> nl= Stream.iterate(1L,n->n+1 )
                .limit(133);
       // nl.forEach(System.out::println);
        Stream.iterate(1L, n->n+1)
                .filter(n->n%2==0)
                .limit(10)
                .forEach(System.out::println);
        System.out.println("Another iterate");
        Stream.iterate(1L, n->n+1)
                .filter(n->n%2==0)
                .skip(100L)
                .limit(10)
                .forEach(System.out::println);
        System.out.println("Randmo");
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
        System.out.println("randoms int");
        new Random().ints()
                .limit(4)
                .forEach(System.out::println);
    }
}
