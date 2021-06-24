package servicestack.net.kotlinlinqexamples

import net.servicestack.client.Log
import net.servicestack.func.Func.join
import net.servicestack.func.Func.joinGroup
import servicestack.net.kotlinlinqexamples.support.products

class JoinOperators {

    fun linq102() {
        val categories = listOf("Beverages", "Condiments", "Vegetables", "Dairy Products", "Seafood")

        val q = join(categories, products) { c, p -> c == p.category }
                .map { Pair(it.A, it.B.productName) }

        q.forEach { Log.d("${it.first}: ${it.second}") }
    }

    fun linq103() {
        val categories = listOf("Beverages", "Condiments", "Vegetables", "Dairy Products", "Seafood")

        val q = joinGroup(categories, products) { c, p -> c == p.category }
            .map { Pair(it.key, it.items.map { it.B }) }

        q.forEach {
            Log.d("${it.first}:")
            it.second.forEach { p -> Log.d("   ${p.productName}") }
        }
    }

    fun linq104() {
        val categories = listOf("Beverages", "Condiments", "Vegetables", "Dairy Products", "Seafood")

        val q = joinGroup(categories, products) { c, p -> c == p.category }
            .flatMap { j -> j.items.map { it.B }.map {  Pair(j.key, it.productName) } }

        q.forEach { Log.d("${it.second}: ${it.first}") }
    }

    fun linq105() {
        val categories = listOf("Beverages", "Condiments", "Vegetables", "Dairy Products", "Seafood")

        val q = categories.flatMap { c ->
            val catProducts = products.filter { c == it.category }
            if (catProducts.isEmpty())
                listOf(Pair(c, "(No products)"))
            else
                catProducts.map { Pair(c, it.productName) }
        }

        q.forEach { Log.d("${it.second}: ${it.first}") }
    }
}
