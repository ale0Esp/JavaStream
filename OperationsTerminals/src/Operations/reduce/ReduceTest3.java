package Operations.reduce;

import java.util.stream.IntStream;

public class ReduceTest3 {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(0, 100).summaryStatistics());
        System.out.println(IntStream.rangeClosed(0, 100).summaryStatistics().getSum());
        System.out.println(IntStream.rangeClosed(0, 100).summaryStatistics().getAverage());
    }
}
