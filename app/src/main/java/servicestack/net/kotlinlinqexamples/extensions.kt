package servicestack.net.kotlinlinqexamples

import java.util.*

fun IntArray.difference(other:IntArray): List<Int> {
    var to = ArrayList<Int>()
    for (x in this) {
        if (!other.contains(x) && !to.contains(x)) {
            to.add(x)
        }
    }
    return to
}

fun <T> List<T>.difference(other:List<T>): List<T> {
    var to = ArrayList<T>()
    for (x in this) {
        if (!other.contains(x) && !to.contains(x)) {
            to.add(x)
        }
    }
    return to
}

