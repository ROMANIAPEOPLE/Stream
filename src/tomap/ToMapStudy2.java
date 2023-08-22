package tomap;

import max_min_count.User;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMapStudy2 {
    public static void main(String[] args) {
        User user = new User(1L, "Alice", "email", null);
        User user2 = new User(2L, "BOB", "email", null);
        User user3 = new User(3L, "CL", "email", null);
        User user4 = new User(4L, "DANGER", "email", null);

        List<User> users = Arrays.asList(user, user2, user3, user4);

        Map<Long, User> userMap = users.stream()
                .collect(Collectors.toMap(User::getId, Function.identity()));

        System.out.println(userMap);

    }
}
