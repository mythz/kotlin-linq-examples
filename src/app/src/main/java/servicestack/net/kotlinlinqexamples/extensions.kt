package servicestack.net.kotlinlinqexamples

import java.util.*

fun <T> List<T>.skip(count:Int): List<T> = this.slice(count..this.size-1)
fun IntArray.skip(count:Int): List<Int> = this.slice(count..this.size-1)

fun IntArray.skipWhile(predicate: (Int) -> Boolean): List<Int> {
    var to = ArrayList<Int>()
    var keepSkipping = true
    for (x in this) {
        if (!predicate(x)) {
            keepSkipping = false
        }
        if (!keepSkipping) {
            to.add(x)
        }
    }
    return to
}

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

