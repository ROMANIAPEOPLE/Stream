package groupingby;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByStudy2 {

    public static void main(String[] args) {


        Order order1 = new Order(1, BigDecimal.valueOf(2000), OrderStatus.CREATED);
        Order order2 = new Order(2, BigDecimal.valueOf(3000), OrderStatus.ERROR);
        Order order3 = new Order(3, BigDecimal.valueOf(4000), OrderStatus.PROCESSED);
        Order order4 = new Order(4, BigDecimal.valueOf(5000), OrderStatus.ERROR);

        List<Order> orders = Arrays.asList(order1, order2, order3, order4);

        Map<OrderStatus, List<Order>> result1 = orders.stream()
                .collect(Collectors.groupingBy(Order::getStatus));

        System.out.println(result1);


        Map<OrderStatus, BigDecimal> result2 = orders.stream()
                .collect(Collectors.groupingBy(Order::getStatus,
                        Collectors.mapping(Order::getAmount, Collectors.reducing(BigDecimal.ZERO, BigDecimal::add))));

        System.out.println(result2);
    }


}
