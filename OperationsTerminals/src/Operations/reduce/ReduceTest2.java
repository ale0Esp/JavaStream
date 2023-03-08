package Operations.reduce;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReduceTest2 {

    public static void main(String[] args) {
        int[] arrN = {4, 7, 9, 5, 34, 5, 45, 45, 67, 8, 53, 3, 45, 57, 34, 56, 3, 2};
        int s = IntStream.of(arrN)
                .reduce(0, Integer::sum);
        System.out.println("s = " + s);
        Path path = Paths.get("Texto.txt");
        String text = "";
        try (Stream<String> lines = Files.lines(path)) {
            text = lines.map(x -> x.replace(",", ""))
                    .reduce("", (x, y) -> x.concat("\n").concat(y));

        } catch (IOException e) {}
       
        try ( BufferedWriter bw= new BufferedWriter(new FileWriter("text2.txt"))){
            bw.write(text);
        } catch (IOException ex) {
            Logger.getLogger(ReduceTest2.class.getName()).log(Level.SEVERE, null, ex);
        }
      

    }
}
