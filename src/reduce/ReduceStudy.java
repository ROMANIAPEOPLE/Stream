package reduce;

import java.util.Arrays;
import java.util.List;

/**
 * 1. reduce 는 인자로 BinaryOperator 를 받는데, 이는 input 과 output 이 동일한 함수이다.
 * 2. 첫번째 인자에 초기값을 받고, 두번째 인자로  BinaryOperator 를 받을수도 있다. 초기값이 존재하기 때문에 리턴타입이
 Optional이 아니다. (초기값도 계산에 포함된다)
 * 3.
 */

public class ReduceStudy {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 4, -2, 5, 3);
        Integer sum = numbers.stream()
                .reduce((x, y) -> x + y)
                .get();

        System.out.println(sum);

        Integer sum2 = numbers.stream()
                .reduce(Integer::sum)
                .get();

        System.out.println(sum2);

        Integer min = numbers.stream()
                .reduce(Integer::min)
                .get();

        System.out.println(min);

        Integer product = numbers.stream()
                .reduce(100, (x, y) -> x * y);

        System.out.println(product);

    }
}
