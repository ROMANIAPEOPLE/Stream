package tomap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * toMap 은 인자로 KEY 와 VALUE 의 function 함수를 받는다.
 */

public class ToMapStudy {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 5, -4, 2, 6);
        Map<Integer, String> map1 = numbers.stream()
                .collect(Collectors.toMap(x -> x, x -> "number is" + x));

        System.out.println(map1);
    }
}
