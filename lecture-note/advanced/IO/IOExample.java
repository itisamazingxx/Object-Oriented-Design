package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IOExample {
    public static void main(String[] args) {
        String filePath = "data.txt";
        Set<String> uniqueSet = new HashSet<>();
        try {
            Scanner scanner = new Scanner(new File(filePath));
            if (scanner.hasNextLine()) {
                int count = Integer.parseInt(scanner.nextLine());
            }
            while (scanner.hasNextLine()) {
                String word = scanner.nextLine();
                uniqueSet.add(word);
            }
            scanner.close();
            for (String word : uniqueSet) {
                System.out.println(word);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

class IOExampleMethod {
    public void method() {
        String filePath = "data.txt";
        try {
            try(Stream<String> lines = Files.lines(Paths.get(filePath))) {
                Set<String> uniqueSet = lines
                        .skip(1)
                        .collect(Collectors.toSet());
                uniqueSet.forEach(System.out::println);
            }
        }
        catch (IOException e) {
                throw new RuntimeException(e);
        }
    }
}
