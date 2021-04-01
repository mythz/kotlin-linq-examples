package servicestack.net.kotlinlinqexamples.support

class Product(var productId: Int, var productName: String, var category: String, var unitPrice: Double, var unitsInStock: Int) {

    override fun toString(): String {
        return "(Product id=$productId, name=$productName, cat=$category, price=$unitPrice, inStock=$unitsInStock)"
    }
}
