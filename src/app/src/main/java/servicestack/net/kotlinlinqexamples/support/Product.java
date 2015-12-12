package servicestack.net.kotlinlinqexamples.support;

/**
 * Created by mythz on 7/26/2015.
 */
public class Product {
    public Integer productId;
    public String productName;
    public String category;
    public Double unitPrice;
    public Integer unitsInStock;

    public Product(Integer productId, String productName, String category, Double unitPrice, Integer unitsInStock) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
    }

    @Override
    public String toString() {
        return "(Product " +
                "id=" + productId +
                ", name=" + productName +
                ", cat=" + category +
                ", price=" + unitPrice +
                ", inStock=" + unitsInStock +
                ')';
    }
}
