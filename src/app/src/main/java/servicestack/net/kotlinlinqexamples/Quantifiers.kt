package servicestack.net.kotlinlinqexamples

import net.servicestack.client.Log
import servicestack.net.kotlinlinqexamples.support.Data.getProductList

class Quantifiers {

    fun linq67() {
        val words = arrayOf("believe", "relief", "receipt", "field")

        val iAfterE = words.any { it.contains("ei") }

        Log.d("There is a word that contains in the list that contains 'ei': $iAfterE")
    }

    fun linq69() {
        val products = getProductList()

        val productGroups = products
            .groupBy { it.category }
            .filter { it.value.any { it.unitsInStock == 0 } }
            .map { Pair(it.key, it) }

        productGroups.forEach { Log.d(it.second) }
    }

    fun linq70() {
        val numbers = intArrayOf(1, 11, 3, 19, 41, 65, 19)

        val onlyOdd = numbers.all { it % 2 == 1 }

        Log.d("The list contains only odd numbers: $onlyOdd")
    }

    fun linq72() {
        val products = getProductList()

        val productGroups = products
            .groupBy { it.category }
            .filter { it.value.all { it.unitsInStock > 0 } }
            .map { Pair(it.key, it) }

        productGroups.forEach { Log.d(it.second) }
    }
}
