package groupingby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupingByStudy {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(13, 2, 101, 203, 304, 402, 305, 349, 2312, 203);

        Map<Integer, List<Integer>> unit1 = numbers.stream()
                .collect(Collectors.groupingBy(number -> number % 10));

        System.out.println(unit1);

        // ---------------------------------------------------------

        Map<Integer, Set<Integer>> unit2 = numbers.stream()
                .collect(Collectors.groupingBy(number -> number % 10, Collectors.toSet()));

        System.out.println(unit2);

        // ---------------------------------------------------------

        Map<Integer, List<String>> unit3 = numbers.stream()
                .collect(Collectors.groupingBy(number -> number % 10,
                        Collectors.mapping(number -> "unit digit is " + number, Collectors.toList())));

        System.out.println(unit3);

    }


}
