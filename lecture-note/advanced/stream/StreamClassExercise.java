package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class StreamClassExercise {
    
}

class NumberSquareMap {

    public void hi() {
        List<Integer> number = Arrays.asList(2, 4, 5, 6, 8);
        Map<Integer, Integer> squareMap = number.stream()
        .collect(Collectors.toMap(num -> num, num -> num * num));
    }

}

class listStringLength {

    public void hi() {

    }

}
