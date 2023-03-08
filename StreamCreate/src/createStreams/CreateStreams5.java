package createStreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CreateStreams5 {
    public static void main(String[] args) {
        Path p = Paths.get("Texto.txt");
        try(Stream<String> lines = Files.lines(p)){
            lines.forEach(l->System.out.println(l));
        }catch(IOException e){
            e.printStackTrace();
        }
        Path dir = Paths.get(".");
        System.out.printf("%nfiles tree %s is %n: ", dir.toAbsolutePath());
        try(Stream<Path> pts = Files.walk(dir)){
            pts.forEach(System.out::println);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
