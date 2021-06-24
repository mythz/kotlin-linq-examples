package servicestack.net.kotlinlinqexamples.support

import java.util.ArrayList

class Customer {
    var customerId: String? = null
    var companyName: String = ""
    var address: String? = null
    var city: String? = null
    var region: String? = null
    var postalCode: String? = null
    var country: String? = null
    var phone: String? = null
    var fax: String? = null
    var orders: List<Order>

    init {
        orders = ArrayList<Order>()
    }

    override fun toString(): String {
        return "Customer{" + "customerId='" + customerId + '\'' + ", companyName='" + companyName + '\'' + ", orders='" + orders.size + '\'' + '}'
    }
}
