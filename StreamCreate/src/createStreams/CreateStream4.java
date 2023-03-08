package createStreams;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class CreateStream4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in  = sc.nextLine();
        IntStream strchar = in.chars();
        
        strchar.filter(n -> !Character.isDigit((char)n)
                          &&!Character.isWhitespace((char)n))
                .forEach(n->System.out.println((char)n));
        
        String str="HTML, CSS, JAVASCRIPT, JAVA, SQL";
        Pattern.compile(", ")
                .splitAsStream(str)
                .forEach(System.out::println);
        
    }
}
