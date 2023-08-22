package mapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 중간 연산의 map 이 아닌 최종 연산에서의 mapping 은 중간연산에서 map 을 수행하고
 최종연산에서 Collectors 를 수행하는것과 동일하다.
 */
public class MappingStudy {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 5, -3, 3, 4, 5, 10);

        List<Integer> result1 = numbers.stream()
                .map(Math::abs)
                .collect(Collectors.toList());

        List<Integer> result2 = numbers.stream()
                .collect(Collectors.mapping(Math::abs, Collectors.toList()));

        System.out.println(result1);
        System.out.println(result2);
    }
}
