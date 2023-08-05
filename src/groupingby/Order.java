package groupingby;

import java.math.BigDecimal;

public class Order {

    public void setId(int id) {
        this.id = id;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public OrderStatus getStatus() {
        return status;
    }

    private int id;
    private BigDecimal amount;
    private OrderStatus status;

    public Order(int id, BigDecimal amount, OrderStatus status) {
        this.id = id;
        this.amount = amount;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", amount=" + amount +
                ", status=" + status +
                '}';
    }
}
