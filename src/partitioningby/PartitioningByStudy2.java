package partitioningby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * ex. 친구가 5명 초과인 사람과 아닌 사람을 구분하라.
 */

public class PartitioningByStudy2 {

    public static void main(String[] args) {

        User user = new User(
                1L,
                "user1",
                "user1@user.com"
                , List.of(2L, 3L, 4L));

        User user2 = new User(
                2L,
                "user2",
                "user2@user.com"
                , List.of(145L, 226L, 47L));

        User user3 = new User(
                3L,
                "user3",
                "user3@user.com"
                , List.of(8L, 9L, 10L, 18L, 19L, 110L, 128L, 139L, 1410L));

        List<User> users = Arrays.asList(user, user2, user3);

        Map<Boolean, List<User>> collect = users.stream()
                .collect(Collectors.partitioningBy(u -> u.getFriendIds().size() > 5));

        System.out.println(collect);


    }

}