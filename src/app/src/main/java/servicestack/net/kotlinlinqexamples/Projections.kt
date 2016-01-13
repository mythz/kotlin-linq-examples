package servicestack.net.kotlinlinqexamples

import net.servicestack.client.Log
import servicestack.net.kotlinlinqexamples.support.customers
import servicestack.net.kotlinlinqexamples.support.products
import java.util.*

class Projections {

    fun linq06() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        val numsPlusOne = numbers.map { it + 1 }

        Log.d("Numbers + 1:")
        numsPlusOne.forEach { Log.d(it) }
    }

    fun linq07() {
        val productNames = products.map { it.productName }

        Log.d("Product Names:")
        productNames.forEach { Log.d(it) }
    }

    fun linq08() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)
        val strings = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

        val textNums = numbers.map { strings[it] }

        Log.d("Number strings:")
        textNums.forEach { Log.d(it) }
    }

    fun linq09() {
        val words = arrayOf("aPPLE", "BlUeBeRrY", "cHeRry")

        val upperLowerWords = words.map { w -> Pair(w.toUpperCase(), w.toLowerCase()) }

        upperLowerWords.forEach { Log.d("Uppercase: ${it.first}, Lowercase: ${it.second}") }
    }

    fun linq10() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)
        val strings = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

        val digitOddEvens = numbers.map { Pair(strings[it], it % 2 == 0) }

        digitOddEvens.forEach {
            val (d,isEven) = it
            Log.d("The digit $d is ${if (isEven) "even" else "odd"}.")
        }
    }

    fun linq11() {
        val productInfos = products.map { p -> Triple(p.productName, p.category, p.unitPrice) }

        Log.d("Product Info:")
        productInfos.forEach {
            val (name,category,cost) = it
            Log.d("$name is in the category $category and costs $cost per unit.")
        }
    }

    fun linq12() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        val numsInPlace = numbers.mapIndexed { index, n -> Pair(n, n == index) }

        Log.d("Number: In-place?")
        numsInPlace.forEach { Log.d("${it.first.toString()}: ${it.second}") }
    }

    fun linq13() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)
        val digits = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

        val lowNums = numbers.filter { it < 5 }.map { digits[it] }

        Log.d("Numbers < 5:")
        lowNums.forEach { Log.d(it) }
    }

    fun linq14() {
        val numbersA = intArrayOf(0, 2, 4, 5, 6, 8, 9)
        val numbersB = intArrayOf(1, 3, 5, 7, 8)

        val pairs = numbersA.flatMap { a ->
            numbersB.filter { b -> a < b }
                    .map { Pair(a, it) }
        }

        Log.d("Pairs where a < b:")
        pairs.forEach { Log.d("${it.first.toString()} is less than ${it.second}") }
    }

    fun linq15() {
        val orders = customers.flatMap { c ->
            c.orders.filter { it.total < 500 }
                    .map { o -> Triple(c.customerId, o.orderId, o.total) }
        }

        orders.forEach { Log.d(it) }
    }

    fun linq16() {
        val date = Date(98, 0, 1) //= 1998-01-01
        val orders = customers.flatMap { c ->
            c.orders.filter { it.orderDate >= date }
                    .map { o -> Triple(c.customerId, o.orderId, o.orderDate) }
        }

        orders.forEach { Log.d(it) }
    }

    fun linq17() {
        val orders = customers.flatMap { c ->
            c.orders.filter { it.total >= 2000 }
                    .map { o -> Triple(c.customerId, o.orderId, o.total) }
        }

        orders.forEach { Log.d(it) }
    }

    fun linq18() {
        val cutoffDate = Date(97, 0, 1) //1997-01-01

        val orders = customers
            .filter { it.region == "WA" }.flatMap { c ->
                c.orders.filter { it.orderDate > cutoffDate }
                        .map { o -> Pair(c.customerId, o.orderId) }
            }

        orders.forEach { Log.d(it) }
    }

    fun linq19() {
        var custIndex = 0
        val customerOrders = customers.flatMap { c ->
            c.orders.mapIndexed { index, o -> "Customer #$index has an order with OrderID ${o.orderId}" }
        }

        customerOrders.forEach { Log.d(it) }
    }
}
