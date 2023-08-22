package allmatch_anymatch;

import java.util.Arrays;
import java.util.List;

/**
 * AnyMatch 와 AllMatch 는 predicate 를 인자로 받고, boolean 을 리턴한다.
 */

public class MatchStudy {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(-1, 0, 2, 3, -1);
        boolean result = numbers.stream()
                .allMatch(number -> number > 0);

        System.out.println(result);
    }

}
