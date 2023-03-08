package intro_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Intro_Streams {

    public static void main(String[] args) {
        List <Integer> arr = Arrays.asList(1,2,3,4,5);
        Stream<Integer> n = arr.stream();
        Integer addition  = n
                .filter(x->x%2==1)
                .map(x->x*x)
                .reduce(0, Integer::sum);
        System.out.println("addition = " + addition);
    }
    
}
