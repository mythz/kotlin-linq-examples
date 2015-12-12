package servicestack.net.kotlinlinqexamples.support;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mythz on 7/26/2015.
 */
public class Customer {
    public String customerId;
    public String companyName;
    public String address;
    public String city;
    public String region;
    public String postalCode;
    public String country;
    public String phone;
    public String fax;
    public List<Order> orders;

    public Customer() {
        orders = new ArrayList<Order>();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", orders='" + orders.size() + '\'' +
                '}';
    }
}
