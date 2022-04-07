package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class Java11Q4 {
    public static void main(String[] args) throws IOException {
        var path = "D:\\Java IDE\\Studentlist.txt";
        String out = Files.readString(Path.of(path));
        List<String> lines = out.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip).toList();
        System.out.println("names : "+lines+" \ncount : "+lines.size());
    }
}