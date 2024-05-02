package stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class StreamClassExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa", "vv", "ccc");
        // 映射 map()会操作每一个元素
        // list.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
        // print AA VV CCC

        StreamClassExample01 streamClassExample01 = new StreamClassExample01();
        // streamClassExample01.method01();
        // streamClassExample01.method2();
        // streamClassExample01.method03();
        streamClassExample01.method04();

        // Take a List of integers and create a new one that replaces each number’s last digit (one’s place) with
        // its leading digit (the highest place value) but be careful that some numbers might be negative.

        // Converts a List of floating point numbers into a list
        // that truncates anything after the hundredth’s place
//        List<Float> floatList = Arrays.asList(42.19842f, -123.45678f, 3.14159f);
//        List<Float> filteredFloatList = floatList.stream()
//                .map(num -> (float) (Math.floor(num * 100) / 100))
//                .collect(Collectors.toList());
//        for (Float num : filteredFloatList) {
//            System.out.println(num);
//        }

    }
}

class StreamClassExample01 {
    // Given a list of Strings that contain every word in the English language
    // remove every String that contains a vowel
    public void method01() {
        List<String> list2 = Arrays.asList("emily", "john", "ariel", "carl", "mflly");
        List<String> filteredList = list2.stream()
                .filter(s -> !s.matches(".*[aeiouAEIOU].*"))
                .collect(Collectors.toList());
        for (String str : filteredList) {
            System.out.println(str);
        }
    }

    // Converts a list of string of reversed string
    public void method2() {
        List<String> list = Arrays.asList("Moon", "Morning");
        List<String> convertedList = list.stream()
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.toList());
        convertedList.forEach(System.out::println);
    }

    // Converts a list of numbers into a map of each number to its square version
    public void method03() {
        List<Integer> nums = Arrays.asList(3, 4, 5, 6);
        List<Integer> convertedNums = nums.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
        convertedNums.forEach(System.out::println);
    }

    // Converts an array of String to hashmap that contains the origin string
    // as the key and the num of times that num appears as value
    public void method04() {
        String[] strings = {"lily", "lily", "bob"};
        HashMap<String, Integer> map_ = new HashMap<>();
        for (String str : strings) {
            if (!map_.containsKey(str)) {
                map_.put(str, 1);
            } else {
                map_.put(str, map_.get(str) + 1);
            }
        }
    }


}
