package servicestack.net.kotlinlinqexamples

import net.servicestack.client.Log
import servicestack.net.kotlinlinqexamples.support.customers
import servicestack.net.kotlinlinqexamples.support.products

class SetOperators {

    fun linq46() {
        val factorsOf300 = intArrayOf(2, 2, 3, 5, 5)

        val uniqueFactors = factorsOf300.distinct()

        Log.d("Prime factors of 300:")
        uniqueFactors.forEach { Log.d(it) }
    }

    fun linq47() {
        val categoryNames = products.map { it.category}.distinct()

        Log.d("Category names:")
        categoryNames.forEach { Log.d(it) }
    }

    fun linq48() {
        val numbersA = listOf(0, 2, 4, 5, 6, 8, 9)
        val numbersB = listOf(1, 3, 5, 7, 8)

        val uniqueNumbers = numbersA.union(numbersB)

        Log.d("Unique numbers from both arrays:")
        uniqueNumbers.forEach { Log.d(it) }
    }

    fun linq49() {
        val productFirstChars = products.map { it.productName[0] }

        val customerFirstChars = customers.map { it.companyName[0] }

        val uniqueFirstChars = productFirstChars.union(customerFirstChars)

        Log.d("Unique first letters from Product names and Customer names:")
        uniqueFirstChars.forEach { Log.d(it) }
    }

    fun linq50() {
        val numbersA = listOf(0, 2, 4, 5, 6, 8, 9)
        val numbersB = listOf(1, 3, 5, 7, 8)

        val commonNumbers = numbersA.intersect(numbersB)

        Log.d("Common numbers shared by both arrays:")
        commonNumbers.forEach { Log.d(it) }
    }

    fun linq51() {
        val productFirstChars = products.map { it.productName[0] }

        val customerFirstChars = customers.map { it.companyName[0] }

        val commonFirstChars = productFirstChars.intersect(customerFirstChars)

        Log.d("Common first letters from Product names and Customer names:")
        commonFirstChars.forEach { Log.d(it) }
    }

    fun linq52() {
        val numbersA = listOf(0, 2, 4, 5, 6, 8, 9)
        val numbersB = listOf(1, 3, 5, 7, 8)

        val aOnlyNumbers = numbersA.difference(numbersB)

        Log.d("Numbers in first array but not second array:")
        aOnlyNumbers.forEach { Log.d(it) }
    }

    fun linq53() {
        val productFirstChars = products.map { it.productName[0] }

        val customerFirstChars = customers.map { it.companyName[0] }

        val productOnlyFirstChars = productFirstChars.difference(customerFirstChars)

        Log.d("First letters from Product names, but not from Customer names:")
        productOnlyFirstChars.forEach { Log.d(it) }
    }
}
