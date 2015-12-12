package servicestack.net.kotlinlinqexamples

import net.servicestack.client.Log
import servicestack.net.kotlinlinqexamples.support.Data.getCustomerList

class Partitioning {

    fun linq20() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        val first3Numbers = numbers.take(3)

        Log.d("First 3 numbers:")
        first3Numbers.forEach { Log.d(it) }
    }

    fun linq21() {
        val customers = getCustomerList()

        val first3WAOrders = customers
            .filter {  it.region == "WA" }
            .flatMap { c ->
                c.orders.map { o -> Triple(c.customerId, o.orderId, o.orderDate) }
            }
            .take(3)

        Log.d("First 3 orders in WA:")
        first3WAOrders.forEach { Log.d(it) }
    }

    fun linq22() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        val allButFirst4Numbers = numbers.skip(4)

        Log.d("All but first 4 numbers:")
        allButFirst4Numbers.forEach { Log.d(it) }
    }

    fun linq23() {
        val customers = getCustomerList()

        val waOrders = customers
            .filter { it.region == "WA" }
            .flatMap { c ->
                c.orders.map { o -> Triple(c.customerId, o.orderId, o.orderDate) }
            }

        val allButFirst2Orders = waOrders.skip(2)

        Log.d("All but first 2 orders in WA:")
        allButFirst2Orders.forEach { Log.d(it) }
    }

    fun linq24() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        val firstNumbersLessThan6 = numbers.takeWhile { it < 6 }

        Log.d("First numbers less than 6:")
        firstNumbersLessThan6.forEach { Log.d(it) }
    }

    fun linq25() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        var index = 0
        val firstSmallNumbers = numbers.takeWhile { it >= index++ }

        Log.d("First numbers not less than their position:")
        firstSmallNumbers.forEach { Log.d(it) }
    }

    fun linq26() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        val allButFirst3Numbers = numbers.skipWhile { it % 3 != 0 }

        Log.d("All elements starting from first element divisible by 3:")
        allButFirst3Numbers.forEach { Log.d(it) }
    }

    fun linq27() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        var index = 0
        val laterNumbers = numbers.skipWhile { it >= index++ }

        Log.d("All elements starting from first element less than its position:")
        laterNumbers.forEach { Log.d(it) }
    }
}
