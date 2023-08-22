package max_min_count;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * MIN 과 MAX 는 Comparator 를 인자로 받는다.
 */

public class MaxMinStudy {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        Optional<Integer> min = numbers.stream()
                .min((x, y) -> x - y);

        System.out.println(min.get());

        Optional<Integer> min2 = numbers.stream()
                .min(Integer::compareTo);

        System.out.println(min2.get());

        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);

        System.out.println(max.get());


        Optional<Integer> max2 = numbers.stream()
                .max(Comparator.comparingInt(x -> x));

        System.out.println(max2.get());




    }


}
