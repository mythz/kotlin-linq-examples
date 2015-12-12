package servicestack.net.kotlinlinqexamples

import net.servicestack.client.Log
import net.servicestack.func.Func.range
import net.servicestack.func.Func.repeat

class GenerationOperators {

    fun linq65() {
        val numbers = range(100, 150).map { n -> Pair(n, if (n % 2 == 1) "odd" else "even") }

        numbers.forEach { Log.d("The number ${it.first} is ${it.second}") }
    }

    fun linq66() {
        val numbers = repeat(7, 10)

        numbers.forEach { Log.d(it) }
    }
}
