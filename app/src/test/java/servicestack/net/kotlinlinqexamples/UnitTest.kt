package servicestack.net.kotlinlinqexamples

import com.google.gson.GsonBuilder
import net.servicestack.client.Log
import net.servicestack.func.Func
import org.junit.Before
import org.junit.Test
import servicestack.net.kotlinlinqexamples.support.*
import java.io.*
import java.util.*


class UnitTest {

    private var _customers: ArrayList<Customer> = ArrayList()

    val customers: List<Customer> by lazy {
        _customers
    }

    // execute before test
    @Before
    fun prepareForCustomers() {
        val inputFilePathName = "src/test/java/servicestack/net/kotlinlinqexamples/customers.json"
        val json = getStringFromFile(inputFilePathName)
        val gson = GsonBuilder().registerTypeAdapter(Date::class.java, dateDeserializer).create()
        val c = gson.fromJson(json, Array<Customer>::class.java)
        _customers = Func.toList(*c)
    }

    fun getStringFromFile(fileName: String?): String {
        var bufferedReader: BufferedReader? = null
        return try {
            bufferedReader = BufferedReader(InputStreamReader(FileInputStream(File(fileName)), "utf-8"))
            var line: String?
            val buffer = StringBuilder()
            while (bufferedReader.readLine().also { line = it } != null) {
                buffer.append(line).append('\n')
            }
            buffer.toString()
        } catch (e: IOException) {
            e.printStackTrace()
            ""
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close()
                    bufferedReader = null
                } catch (e: IOException) {
                    e.printStackTrace()
                }
            }
        }
    }


    @Test
    fun linq01() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        val lowNums = numbers.filter { it < 5 }

        println("Numbers < 5:")
        lowNums.forEach { println(it) }
    }

    @Test
    fun linq02() {
        println("Sold out products:")
        products.filter { it.unitsInStock == 0 }
                .forEach { println("[${it.productName}] is sold out!") }
    }

    @Test
    fun linq03() {
        println("In-stock products that cost more than 3.00:")
        products.filter { it.unitsInStock > 0 && it.unitPrice > 3.00 }
                .forEach { println("[${it.productName}] is in stock and costs more than 3.00.") }
    }

    @Test
    fun linq04() {
        println("Customers from Washington and their orders:")
        customers.filter { "WA" == it.region }
                .forEach { c ->
                    println("Customer [${c.customerId}] --> [ ${c.companyName} ]")
                    c.orders.forEach { println("  Order ${it.orderId}: ${dateFmt(it.orderDate)}") }
                }
    }

    @Test
    fun linq05() {
        val digits = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

        println("Short digits:")

        digits.filterIndexed { index, it -> it.length < index }
                .forEach { println("The word $it is shorter than its value.") }
    }


    @Test
    fun linq06() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        Log.d("Numbers + 1:")

        numbers.map { it + 1 }
                .forEach { Log.d(it) }
    }

    @Test
    fun linq07() {
        Log.d("Product Names:")
        products.map { it.productName }
                .forEach { Log.d(it) }
    }

    @Test
    fun linq08() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)
        val strings = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

        Log.d("Number strings:")
        numbers.map { strings[it] }
                .forEach { Log.d(it) }
    }

    @Test
    fun linq09() {
        val words = arrayOf("aPPLE", "BlUeBeRrY", "cHeRry")

        words.map { w ->
            Pair(w.toUpperCase(), w.toLowerCase())
        }.forEach {
            Log.d("Uppercase: ${it.first}, Lowercase: ${it.second}")
        }
    }

    @Test
    fun linq10() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)
        val strings = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

        numbers.map { Pair(strings[it], it % 2 == 0) }
                .forEach { (digit, isEven) ->
                    Log.d("The digit ${digit} is ${if (isEven) "even" else "odd"}.")
                }
    }

    @Test
    fun linq11() {
        Log.d("Product Info:")
        products.map { p -> Triple(p.productName, p.category, p.unitPrice) }
                .forEach { (name, category, cost) ->
                    Log.d("[$name] is in the category [$category] and costs [$cost] per unit.")
                }
    }

    @Test
    fun linq12() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)
        Log.d("Number: In-place?")
        numbers
                .mapIndexed { index, n ->
                    Pair(n, n == index)
                }.forEach { (index, inPlace) ->
                    Log.d("${index}: ${inPlace}")
                }
    }

    @Test
    fun linq13() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)
        val digits = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

        Log.d("Numbers < 5:")
        numbers.filter { it < 5 }
                .map { digits[it] }
                .forEach { Log.d(it) }
    }

    @Test
    fun linq14() {
        val numbersA = intArrayOf(0, 2, 4, 5, 6, 8, 9)
        val numbersB = intArrayOf(1, 3, 5, 7, 8)

        Log.d("Pairs where a < b:")
        numbersA
                .flatMap { a ->
                    numbersB
                            .filter { b ->
                                a < b
                            }.map {
                                Pair(a, it)
                            }
                }.forEach {
                    Log.d("${it.first} is less than ${it.second}")
                }
    }

    @Test
    fun linq15() {
        customers
                .flatMap { c ->
                    c.orders
                            .filter {
                                it.total < 500
                            }.map { o ->
                                Triple(c.customerId, o.orderId, o.total)
                            }
                }.forEach {
                    Log.d(it)
                }
    }

    @Test
    fun linq16() {
        val date = Date(98, 3, 10) //= 1998-04-10
        customers
                .flatMap { c ->
                    c.orders
                            .filter {
                                it.orderDate >= date
                            }.map {
                                Triple(c.customerId, it.orderId, it.orderDate)
                            }
                }.forEach { Log.d(it) }
    }

    @Test
    fun linq17() {
        customers
                .flatMap { c ->
                    c.orders
                            .filter {
                                it.total >= 2000
                            }.map {
                                Triple(c.customerId, it.orderId, it.total)
                            }
                }.forEach { Log.d(it) }
    }

    @Test
    fun linq18() {
        val cutoffDate = Date(97, 0, 1) //1997-01-01
        customers
                .filter { it.region == "WA" }
                .flatMap { c ->
                    c.orders.filter {
                        it.orderDate > cutoffDate
                    }.map {
                        Pair(c.customerId, it.orderId)
                    }
                }.forEach { Log.d(it) }
    }

    @Test
    fun linq19() {
        customers
                .flatMap { c ->
                    c.orders.mapIndexed { index, o -> "Customer[${c.customerId}] has an order ,index = #$index and  OrderID ${o.orderId}" }
                }.forEach { Log.d(it) }
    }

    @Test
    fun linq20() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        Log.d("First 3 numbers:")
        numbers.take(3).forEach { Log.d(it) }
    }

    @Test
    fun linq21() {
        Log.d("First 3 orders in WA:")
        customers
                .filter { it.region == "WA" }
                .flatMap { c ->
                    c.orders.map { o -> Triple(c.customerId, o.orderId, o.orderDate) }
                }
                .take(3)
                .forEach { Log.d(it) }
    }

    @Test
    fun linq22() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)
        Log.d("All but first 4 numbers:")
        numbers.drop(4).forEach { Log.d(it) }
    }

    @Test
    fun linq23() {
        Log.d("All but first 2 orders in WA:")
        customers
                .filter { it.region == "WA" }
                .flatMap { c ->
                    c.orders.map { o -> Triple(c.customerId, o.orderId, o.orderDate) }
                }
                .drop(2)
                .forEach { Log.d(it) }
    }

    @Test
    fun linq24() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        Log.d("First numbers less than 6:")
        numbers.takeWhile { it < 6 }
                .forEach { Log.d(it) }
    }

    @Test
    fun linq25() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        Log.d("First numbers not less than their position:")
        var index = 0
        numbers.takeWhile { it >= index++ }
                .forEach { Log.d(it) }
    }

    @Test
    fun linq26() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        Log.d("All elements starting from first element divisible by 3:")

        numbers.dropWhile { it % 3 != 0 }
                .forEach { Log.d(it) }
    }

    @Test
    fun linq27() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)
        Log.d("All elements starting from first element less than its position:")
        var index = 0
        numbers.dropWhile { it >= index++ }
                .forEach { Log.d(it) }
    }

    @Test
    fun linq28() {
        val words = arrayOf("cherry", "apple", "blueberry")
        Log.d("The sorted list of words:")
        words.sorted()
                .forEach { Log.d(it) }
    }

    @Test
    fun linq29() {
        val words = arrayOf("cherry", "apple", "blueberry")
        Log.d("The sorted list of words (by length):")
        words.sortedBy { it.length }
                .forEach { Log.d(it) }
    }

    @Test
    fun linq30() {
        products.sortedBy { it.productName }
                .forEach { Log.d(it) }
    }

    @Test
    fun linq31() {
        val words = arrayOf("aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry")
        words.sortedWith(String.CASE_INSENSITIVE_ORDER)
                .forEach { Log.d(it) }
    }

    @Test
    fun linq32() {
        val doubles = doubleArrayOf(1.7, 2.3, 1.9, 4.1, 2.9)
        Log.d("The doubles from highest to lowest:")
        doubles.sortedDescending()
                .forEach { Log.d(it) }
    }

    @Test
    fun linq33() {
        products.sortedByDescending { it.unitsInStock }
                .forEach { Log.d(it) }
    }

    @Test
    fun linq34() {
        val words = arrayOf("aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry")
        words.sortedWith(String.CASE_INSENSITIVE_ORDER)
                .reversed()
                .forEach { Log.d(it) }
    }

    @Test
    fun linq35() {
        val digits = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        Log.d("Sorted digits:")
        digits.sorted()
                .sortedBy { it.length }
                .forEach { Log.d(it) }
    }

    @Test
    fun linq36() {
        val words = arrayOf("aPPLE", "AbAcUs", "AbAcUssdsadds", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry")
        words.sortedWith(String.CASE_INSENSITIVE_ORDER)
                .sortedBy { it.length }
                .forEach { Log.d(it) }
    }

    @Test
    fun linq37() {
        Func.orderByAll(products,
                Comparator { a, b -> a.category.compareTo(b.category) },
                Comparator { a, b -> b.unitPrice.compareTo(a.unitPrice) }
        ).forEach { Log.d(it) }
    }

    @Test
    fun linq38() {
        val words = arrayOf("aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry")

        Func.orderByAll(words,
                Comparator { a, b -> a.length.compareTo(b.length) },
                Comparator { a, b -> String.CASE_INSENSITIVE_ORDER.compare(b, a) }
        ).forEach { Log.d(it) }
    }

    @Test
    fun linq39() {
        val digits = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

        Log.d("A backwards list of the digits with a second character of 'i':")
        digits.filter { it[1] == 'i' }
                .reversed()
                .forEach { Log.d(it) }
    }

    @Test
    fun linq40() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)
        numbers.groupBy { it % 5 }
                .entries
                .forEach { (conditions, list) ->
                    Log.d("Numbers with a conditions of [${conditions}] when divided by 5:")
                    list.forEach { Log.d(it) }
                }
    }

    @Test
    fun linq41() {
        val words = arrayOf("blueberry", "chimpanzee", "abacus", "banana", "apple", "cheese")
        words.groupBy { word -> word[0] }
                .entries
                .forEach { (firstLetter, g) ->
                    Log.d("Words that start with the letter '$firstLetter':")
                    g.forEach { Log.d(it) }
                }
    }

    @Test
    fun linq42() {
        products.groupBy { it.category }
                .entries
                .forEach { (category, g) ->
                    Log.d("${category}:")
                    g.forEach { Log.d(it) }
                }
    }

    @Test
    fun linq43() {
        customers.map { c ->
            Pair(c.companyName,
                    // 按年分组
                    c.orders.groupBy { it.orderDate.year + 1900 }
                            .map {
                                Pair(it.key,
                                        // 按月分组
                                        it.value.groupBy { it.orderDate.month + 1 }
                                )
                            })
        }.forEach {
            Log.d("\n# ${it.first}")
            it.second.forEach {
                Log.d("${it.first}")
                it.second.entries.forEach{
                    Log.d("  ${it.value}")
                }
            }
        }
//       .forEach { (companyName, yearGroups) ->
//            Log.d("\n# $companyName")
//            yearGroups.forEach { (year, monthGroups) ->
//                Log.d("${year}: ")
//                monthGroups.forEach { Log.d("    $it") }
//            }
//        }
    }

    @Test
    fun linq44() {
        val anagrams = listOf("from   ", " salt", " earn ", "  last   ", " near ", " form  ")

        val orderGroups = Func.groupBy(anagrams,
                { w -> w.trim { it <= ' ' } },
                { a, b ->
                    val aChars = a.toCharArray()
                    val bChars = b.toCharArray()
                    Arrays.sort(aChars)
                    Arrays.sort(bChars)
                    Arrays.equals(aChars, bChars)
                })

        orderGroups.forEach { g ->
            val sb = StringBuilder()
            g.forEach { w ->
                if (sb.length > 0)
                    sb.append(", ")
                sb.append("'").append(w).append("'")
            }
            Log.d("[ $sb ]")
        }
    }

    @Test
    fun linq45() {
        val anagrams = listOf("from   ", " salt", " earn ", "  last   ", " near ", " form  ")

        val orderGroups = Func.groupBy(anagrams,
                { w -> w.trim { it <= ' ' } },
                { a, b ->
                    val aChars = a.toCharArray()
                    val bChars = b.toCharArray()
                    Arrays.sort(aChars)
                    Arrays.sort(bChars)
                    Arrays.equals(aChars, bChars)
                },
                { it.toUpperCase() })

        orderGroups.forEach { g ->
            val sb = StringBuilder()
            g.forEach {
                if (sb.length > 0)
                    sb.append(", ")
                sb.append("'").append(it).append("'")
            }
            Log.d("[ $sb ]")
        }
    }

    @Test
    fun linq46() {
        val factorsOf300 = intArrayOf(2, 2, 3, 5, 5)

        val uniqueFactors = factorsOf300.distinct()

        Log.d("Prime factors of 300:")
        uniqueFactors.forEach { Log.d(it) }
    }

    @Test
    fun linq47() {
        val categoryNames = products.map { it.category }.distinct()

        Log.d("Category names:")
        categoryNames.forEach { Log.d(it) }
    }

    @Test
    fun linq48() {
        val numbersA = listOf(0, 2, 4, 5, 6, 8, 9)
        val numbersB = listOf(1, 3, 5, 7, 8)

        val uniqueNumbers = numbersA.union(numbersB)

        Log.d("Unique numbers from both arrays:")
        uniqueNumbers.forEach { Log.d(it) }
    }

    @Test
    fun linq49() {
        val productFirstChars = products.map { it.productName[0] }

        val customerFirstChars = customers.map { it.companyName[0] }

        val uniqueFirstChars = productFirstChars.union(customerFirstChars)

        Log.d("Unique first letters from Product names and Customer names:")
        uniqueFirstChars.forEach { Log.d(it) }
    }

    @Test
    fun linq50() {
        val numbersA = listOf(0, 2, 4, 5, 6, 8, 9)
        val numbersB = listOf(1, 3, 5, 7, 8)

        val commonNumbers = numbersA.intersect(numbersB)

        Log.d("Common numbers shared by both arrays:")
        commonNumbers.forEach { Log.d(it) }
    }

    @Test
    fun linq51() {
        val productFirstChars = products.map { it.productName[0] }

        val customerFirstChars = customers.map { it.companyName[0] }

        val commonFirstChars = productFirstChars.intersect(customerFirstChars)

        Log.d("Common first letters from Product names and Customer names:")
        commonFirstChars.forEach { Log.d(it) }
    }

    @Test
    fun linq52() {
        val numbersA = listOf(0, 2, 4, 5, 6, 8, 9)
        val numbersB = listOf(1, 3, 5, 7, 8)

        val aOnlyNumbers = numbersA.difference(numbersB)

        Log.d("Numbers in first array but not second array:")
        aOnlyNumbers.forEach { Log.d(it) }
    }

    @Test
    fun linq53() {
        val productFirstChars = products.map { it.productName[0] }

        val customerFirstChars = customers.map { it.companyName[0] }

        val productOnlyFirstChars = productFirstChars.difference(customerFirstChars)

        Log.d("First letters from Product names, but not from Customer names:")
        productOnlyFirstChars.forEach { Log.d(it) }
    }


    @Test
    fun linq54() {
        val doubles = doubleArrayOf(1.7, 2.3, 1.9, 4.1, 2.9)

        val sortedDoubles = doubles.sortedDescending()

        val doublesArray = sortedDoubles.toDoubleArray()

        Log.d("Every other double from highest to lowest:")
        var d = 0
        while (d < doublesArray.size) {
            Log.d(doublesArray[d])
            d += 2
        }
    }

    @Test
    fun linq55() {
        val words = arrayOf("cherry", "apple", "blueberry")

        val sortedWords = words.sorted()
        val wordList = sortedWords.toList()

        Log.d("The sorted word list:")
        wordList.forEach { Log.d(it) }
    }

    @Test
    fun linq56() {
        val scoreRecords = listOf(
                Pair("Alice", 50),
                Pair("Bob", 40),
                Pair("Cathy", 45)
        )

        val scoreRecordsDict = scoreRecords.toMap()

        Log.d("Bob's score: ${scoreRecordsDict["Bob"]}")
    }

    @Test
    fun linq57() {
        val numbers = arrayOf(null, 1.0, "two", 3, "four", 5, "six", 7.0)

        val doubles = numbers.filter { it is Double }

        Log.d("Numbers stored as doubles:")
        doubles.forEach { Log.d(it) }
    }

    @Test
    fun linq58() {
        val product12 = products.filter { it.productId == 12 }.first()

        Log.d(product12)
    }

    @Test
    fun linq59() {
        val strings = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

        val startsWithO = strings.first { it[0] == 'o' }

        Log.d("A string starting with 'o': $startsWithO")
    }

    @Test
    fun linq61() {
        val numbers = intArrayOf()

        val firstNumOrDefault = numbers.firstOrNull() ?: 0

        Log.d(firstNumOrDefault)
    }

    @Test
    fun linq62() {
        val product789 = products.firstOrNull { it.productId == 789 }

        Log.d("Product 789 exists: ${product789 != null}")
    }

    @Test
    fun linq64() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        val fourthLowNum = numbers.filter { it > 5 }[1]

        Log.d("Second number > 5: $fourthLowNum")
    }

    @Test
    fun linq65() {
        val numbers = (100..150).map { n -> Pair(n, if (n % 2 == 1) "odd" else "even") }

        numbers.forEach { Log.d("The number ${it.first} is ${it.second}") }
    }

    @Test
    fun linq66() {
        val numbers = "7".repeat(10)

        numbers.forEach { Log.d(it) }
    }

    @Test
    fun linq67() {
        val words = arrayOf("believe", "relief", "receipt", "field")

        val iAfterE = words.any { it.contains("ei") }

        Log.d("There is a word that contains in the list that contains 'ei': $iAfterE")
    }

    @Test
    fun linq69() {
        val productGroups = products
                .groupBy { it.category }
                .filter { it.value.any { it.unitsInStock == 0 } }
                .map { Pair(it.key, it) }

        productGroups.forEach { Log.d(it.second) }
    }

    @Test
    fun linq70() {
        val numbers = intArrayOf(1, 11, 3, 19, 41, 65, 19)

        val onlyOdd = numbers.all { it % 2 == 1 }

        Log.d("The list contains only odd numbers: $onlyOdd")
    }

    @Test
    fun linq72() {
        val productGroups = products
                .groupBy { it.category }
                .filter { it.value.all { it.unitsInStock > 0 } }
                .map { Pair(it.key, it) }

        productGroups.forEach { Log.d(it.second) }
    }

    @Test
    fun linq73() {
        val factorsOf300 = intArrayOf(2, 2, 3, 5, 5)

        val uniqueFactors = factorsOf300.distinct().size

        Log.d("There are $uniqueFactors unique factors of 300.")
    }

    @Test
    fun linq74() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        val oddNumbers = numbers.count { it % 2 == 1 }

        Log.d("There are $oddNumbers odd numbers in the list.")
    }

    @Test
    fun linq76() {
        val orderCounts = customers.map { Pair(it.customerId, it.orders.size) }

        orderCounts.forEach { Log.d(it) }
    }

    @Test
    fun linq77() {
        val categoryCounts = products.groupBy { it.category }
                .map { Pair(it.key, it.value.size) }

        categoryCounts.forEach { Log.d(it) }
    }

    @Test
    fun linq78() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        val numSum = numbers.sum().toDouble()

        Log.d("The sum of the numbers is $numSum")
    }

    @Test
    fun linq79() {
        val words = arrayOf("cherry", "apple", "blueberry")

        val totalChars = words.sumBy { it.length }

        Log.d("There are a total of $totalChars characters in these words.")
    }

    @Test
    fun linq80() {
        val categories = products.groupBy { it.category }
                .map { Pair(it.key, it.value.sumBy { it.unitsInStock }) }

        categories.forEach { Log.d(it) }
    }

    @Test
    fun linq81() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        val minNum = numbers.min()

        Log.d("The minimum number is $minNum")
    }

    @Test
    fun linq82() {
        val words = arrayOf("cherry", "apple", "blueberry")

        val shortestWord = words.minBy { it.length }?.length

        Log.d("The shortest word is $shortestWord characters long.")
    }

    @Test
    fun linq83() {
        val categories = products.groupBy { it.category }
                .map { Pair(it.key, it.value.minBy { it.unitPrice }?.unitPrice) }

        categories.forEach { Log.d(it) }
    }

    @Test
    fun linq84() {
        val categories = products.groupBy { it.category }
                .map {
                    val minPrice = it.value.minBy { it.unitPrice }!!.unitPrice
                    Pair(it.key, it.value.filter { p -> p.unitPrice == minPrice })
                }

        categories.forEach {
            val (category, cheapestProducts) = it
            Log.d(category + ": ")
            cheapestProducts.forEach { Log.d(it) }
        }
    }

    @Test
    fun linq85() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        val maxNum = numbers.max()

        Log.d("The maximum number is $maxNum")
    }

    @Test
    fun linq86() {
        val words = arrayOf("cherry", "apple", "blueberry")

        val longestLength = words.maxBy { it.length }?.length

        Log.d("The longest word is $longestLength characters long.")
    }

    @Test
    fun linq87() {
        val categories = products.groupBy { it.category }
                .map { Pair(it.key, it.value.maxBy { it.unitPrice }?.unitPrice) }

        categories.forEach { Log.d(it) }
    }

    @Test
    fun linq88() {
        val categories = products.groupBy { it.category }
                .map {
                    val maxPrice = it.value.maxBy { p -> p.unitPrice }?.unitPrice
                    Pair(it.key, it.value.filter { p -> p.unitPrice == maxPrice })
                }

        categories.forEach {
            val (category, mostExpensiveProducts) = it
            Log.d("$category: ")
            mostExpensiveProducts.forEach { Log.d(it) }
        }
    }

    @Test
    fun linq89() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        val averageNum = numbers.average()

        Log.d("The average number is $averageNum")
    }

    @Test
    fun linq90() {
        val words = arrayOf("cherry", "apple", "blueberry")

        val averageLength = words.map { it.length }.average()

        Log.d("The average word length is $averageLength characters.")
    }

    @Test
    fun linq91() {
        val categories = products.groupBy { it.category }
                .map { Pair(it.key, it.value.map { it.unitPrice }.average()) }

        categories.forEach { Log.d("Category: ${it.first}, AveragePrice: ${it.second}") }
    }

    @Test
    fun linq92() {
        val doubles = doubleArrayOf(1.7, 2.3, 1.9, 4.1, 2.9)

        val product = doubles.reduce { runningProduct, nextFactor -> runningProduct * nextFactor }

        Log.d("Total product of all numbers: $product")
    }

    @Test
    fun linq93() {
        val startBalance = 100

        val attemptedWithdrawals = intArrayOf(20, 10, 40, 50, 10, 70, 30)

        var i = 0
        val endBalance = attemptedWithdrawals.reduce { acc, nextWithdrawal ->
            val balance = if (i++ == 0 && nextWithdrawal <= acc) startBalance - acc else acc
            if (nextWithdrawal <= balance) balance - nextWithdrawal else balance
        }

        Log.d("Ending balance: $endBalance")
    }

    @Test
    fun linq94() {
        val numbersA = intArrayOf(0, 2, 4, 5, 6, 8, 9)
        val numbersB = intArrayOf(1, 3, 5, 7, 8)

        val allNumbers = numbersA + numbersB

        Log.d("All numbers from both arrays:")
        allNumbers.forEach { Log.d(it) }
    }

    @Test
    fun linq95() {
        val customerNames = customers.map { it.companyName }

        val productNames = products.map { it.productName }

        val allNames = customerNames + productNames

        Log.d("Customer and product names:")
        allNames.forEach { Log.d(it) }
    }

    @Test
    fun linq96() {
        val wordsA = arrayOf("cherry", "apple", "blueberry")
        val wordsB = arrayOf("cherry", "apple", "blueberry")

        val match = Arrays.equals(wordsA, wordsB)

        Log.d("The sequences match: $match")
    }

    @Test
    fun linq97() {
        val wordsA = arrayOf("cherry", "apple", "blueberry")
        val wordsB = arrayOf("cherry", "blueberry", "cherry")

        val match = Arrays.equals(wordsA, wordsB)

        Log.d("The sequences match: $match")
    }


    @Test
    fun linq099() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        var i = 0
        val q = numbers.map { { ++i } }

        for (f in q) {
            val v = f()
            Log.d("v = $v, i = $i")
        }
    }

    @Test
    fun linq100() {
        val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

        var i = 0
        val q = numbers.map { ++i }

        q.forEach { v -> Log.d("v = $v, i = $i") }
    }

    @Test
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

    @Test
    fun linq102() {
        val categories = listOf("Beverages", "Condiments", "Vegetables", "Dairy Products", "Seafood")

        val q = Func.join(categories, products) { c, p -> c == p.category }
                .map { Pair(it.A, it.B.productName) }

        q.forEach { Log.d("${it.first}: ${it.second}") }
    }

    @Test
    fun linq103() {
        val categories = listOf("Beverages", "Condiments", "Vegetables", "Dairy Products", "Seafood")

        val q = Func.joinGroup(categories, products) { c, p -> c == p.category }
                .map { Pair(it.key, it.items.map { it.B }) }

        q.forEach {
            Log.d("${it.first}:")
            it.second.forEach { p -> Log.d("   ${p.productName}") }
        }
    }

    @Test
    fun linq104() {
        val categories = listOf("Beverages", "Condiments", "Vegetables", "Dairy Products", "Seafood")

        val q = Func.joinGroup(categories, products) { c, p -> c == p.category }
                .flatMap { j -> j.items.map { it.B }.map { Pair(j.key, it.productName) } }

        q.forEach { Log.d("${it.second}: ${it.first}") }
    }

    @Test
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