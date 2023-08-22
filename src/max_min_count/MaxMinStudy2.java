package max_min_count;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * min 과 max 의 인자인 Comparator 는 Comparator.comparing() 을 인자로 전달할 수 있다.
 */

public class MaxMinStudy2 {
    public static void main(String[] args) {

        User user = new User(1L, "Alice", "email", null);
        User user2 = new User(2L, "BOB", "email", null);
        User user3 = new User(3L, "CL", "email", null);
        User user4 = new User(4L, "DANGER", "email", null);

        List<User> users = Arrays.asList(user, user2, user3, user4);

        Optional<User> min = users.stream()
                .min((u1, u2) -> u1.getName().compareTo(u2.getName()));

        System.out.println(min.get().getName());

        Optional<User> min2 = users.stream()
                .min(Comparator.comparing(User::getName));

        System.out.println(min2.get().getName());
    }

}
