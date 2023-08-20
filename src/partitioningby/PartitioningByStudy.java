package partitioningby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * GroupingBy 와 유사하지만 function 대신 predicate 를 사용해서 true/false 2 개의 key 로 분류한다.
 */
public class PartitioningByStudy {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(13, 2, 101, 203, 304, 402, 305, 349, 2312, 203);

        Map<Boolean, List<Integer>> collect = numbers.stream()
                .collect(Collectors.partitioningBy(number -> number % 2 == 0));

        System.out.println(collect);
    }
}
