package servicestack.net.kotlinlinqexamples

import net.servicestack.client.Log

class QueryExecution {

    fun linq099() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        var i = 0
        val q = numbers.map { { ++i } }

        for (f in q) {
            val v = f()
            Log.d("v = $v, i = $i")
        }
    }

    fun linq100() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        var i = 0
        val q = numbers.map { ++i }

        q.forEach { v -> Log.d("v = $v, i = $i") }
    }

    fun linq101() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        val lowNumbers = { numbers.filter { n -> n <= 3 } }

        Log.d("First run numbers <= 3:")
        lowNumbers().forEach { Log.d(it) }

        for (i in 0..9) {
            numbers[i] = -numbers[i]
        }

        Log.d("Second run numbers <= 3:")
        lowNumbers().forEach { Log.d(it) }
    }
}
