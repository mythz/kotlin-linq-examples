package servicestack.net.kotlinlinqexamples

import net.servicestack.client.Log
import servicestack.net.kotlinlinqexamples.support.Data.getCustomerList
import servicestack.net.kotlinlinqexamples.support.Data.getProductList
import java.util.*

class MiscOperators {

    fun linq94() {
        val numbersA = intArrayOf(0, 2, 4, 5, 6, 8, 9)
        val numbersB = intArrayOf(1, 3, 5, 7, 8)

        val allNumbers = numbersA + numbersB

        Log.d("All numbers from both arrays:")
        allNumbers.forEach { Log.d(it) }
    }

    fun linq95() {
        val customers = getCustomerList()
        val products = getProductList()

        val customerNames = customers.map { it.companyName }

        val productNames = products.map { it.productName }

        val allNames = customerNames + productNames

        Log.d("Customer and product names:")
        allNames.forEach { Log.d(it) }
    }

    fun linq96() {
        val wordsA = arrayOf("cherry", "apple", "blueberry")
        val wordsB = arrayOf("cherry", "apple", "blueberry")

        val match = Arrays.equals(wordsA, wordsB)

        Log.d("The sequences match: $match")
    }

    fun linq97() {
        val wordsA = arrayOf("cherry", "apple", "blueberry")
        val wordsB = arrayOf("cherry", "blueberry", "cherry")

        val match = Arrays.equals(wordsA, wordsB)

        Log.d("The sequences match: $match")
    }
}
