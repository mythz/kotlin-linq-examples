package servicestack.net.kotlinlinqexamples

import net.servicestack.client.Log
import servicestack.net.kotlinlinqexamples.support.Data.*

class Restrictions {

    fun linq1() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        val lowNums = numbers.filter { it < 5 }

        Log.d("Numbers < 5:")
        lowNums.forEach { Log.d(it) }
    }

    fun linq2() {
        val products = getProductList()

        val soldOutProducts = products.filter { it.unitsInStock == 0 }

        Log.d("Sold out products:")
        soldOutProducts.forEach { Log.d("${it.productName} is sold out!") }
    }

    fun linq3() {
        val products = getProductList()

        val expensiveInStockProducts = products.filter { it.unitsInStock > 0 && it.unitPrice > 3.00 }

        Log.d("In-stock products that cost more than 3.00:")
        expensiveInStockProducts.forEach { Log.d("${it.productName} is in stock and costs more than 3.00.") }
    }

    fun linq4() {
        val customers = getCustomerList()

        val waCustomers = customers.filter { "WA" == it.region }

        Log.d("Customers from Washington and their orders:")
        waCustomers.forEach { c ->
            Log.d("Customer " + c.customerId + " " + c.companyName)
            c.orders.forEach { Log.d("  Order ${it.orderId}: ${dateFmt(it.orderDate)}") }
        }
    }

    fun linq5() {
        val digits = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

        var i = 0
        val shortDigits = digits.filter { it.length < i++ }

        Log.d("Short digits:")
        shortDigits.forEach { Log.d("The word $it is shorter than its value.") }
    }
}
