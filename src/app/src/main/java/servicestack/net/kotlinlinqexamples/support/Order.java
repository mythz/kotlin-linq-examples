package servicestack.net.kotlinlinqexamples.support;

import java.util.Date;

/**
 * Created by mythz on 7/26/2015.
 */
public class Order {

    public Integer orderId;
    public Date orderDate;
    public Double total;

    public Order(Integer orderId, Date orderDate, Double total) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.total = total;
    }

    @Override
    public String toString() {
        return "(Order " +
                "id=" + orderId +
                ", total=" + total +
                ')';
    }
}
