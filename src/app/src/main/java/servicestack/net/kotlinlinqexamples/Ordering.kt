package servicestack.net.kotlinlinqexamples

import net.servicestack.client.Log
import net.servicestack.func.Func.orderByAll
import servicestack.net.kotlinlinqexamples.support.Data.getProductList
import servicestack.net.kotlinlinqexamples.support.Product
import java.util.*

class Ordering {

    fun linq28() {
        val words = arrayOf("cherry", "apple", "blueberry")

        val sortedWords = words.sorted()

        Log.d("The sorted list of words:")
        sortedWords.forEach { Log.d(it) }
    }

    fun linq29() {
        val words = arrayOf("cherry", "apple", "blueberry")

        val sortedWords = words.sortedBy { s -> s.length }

        Log.d("The sorted list of words (by length):")
        sortedWords.forEach { Log.d(it) }
    }

    fun linq30() {
        val products = getProductList()

        val sortedProducts = products.sortedBy { it.productName }

        sortedProducts.forEach { Log.d(it) }
    }

    fun linq31() {
        val words = arrayOf("aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry")

        val sortedWords = words.sortedWith(String.CASE_INSENSITIVE_ORDER)

        sortedWords.forEach { Log.d(it) }
    }

    fun linq32() {
        val doubles = doubleArrayOf(1.7, 2.3, 1.9, 4.1, 2.9)

        val sortedDoubles = doubles.sortedDescending()

        Log.d("The doubles from highest to lowest:")
        sortedDoubles.forEach { Log.d(it) }
    }

    fun linq33() {
        val products = getProductList()

        val sortedProducts = products.sortedByDescending { it.unitsInStock }

        sortedProducts.forEach { Log.d(it) }
    }

    fun linq34() {
        val words = arrayOf("aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry")

        val sortedWords = words.sortedWith(String.CASE_INSENSITIVE_ORDER).reversed()

        sortedWords.forEach { Log.d(it) }
    }

    fun linq35() {
        val digits = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

        val sortedDigits = digits.sorted().sortedBy { it.length }

        Log.d("Sorted digits:")
        sortedDigits.forEach { Log.d(it) }
    }

    fun linq36() {
        val words = arrayOf("aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry")

        val sortedWords = words.sortedWith(String.CASE_INSENSITIVE_ORDER).sortedBy { it.length }

        sortedWords.forEach { Log.d(it) }
    }

    fun linq37() {
        val products = getProductList()

        val sortedProducts = orderByAll(products,
            Comparator<Product> { a, b -> a.category.compareTo(b.category) },
            Comparator<Product> { a, b -> b.unitPrice.compareTo(a.unitPrice) })

        sortedProducts.forEach { Log.d(it) }
    }

    fun linq38() {
        val words = arrayOf("aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry")

        val sortedWords = orderByAll(words,
            Comparator<String> { a, b -> Integer.compare(a.length, b.length) },
            Comparator<String> { a, b -> String.CASE_INSENSITIVE_ORDER.compare(b, a) })

        sortedWords.forEach { Log.d(it) }
    }

    fun linq39() {
        val digits = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

        val reversedIDigits = digits.filter { it[1] == 'i' }.reversed()

        Log.d("A backwards list of the digits with a second character of 'i':")
        reversedIDigits.forEach { Log.d(it) }
    }
}
