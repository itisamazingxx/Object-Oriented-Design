package stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 流的创建
 */
public class StreamExample {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Moon", "Star", "Sun");
        List<String> reversed = words.stream()
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(reversed);

        Integer[] array = {42, 7, 11, 24};
        List<Integer> numbers = Arrays.asList(array);
        // 返回一个顺序流
        Stream<Integer> stream = numbers.stream();
        Stream<Integer> par_stream = numbers.parallelStream();
        System.out.println(stream);
        System.err.println(par_stream);
    }
    
}
