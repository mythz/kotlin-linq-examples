101 C# LINQ Samples in Kotlin
=============================

This project contains the [C# 101 LINQ Samples](http://code.msdn.microsoft.com/101-LINQ-Samples-3fb9811b) 
rewritten to Kotlin. Like the existing [Java LINQ Examples](https://github.com/mythz/java-linq-examples), 
Kotlin examples run and have their results displayed inside an Android App courtesy of the 
[rich support for Kotlin in Android Studio](https://kotlinlang.org/docs/tutorials/kotlin-android.html). 

Compare Kotlin to other LINQ examples written in:

 - [Java](https://github.com/mythz/java-linq-examples)
 - [Swift](https://github.com/mythz/swift-linq-examples)
 - [Clojure](https://github.com/mythz/clojure-linq-examples)
 - [Dart](https://github.com/mythz/dart-linq-examples)
 - [Elixir](https://github.com/omnibs/elixir-linq-examples)

Comparing against [Java examples](https://github.com/mythz/java-linq-examples) 
showcases the power and expressiveness of both languages ability for developing native Android Apps 
where Java 7 is by far the worst language for functional/LINQ-style programming vs Kotlin which is one of 
the best - resulting in a much more readable and maintainable code-base that's less than 1/2 the size.

## Kotlin Android Resources

To help getting started with Kotlin, we'll maintain links to useful resources helping to develop Android Apps 
with Kotlin below:

 - [Getting started with Android and Kotlin](https://kotlinlang.org/docs/tutorials/kotlin-android.html) <small>_(kotlinlang.org)_</small>
 - [Kotlin for Android Developers](http://www.javaadvent.com/2015/12/kotlin-android.html) <small>_(javaadvent.com)_</small>
 - [Android Development with Kotlin - Jake Wharton](https://www.youtube.com/watch?v=A2LukgT2mKc&feature=youtu.be) <small>_(youtube.com)_</small>

### [Call .NET Web Services from Kotlin](https://github.com/ServiceStack/ServiceStack/wiki/Kotlin-Add-ServiceStack-Reference)

If you're looking to create an effortles typed API for consuming .NET Web Services in JVM or Kotlin Android Apps checkout ServiceStack's 
[Kotlin Add ServiceStack Reference](https://github.com/ServiceStack/ServiceStack/wiki/Kotlin-Add-ServiceStack-Reference).

## Running the examples

Each of the LINQ Examples can be run from the included Android App with its results logged to the screen:

![](https://raw.githubusercontent.com/ServiceStack/Assets/master/img/wikis/kotlin/kotlin-linq-examples.png)

Run the included [Android Studio project](https://github.com/mythz/kotlin-linq-examples/tree/master/src) to execute all the examples. You can also choose to only run specific examples by commenting out any of the sections you're not interested in [MainActivity.kt](https://github.com/mythz/kotlin-linq-examples/blob/c5cd7a28ffd4efd5d715c6107d9a6076fbb27227/src/app/src/main/java/servicestack/net/kotlinlinqexamples/MainActivity.kt#L41-L54).

A copy of the LINQ examples output is also available in [linq-log.txt](https://raw.githubusercontent.com/mythz/kotlin-linq-examples/master/linq-log.txt).

### Contents

The samples below mirrors the C# LINQ samples layout with the names of the top-level Java methods matching their corresponding C# examples.

#### [LINQ - Restriction Operators](https://github.com/mythz/kotlin-linq-examples/blob/master/src/app/src/main/java/servicestack/net/kotlinlinqexamples/Restrictions.kt) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-Restriction-Operators-b15d29ca)
#### [LINQ - Projection Operators](https://github.com/mythz/kotlin-linq-examples/blob/master/src/app/src/main/java/servicestack/net/kotlinlinqexamples/Projections.kt) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-to-DataSets-09787825)
#### [LINQ - Partitioning Operators](https://github.com/mythz/kotlin-linq-examples/blob/master/src/app/src/main/java/servicestack/net/kotlinlinqexamples/Partitioning.kt) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-Partitioning-Operators-c68aaccc)
#### [LINQ - Ordering Operators](https://github.com/mythz/kotlin-linq-examples/blob/master/src/app/src/main/java/servicestack/net/kotlinlinqexamples/Ordering.kt) / [MSDN C#](http://code.msdn.microsoft.com/SQL-Ordering-Operators-050af19e)
#### [LINQ - Grouping Operators](https://github.com/mythz/kotlin-linq-examples/blob/master/src/app/src/main/java/servicestack/net/kotlinlinqexamples/Grouping.kt) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-to-DataSets-Grouping-c62703ea)
#### [LINQ - Set Operators](https://github.com/mythz/kotlin-linq-examples/blob/master/src/app/src/main/java/servicestack/net/kotlinlinqexamples/SetOperators.kt) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-Set-Operators-374f34fe)
#### [LINQ - Conversion Operators](https://github.com/mythz/kotlin-linq-examples/blob/master/src/app/src/main/java/servicestack/net/kotlinlinqexamples/Conversion.kt) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-Conversion-Operators-e4e59714)
#### [LINQ - Element Operators](https://github.com/mythz/kotlin-linq-examples/blob/master/src/app/src/main/java/servicestack/net/kotlinlinqexamples/ElementOperators.kt) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-Element-Operators-0f3f12ce)
#### [LINQ - Generation Operators](https://github.com/mythz/kotlin-linq-examples/blob/master/src/app/src/main/java/servicestack/net/kotlinlinqexamples/GenerationOperators.kt) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-Generation-Operators-8a3fbff7)
#### [LINQ - Quantifiers](https://github.com/mythz/kotlin-linq-examples/blob/master/src/app/src/main/java/servicestack/net/kotlinlinqexamples/Quantifiers.kt) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-Quantifiers-f00e7e3e)
#### [LINQ - Aggregate Operators](https://github.com/mythz/kotlin-linq-examples/blob/master/src/app/src/main/java/servicestack/net/kotlinlinqexamples/AggregateOperators.kt) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-Aggregate-Operators-c51b3869)
#### [LINQ - Miscellaneous Operators](https://github.com/mythz/kotlin-linq-examples/blob/master/src/app/src/main/java/servicestack/net/kotlinlinqexamples/MiscOperators.kt) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-Miscellaneous-6b72bb2a)
#### [LINQ - Query Execution](https://github.com/mythz/kotlin-linq-examples/blob/master/src/app/src/main/java/servicestack/net/kotlinlinqexamples/QueryExecution.kt) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-Query-Execution-ce0d3b95)
#### [LINQ - Join Operators](https://github.com/mythz/kotlin-linq-examples/blob/master/src/app/src/main/java/servicestack/net/kotlinlinqexamples/JoinOperators.kt) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-Join-Operators-dabef4e9)

## Kotlin Functional Utils

Kotlin has great language and built-in library support to simplify programming in a functional-style where most of the LINQ examples
are able to use Kotlins built-in utils. Some of the more advanced LINQ examples like JOIN's were missing in Kotlins standard library, for this
we leverage the existing implementations in
[ServiceStack's Java and Android Client Library](https://github.com/ServiceStack/ServiceStack/wiki/Java-Add-ServiceStack-Reference): **net.servicestack:android**. 

### Install

To include it in your Android Studio project, add it to your **build.gradle** dependency, e.g:

    dependencies {
        compile fileTree(dir: 'libs', include: ['*.jar'])
        compile 'net.servicestack:android:1.0.24'
    }

Pure Java projects should add the **net.servicestack:client** dependency instead:

    dependencies {
        compile 'net.servicestack:client:1.0.24'
    }

Alternatively this library is also automatically added when Adding a Typed Remote Service Reference with ServiceStack IDE Plugins for 
[Intellij IDEA](https://github.com/ServiceStack/ServiceStack/wiki/Java-Add-ServiceStack-Reference#servicestack-idea-android-studio-plugin) and 
[Eclipse Maven projects](https://github.com/ServiceStack/ServiceStack.Java/tree/master/src/ServiceStackEclipse#eclipse-integration-with-servicestack).

## [Kotlin Extensions](https://github.com/mythz/kotlin-linq-examples/blob/master/src/app/src/main/java/servicestack/net/kotlinlinqexamples/extensions.kt)

Only a [few extensions](https://github.com/mythz/kotlin-linq-examples/blob/master/src/app/src/main/java/servicestack/net/kotlinlinqexamples/extensions.kt) 
were required to cover Kotlin's missing `skip`, `skipWhile` and `difference` API's. 

##  Side-by-side - C# LINQ vs Kotlin

For a side-by-side comparison, the original **C#** source code is displayed above the equivalent **Kotlin** translation. 

  - The **Output** shows the logging output of running the **Kotlin** Android App. 
  - Outputs ending with `...` illustrates only a partial response is displayed. 
  - The C# ObjectDumper util used is downloadable from MSDN - [ObjectDumper.zip](http://code.msdn.microsoft.com/Visual-Studio-2008-C-d295cdba/file/46086/1/ObjectDumper.zip)


LINQ - Restriction Operators
----------------------------

### linq1: Where - Simple 1

```csharp
//c#
public void Linq1() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    var lowNums = 
        from n in numbers 
        where n < 5 
        select n; 
  
    Console.WriteLine("Numbers < 5:"); 
    foreach (var x in lowNums) 
    { 
        Console.WriteLine(x); 
    } 
}  
```
```kotlin
//kotlin
fun linq1() {
    val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

    val lowNums = numbers.filter { it < 5 }

    Log.d("Numbers < 5:")
    lowNums.forEach { Log.d(it) }
}
```
#### Output

    Numbers < 5:
    4
    1
    3
    2
    0

### linq2: Where - Simple 2
```csharp
//c#
public void Linq2() 
{ 
    List<Product> products = GetProductList(); 
  
    var soldOutProducts = 
        from p in products 
        where p.UnitsInStock == 0 
        select p; 
  
    Console.WriteLine("Sold out products:"); 
    foreach (var product in soldOutProducts) 
    { 
        Console.WriteLine("{0} is sold out!", product.ProductName); 
    } 
} 
```
```kotlin
//kotlin
fun linq2() {
    val soldOutProducts = products.filter { it.unitsInStock == 0 }

    Log.d("Sold out products:")
    soldOutProducts.forEach { Log.d("${it.productName} is sold out!") }
}
```
#### Output

    Sold out products:
    Chef Anton's Gumbo Mix is sold out!
    Alice Mutton is sold out!
    Thüringer Rostbratwurst is sold out!
    Gorgonzola Telino is sold out!
    Perth Pasties is sold out!

### linq3: Where - Simple 3
```csharp
//c#
public void Linq3() 
{ 
    List<Product> products = GetProductList(); 
  
    var expensiveInStockProducts = 
        from p in products 
        where p.UnitsInStock > 0 && p.UnitPrice > 3.00M 
        select p; 
  
    Console.WriteLine("In-stock products that cost more than 3.00:"); 
    foreach (var product in expensiveInStockProducts) 
    { 
        Console.WriteLine("{0} is in stock and costs more than 3.00.", product.ProductName); 
    } 
} 
```
```kotlin
//kotlin
fun linq3() {
    val expensiveInStockProducts = products.filter { it.unitsInStock > 0 && it.unitPrice > 3.00 }

    Log.d("In-stock products that cost more than 3.00:")
    expensiveInStockProducts.forEach { Log.d("${it.productName} is in stock and costs more than 3.00.") }
}
```
#### Output

    In-stock products that cost more than 3.00:
    Chai is in stock and costs more than 3.00.
    Chang is in stock and costs more than 3.00.
    Aniseed Syrup is in stock and costs more than 3.00.
    ...

### linq4: Where - Drilldown
```csharp
//c#
public void Linq4() 
{ 
    List<Customer> customers = GetCustomerList(); 
  
    var waCustomers = 
        from c in customers 
        where c.Region == "WA" 
        select c; 
  
    Console.WriteLine("Customers from Washington and their orders:"); 
    foreach (var customer in waCustomers) 
    { 
        Console.WriteLine("Customer {0}: {1}", customer.CustomerID, customer.CompanyName); 
        foreach (var order in customer.Orders) 
        { 
            Console.WriteLine("  Order {0}: {1}", order.OrderID, order.OrderDate); 
        } 
    } 
} 
```
```kotlin
//kotlin
fun linq4() {
    val waCustomers = customers.filter { "WA" == it.region }

    Log.d("Customers from Washington and their orders:")
    waCustomers.forEach { c ->
        Log.d("Customer ${c.customerId} ${c.companyName}")
        c.orders.forEach { Log.d("  Order ${it.orderId}: ${dateFmt(it.orderDate)}") }
    }
}
```
#### Output

    Customers from Washington and their orders:
    Customer LAZYK Lazy K Kountry Store
      Order 10482: 1997/03/21
      Order 10545: 1997/05/22
    Customer TRAIH Trail's Head Gourmet Provisioners
      Order 10574: 1997/06/19
      Order 10577: 1997/06/23
      Order 10822: 1998/01/08
      ...

### linq5: Where - Indexed
```csharp
//c#
public void Linq5() 
{ 
    string[] digits = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" }; 
  
    var shortDigits = digits.Where((digit, index) => digit.Length < index); 
  
    Console.WriteLine("Short digits:"); 
    foreach (var d in shortDigits) 
    { 
        Console.WriteLine("The word {0} is shorter than its value.", d); 
    } 
}
```
```kotlin
//kotlin
fun linq5() {
    val digits = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

    val shortDigits = digits.filterIndexed { i, it -> it.length < i }

    Log.d("Short digits:")
    shortDigits.forEach { Log.d("The word $it is shorter than its value.") }
}
```
#### Output

    Short digits:
    The word five is shorter than its value.
    The word six is shorter than its value.
    The word seven is shorter than its value.
    The word eight is shorter than its value.
    The word nine is shorter than its value.

LINQ - Projection Operators
---------------------------

### linq6: Select - Simple 1
```csharp
//c#
public void Linq6() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    var numsPlusOne = 
        from n in numbers 
        select n + 1; 
  
    Console.WriteLine("Numbers + 1:"); 
    foreach (var i in numsPlusOne) 
    { 
        Console.WriteLine(i); 
    } 
}
```
```kotlin
//kotlin
fun linq06() {
    val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

    val numsPlusOne = numbers.map { it + 1 }

    Log.d("Numbers + 1:")
    numsPlusOne.forEach { Log.d(it) }
}
```
#### Output

    Numbers + 1:
    6
    5
    2
    4
    10
    9
    7
    8
    3
    1

### linq7: Select - Simple 2
```csharp
//c#
public void Linq7() 
{ 
    List<Product> products = GetProductList(); 
  
    var productNames = 
        from p in products 
        select p.ProductName; 
  
    Console.WriteLine("Product Names:"); 
    foreach (var productName in productNames) 
    { 
        Console.WriteLine(productName); 
    } 
}
```
```kotlin
//kotlin
fun linq07() {
    val productNames = products.map { it.productName }

    Log.d("Product Names:")
    productNames.forEach { Log.d(it) }
}
```
#### Output

    Product Names:
    Chai
    Chang
    Aniseed Syrup
    Chef Anton's Cajun Seasoning
    Chef Anton's Gumbo Mix
    ...

### linq8: Select - Transformation
```csharp
//c#
public void Linq8() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
    string[] strings = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" }; 
  
    var textNums = 
        from n in numbers 
        select strings[n]; 
  
    Console.WriteLine("Number strings:"); 
    foreach (var s in textNums) 
    { 
        Console.WriteLine(s); 
    } 
}
```
```kotlin
//kotlin
fun linq08() {
    val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)
    val strings = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

    val textNums = numbers.map { strings[it] }

    Log.d("Number strings:")
    textNums.forEach { Log.d(it) }
}
```
#### Output

    Number strings:
    five
    four
    one
    three
    nine
    eight
    six
    seven
    two
    zero

### linq9: Select - Anonymous Types 1
```csharp
//c#
public void Linq9() 
{ 
    string[] words = { "aPPLE", "BlUeBeRrY", "cHeRry" }; 
  
    var upperLowerWords = 
        from w in words 
        select new { Upper = w.ToUpper(), Lower = w.ToLower() }; 
  
    foreach (var ul in upperLowerWords) 
    { 
        Console.WriteLine("Uppercase: {0}, Lowercase: {1}", ul.Upper, ul.Lower); 
    } 
}
```
```kotlin
//kotlin
fun linq09() {
    val words = arrayOf("aPPLE", "BlUeBeRrY", "cHeRry")

    val upperLowerWords = words.map { w -> Pair(w.toUpperCase(), w.toLowerCase()) }

    upperLowerWords.forEach { Log.d("Uppercase: ${it.first}, Lowercase: ${it.second}") }
}
```
#### Output

    Uppercase: APPLE, Lowercase: apple
    Uppercase: BLUEBERRY, Lowercase: blueberry
    Uppercase: CHERRY, Lowercase: cherry

### linq10: Select - Anonymous Types 2
```csharp
//c#
public void Linq10() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
    string[] strings = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" }; 
  
    var digitOddEvens = 
        from n in numbers 
        select new { Digit = strings[n], Even = (n % 2 == 0) }; 
  
    foreach (var d in digitOddEvens) 
    { 
        Console.WriteLine("The digit {0} is {1}.", d.Digit, d.Even ? "even" : "odd"); 
    } 
}
```
```kotlin
//kotlin
fun linq10() {
    val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)
    val strings = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

    val digitOddEvens = numbers.map { Pair(strings[it], it % 2 == 0) }

    digitOddEvens.forEach {
        val (d,isEven) = it
        Log.d("The digit $d is ${if (isEven) "even" else "odd"}.")
    }
}
```
#### Output

    The digit five is odd.
    The digit four is even.
    The digit one is odd.
    The digit three is odd.
    The digit nine is odd.
    The digit eight is even.
    The digit six is even.
    The digit seven is odd.
    The digit two is even.
    The digit zero is even.

### linq11: Select - Anonymous Types 3
```csharp
//c#
public void Linq11() 
{ 
    List<Product> products = GetProductList(); 
  
    var productInfos = 
        from p in products 
        select new { p.ProductName, p.Category, Price = p.UnitPrice }; 
  
    Console.WriteLine("Product Info:"); 
    foreach (var productInfo in productInfos) 
    { 
        Console.WriteLine("{0} is in the category {1} and costs {2} per unit.", productInfo.ProductName, productInfo.Category, productInfo.Price); 
    } 
}
```
```kotlin
//kotlin
fun linq11() {
    val productInfos = products.map { p -> Triple(p.productName, p.category, p.unitPrice) }

    Log.d("Product Info:")
    productInfos.forEach {
        val (name,category,cost) = it
        Log.d("$name is in the category $category and costs $cost per unit.")
    }
}
```
#### Output

    Product Info:
    Chai is in the category Beverages and costs 18.0 per unit.
    Chang is in the category Beverages and costs 19.0 per unit.
    Aniseed Syrup is in the category Condiments and costs 10.0 per unit.
    ...

### linq12: Select - Indexed
```csharp
//c#
public void Linq12() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    var numsInPlace = numbers.Select((num, index) => new { Num = num, InPlace = (num == index) }); 
  
    Console.WriteLine("Number: In-place?"); 
    foreach (var n in numsInPlace) 
    { 
        Console.WriteLine("{0}: {1}", n.Num, n.InPlace); 
    } 
}
```
```kotlin
//kotlin
fun linq12() {
    val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

    val numsInPlace = numbers.mapIndexed { index, n -> Pair(n, n == index) }

    Log.d("Number: In-place?")
    numsInPlace.forEach { Log.d("${it.first.toString()}: ${it.second}") }
}
```
#### Output

    Number: In-place?
    5: false
    4: false
    1: false
    3: true
    9: false
    8: false
    6: true
    7: true
    2: false
    0: false

### linq13: Select - Filtered
```csharp
//c#
public void Linq13() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
    string[] digits = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" }; 
  
    var lowNums = 
        from n in numbers 
        where n < 5 
        select digits[n]; 
  
    Console.WriteLine("Numbers < 5:"); 
    foreach (var num in lowNums) 
    { 
        Console.WriteLine(num); 
    } 
}
```
```kotlin
//kotlin
fun linq13() {
    val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)
    val digits = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

    val lowNums = numbers.filter { it < 5 }.map { digits[it] }

    Log.d("Numbers < 5:")
    lowNums.forEach { Log.d(it) }
}
```
#### Output

    Numbers < 5:
    four
    one
    three
    two
    zero

### linq14: SelectMany - Compound from 1
```csharp
//c#
public void Linq14() 
{ 
    int[] numbersA = { 0, 2, 4, 5, 6, 8, 9 }; 
    int[] numbersB = { 1, 3, 5, 7, 8 }; 
  
    var pairs = 
        from a in numbersA 
        from b in numbersB 
        where a < b 
        select new { a, b }; 
  
    Console.WriteLine("Pairs where a < b:"); 
    foreach (var pair in pairs) 
    { 
        Console.WriteLine("{0} is less than {1}", pair.a, pair.b); 
    } 
}
```
```kotlin
//kotlin
fun linq14() {
    val numbersA = intArrayOf(0, 2, 4, 5, 6, 8, 9)
    val numbersB = intArrayOf(1, 3, 5, 7, 8)

    val pairs = numbersA.flatMap { a ->
        numbersB.filter { b -> a < b }
                .map { Pair(a, it) }
    }

    Log.d("Pairs where a < b:")
    pairs.forEach { Log.d("${it.first.toString()} is less than ${it.second}") }
}
```
#### Output

    Pairs where a < b:
    0 is less than 1
    0 is less than 3
    0 is less than 5
    0 is less than 7
    0 is less than 8
    2 is less than 3
    2 is less than 5
    2 is less than 7
    2 is less than 8
    4 is less than 5
    4 is less than 7
    4 is less than 8
    5 is less than 7
    5 is less than 8
    6 is less than 7
    6 is less than 8

### linq15: SelectMany - Compound from 2
```csharp
//c#
public void Linq15() 
{ 
    List<Customer> customers = GetCustomerList(); 
  
    var orders = 
        from c in customers 
        from o in c.Orders 
        where o.Total < 500.00M 
        select new { c.CustomerID, o.OrderID, o.Total }; 
  
    ObjectDumper.Write(orders); 
}
```
```kotlin
//kotlin
fun linq15() {
    val orders = customers.flatMap { c ->
        c.orders.filter { it.total < 500 }
                .map { o -> Triple(c.customerId, o.orderId, o.total) }
    }

    orders.forEach { Log.d(it) }
}
```
#### Output

    (ALFKI, 10702, 330.0)
    (ALFKI, 10952, 471.2)
    (ANATR, 10308, 88.8)
    (ANATR, 10625, 479.75)
    ...

### linq16: SelectMany - Compound from 3
```csharp
//c#
public void Linq16() 
{ 
    List<Customer> customers = GetCustomerList(); 
  
    var orders = 
        from c in customers 
        from o in c.Orders 
        where o.OrderDate >= new DateTime(1998, 1, 1) 
        select new { c.CustomerID, o.OrderID, o.OrderDate }; 
  
    ObjectDumper.Write(orders); 
}
```
```kotlin
//kotlin
fun linq16() {
    val date = Date(98, 0, 1) //= 1998-01-01
    val orders = customers.flatMap { c ->
        c.orders.filter { it.orderDate >= date }
                .map { o -> Triple(c.customerId, o.orderId, o.orderDate) }
    }

    orders.forEach { Log.d(it) }
}
```
#### Output

    (ALFKI, 10835, Thu Jan 15 00:00:00 PST 1998)
    (ALFKI, 10952, Mon Mar 16 00:00:00 PST 1998)
    (ALFKI, 11011, Thu Apr 09 00:00:00 PDT 1998)
    (ANATR, 10926, Wed Mar 04 00:00:00 PST 1998)
    (ANTON, 10856, Wed Jan 28 00:00:00 PST 1998)
    ...

### linq17: SelectMany - from Assignment
```csharp
//c#
public void Linq17() 
{ 
    List<Customer> customers = GetCustomerList(); 
  
    var orders = 
        from c in customers 
        from o in c.Orders 
        where o.Total >= 2000.0M 
        select new { c.CustomerID, o.OrderID, o.Total }; 
  
    ObjectDumper.Write(orders); 
}
```
```kotlin
//kotlin
fun linq17() {
    val orders = customers.flatMap { c ->
        c.orders.filter { it.total >= 2000 }
                .map { o -> Triple(c.customerId, o.orderId, o.total) }
    }

    orders.forEach { Log.d(it) }
}
```
#### Output

    (ANTON, 10573, 2082.0)
    (AROUT, 10558, 2142.9)
    (AROUT, 10953, 4441.25)
    (BERGS, 10384, 2222.4)
    (BERGS, 10524, 3192.65)
    ...

### linq18: SelectMany - Multiple from
```csharp
//c#
public void Linq18() 
{ 
    List<Customer> customers = GetCustomerList(); 
  
    DateTime cutoffDate = new DateTime(1997, 1, 1); 
  
    var orders = 
        from c in customers 
        where c.Region == "WA" 
        from o in c.Orders 
        where o.OrderDate >= cutoffDate 
        select new { c.CustomerID, o.OrderID }; 
  
    ObjectDumper.Write(orders); 
}
```
```kotlin
//kotlin
fun linq18() {
    val cutoffDate = Date(97, 0, 1) //1997-01-01

    val orders = customers
        .filter { it.region == "WA" }.flatMap { c ->
            c.orders.filter { it.orderDate > cutoffDate }
                    .map { o -> Pair(c.customerId, o.orderId) }
        }

    orders.forEach { Log.d(it) }
}
```
#### Output

    (LAZYK, 10482)
    (LAZYK, 10545)
    (TRAIH, 10574)
    (TRAIH, 10577)
    (TRAIH, 10822)
    (WHITC, 10469)
    (WHITC, 10483)
    (WHITC, 10504)
    (WHITC, 10596)
    (WHITC, 10693)
    (WHITC, 10696)
    (WHITC, 10723)
    (WHITC, 10740)
    (WHITC, 10861)
    (WHITC, 10904)
    (WHITC, 11032)
    (WHITC, 11066)

### linq19: SelectMany - Indexed
```csharp
//c#
public void Linq19() 
{ 
    List<Customer> customers = GetCustomerList(); 
  
    var customerOrders = 
        customers.SelectMany( 
            (cust, custIndex) => 
            cust.Orders.Select(o => "Customer #" + (custIndex + 1) + 
                                    " has an order with OrderID " + o.OrderID)); 
  
    ObjectDumper.Write(customerOrders); 
}
```
```kotlin
//kotlin
fun linq19() {
    var custIndex = 0
    val customerOrders = customers.flatMap { c ->
        c.orders.mapIndexed { index, o -> "Customer #$index has an order with OrderID ${o.orderId}" }
    }

    customerOrders.forEach { Log.d(it) }
}
```
#### Output

    Customer #1 has an order with OrderID 10643
    Customer #1 has an order with OrderID 10692
    Customer #1 has an order with OrderID 10702
    Customer #1 has an order with OrderID 10835
    Customer #1 has an order with OrderID 10952
    Customer #1 has an order with OrderID 11011
    Customer #2 has an order with OrderID 10308
    Customer #2 has an order with OrderID 10625
    Customer #2 has an order with OrderID 10759
    Customer #2 has an order with OrderID 10926
    ...

LINQ - Partitioning Operators
-----------------------------

### linq20: Take - Simple
```csharp
//c#
public void Linq20() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 

    var first3Numbers = numbers.Take(3); 
  
    Console.WriteLine("First 3 numbers:"); 
  
    foreach (var n in first3Numbers) 
    { 
        Console.WriteLine(n); 
    } 
}
```
```kotlin
//kotlin
fun linq20() {
    val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

    val first3Numbers = numbers.take(3)

    Log.d("First 3 numbers:")
    first3Numbers.forEach { Log.d(it) }
}
```
#### Output

    First 3 numbers:
    5
    4
    1

### linq21: Take - Nested
```csharp
//c#
public void Linq21()   
{ 
    List<Customer> customers = GetCustomerList(); 
  
    var first3WAOrders = ( 
        from c in customers 
        from o in c.Orders 
        where c.Region == "WA" 
        select new { c.CustomerID, o.OrderID, o.OrderDate }) 
        .Take(3); 
  
    Console.WriteLine("First 3 orders in WA:"); 
    foreach (var order in first3WAOrders) 
    { 
        ObjectDumper.Write(order); 
    } 
}
```
```kotlin
//kotlin
fun linq21() {
    val first3WAOrders = customers
        .filter {  it.region == "WA" }
        .flatMap { c ->
            c.orders.map { o -> Triple(c.customerId, o.orderId, o.orderDate) }
        }
        .take(3)

    Log.d("First 3 orders in WA:")
    first3WAOrders.forEach { Log.d(it) }
}
```
#### Output

    First 3 orders in WA:
    (LAZYK, 10482, Fri Mar 21 00:00:00 PST 1997)
    (LAZYK, 10545, Thu May 22 00:00:00 PDT 1997)
    (TRAIH, 10574, Thu Jun 19 00:00:00 PDT 1997)


### linq22: Skip - Simple
```csharp
//c#
public void Linq22() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    var allButFirst4Numbers = numbers.Skip(4); 
  
    Console.WriteLine("All but first 4 numbers:"); 
    foreach (var n in allButFirst4Numbers) 
    { 
        Console.WriteLine(n); 
    } 
}
```
```kotlin
//kotlin
fun linq22() {
    val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

    val allButFirst4Numbers = numbers.skip(4)

    Log.d("All but first 4 numbers:")
    allButFirst4Numbers.forEach { Log.d(it) }
}
```
#### Output

    All but first 4 numbers:
    9
    8
    6
    7
    2
    0

### linq23: Skip - Nested
```csharp
//c#
public void Linq23()   
{ 
    List<Customer> customers = GetCustomerList(); 
  
    var waOrders = 
        from c in customers 
        from o in c.Orders 
        where c.Region == "WA" 
        select new { c.CustomerID, o.OrderID, o.OrderDate }; 
  
    var allButFirst2Orders = waOrders.Skip(2); 
  
    Console.WriteLine("All but first 2 orders in WA:"); 
    foreach (var order in allButFirst2Orders) 
    { 
        ObjectDumper.Write(order); 
    } 
}
```
```kotlin
//kotlin
fun linq23() {
    val waOrders = customers
        .filter { it.region == "WA" }
        .flatMap { c ->
            c.orders.map { o -> Triple(c.customerId, o.orderId, o.orderDate) }
        }

    val allButFirst2Orders = waOrders.skip(2)

    Log.d("All but first 2 orders in WA:")
    allButFirst2Orders.forEach { Log.d(it) }
}
```
#### Output

    All but first 2 orders in WA:
    (TRAIH, 10574, Thu Jun 19 00:00:00 PDT 1997)
    (TRAIH, 10577, Mon Jun 23 00:00:00 PDT 1997)
    (TRAIH, 10822, Thu Jan 08 00:00:00 PST 1998)
    (WHITC, 10269, Wed Jul 31 00:00:00 PDT 1996)
    (WHITC, 10344, Fri Nov 01 00:00:00 PST 1996)
    (WHITC, 10469, Mon Mar 10 00:00:00 PST 1997)
    (WHITC, 10483, Mon Mar 24 00:00:00 PST 1997)
    (WHITC, 10504, Fri Apr 11 00:00:00 PDT 1997)
    (WHITC, 10596, Fri Jul 11 00:00:00 PDT 1997)
    (WHITC, 10693, Mon Oct 06 00:00:00 PDT 1997)
    (WHITC, 10696, Wed Oct 08 00:00:00 PDT 1997)
    (WHITC, 10723, Thu Oct 30 00:00:00 PST 1997)
    (WHITC, 10740, Thu Nov 13 00:00:00 PST 1997)
    (WHITC, 10861, Fri Jan 30 00:00:00 PST 1998)
    (WHITC, 10904, Tue Feb 24 00:00:00 PST 1998)
    (WHITC, 11032, Fri Apr 17 00:00:00 PDT 1998)
    (WHITC, 11066, Fri May 01 00:00:00 PDT 1998)

### linq24: TakeWhile - Simple
```csharp
//c#
public void Linq24() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    var firstNumbersLessThan6 = numbers.TakeWhile(n => n < 6); 
  
    Console.WriteLine("First numbers less than 6:"); 
    foreach (var n in firstNumbersLessThan6) 
    { 
        Console.WriteLine(n); 
    } 
}
```
```kotlin
//kotlin
fun linq24() {
    val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

    val firstNumbersLessThan6 = numbers.takeWhile { it < 6 }

    Log.d("First numbers less than 6:")
    firstNumbersLessThan6.forEach { Log.d(it) }
}
```
#### Output

    First numbers less than 6:
    5
    4
    1
    3

### linq25: TakeWhile - Indexed
```csharp
//c#
public void Linq25() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    var firstSmallNumbers = numbers.TakeWhile((n, index) => n >= index); 
  
    Console.WriteLine("First numbers not less than their position:"); 
    foreach (var n in firstSmallNumbers) 
    { 
        Console.WriteLine(n); 
    } 
}
```
```kotlin
//kotlin
fun linq25() {
    val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

    var index = 0
    val firstSmallNumbers = numbers.takeWhile { it >= index++ }

    Log.d("First numbers not less than their position:")
    firstSmallNumbers.forEach { Log.d(it) }
}
```
#### Output

    First numbers not less than their position:
    5
    4

### linq26: SkipWhile - Simple
```csharp
//c#
public void Linq26() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    var allButFirst3Numbers = numbers.SkipWhile(n => n % 3 != 0); 
  
    Console.WriteLine("All elements starting from first element divisible by 3:"); 
    foreach (var n in allButFirst3Numbers) 
    { 
        Console.WriteLine(n); 
    } 
}
```
```kotlin
//kotlin
fun linq26() {
    val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

    val allButFirst3Numbers = numbers.skipWhile { it % 3 != 0 }

    Log.d("All elements starting from first element divisible by 3:")
    allButFirst3Numbers.forEach { Log.d(it) }
}
```
#### Output

    All elements starting from first element divisible by 3:
    3
    9
    8
    6
    7
    2
    0

### linq27: SkipWhile - Indexed
```csharp
//c#
public void Linq27() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    var laterNumbers = numbers.SkipWhile((n, index) => n >= index); 
  
    Console.WriteLine("All elements starting from first element less than its position:"); 
    foreach (var n in laterNumbers) 
    { 
        Console.WriteLine(n); 
    } 
}
```
```kotlin
//kotlin
fun linq27() {
    val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

    var index = 0
    val laterNumbers = numbers.skipWhile { it >= index++ }

    Log.d("All elements starting from first element less than its position:")
    laterNumbers.forEach { Log.d(it) }
}
```
#### Output

    All elements starting from first element less than its position:
    1
    3
    9
    8
    6
    7
    2
    0


LINQ - Ordering Operators
-------------------------

### linq28: OrderBy - Simple 1
```csharp
//c#
public void Linq28() 
{ 
    string[] words = { "cherry", "apple", "blueberry" }; 
  
    var sortedWords = 
        from w in words 
        orderby w 
        select w; 
  
    Console.WriteLine("The sorted list of words:"); 
    foreach (var w in sortedWords) 
    { 
        Console.WriteLine(w); 
    } 
}
```
```kotlin
//kotlin
fun linq28() {
    val words = arrayOf("cherry", "apple", "blueberry")

    val sortedWords = words.sorted()

    Log.d("The sorted list of words:")
    sortedWords.forEach { Log.d(it) }
}
```
#### Output

    The sorted list of words:
    apple
    blueberry
    cherry

### linq29: OrderBy - Simple 2
```csharp
//c#
public void Linq29() 
{ 
    string[] words = { "cherry", "apple", "blueberry" }; 
  
    var sortedWords = 
        from w in words 
        orderby w.Length 
        select w; 
  
    Console.WriteLine("The sorted list of words (by length):"); 
    foreach (var w in sortedWords) 
    { 
        Console.WriteLine(w); 
    } 
}
```
```kotlin
//kotlin
fun linq29() {
    val words = arrayOf("cherry", "apple", "blueberry")

    val sortedWords = words.sortedBy { s -> s.length }

    Log.d("The sorted list of words (by length):")
    sortedWords.forEach { Log.d(it) }
}
```
#### Output

    The sorted list of words (by length):
    apple
    cherry
    blueberry

### linq30: OrderBy - Simple 3
```csharp
//c#
public void Linq30() 
{ 
    List<Product> products = GetProductList(); 
  
    var sortedProducts = 
        from p in products 
        orderby p.ProductName 
        select p; 
  
    ObjectDumper.Write(sortedProducts); 
}
```
```kotlin
//kotlin
fun linq30() {
    val sortedProducts = products.sortedBy { it.productName }

    sortedProducts.forEach { Log.d(it) }
}
```
#### Output

    (Product id=17, name=Alice Mutton, cat=Meat/Poultry, price=39.0, inStock=0)
    (Product id=3, name=Aniseed Syrup, cat=Condiments, price=10.0, inStock=13)
    (Product id=40, name=Boston Crab Meat, cat=Seafood, price=18.4, inStock=123)
    (Product id=60, name=Camembert Pierrot, cat=Dairy Products, price=34.0, inStock=19)
    (Product id=18, name=Carnarvon Tigers, cat=Seafood, price=62.5, inStock=42)
    ...

### linq31: OrderBy - Comparer
```csharp
//c#
public void Linq31() 
{ 
    string[] words = { "aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry" }; 
  
    var sortedWords = words.OrderBy(a => a, new CaseInsensitiveComparer()); 
  
    ObjectDumper.Write(sortedWords); 
} 
```
```kotlin
//kotlin
fun linq31() {
    val words = arrayOf("aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry")

    val sortedWords = words.sortedWith(String.CASE_INSENSITIVE_ORDER)

    sortedWords.forEach { Log.d(it) }
}
```
#### Output

    AbAcUs
    aPPLE
    BlUeBeRrY
    bRaNcH
    cHeRry
    ClOvEr

### linq32: OrderByDescending - Simple 1
```csharp
//c#
public void Linq32() 
{ 
    double[] doubles = { 1.7, 2.3, 1.9, 4.1, 2.9 }; 
  
    var sortedDoubles = 
        from d in doubles 
        orderby d descending 
        select d; 
  
    Console.WriteLine("The doubles from highest to lowest:"); 
    foreach (var d in sortedDoubles) 
    { 
        Console.WriteLine(d); 
    } 
}
```
```kotlin
//kotlin
fun linq32() {
    val doubles = doubleArrayOf(1.7, 2.3, 1.9, 4.1, 2.9)

    val sortedDoubles = doubles.sortedDescending()

    Log.d("The doubles from highest to lowest:")
    sortedDoubles.forEach { Log.d(it) }
}
```
#### Output

    The doubles from highest to lowest:
    4.1
    2.9
    2.3
    1.9
    1.7

### linq33: OrderByDescending - Simple 2
```csharp
//c#
public void Linq33() 
{ 
    List<Product> products = GetProductList(); 
  
    var sortedProducts = 
        from p in products 
        orderby p.UnitsInStock descending 
        select p; 
  
    ObjectDumper.Write(sortedProducts); 
}
```
```kotlin
//kotlin
fun linq33() {
    val sortedProducts = products.sortedByDescending { it.unitsInStock }

    sortedProducts.forEach { Log.d(it) }
}
```
#### Output

    (Product id=75, name=Rhönbräu Klosterbier, cat=Beverages, price=7.75, inStock=125)
    (Product id=40, name=Boston Crab Meat, cat=Seafood, price=18.4, inStock=123)
    (Product id=6, name=Grandma's Boysenberry Spread, cat=Condiments, price=25.0, inStock=120)
    (Product id=55, name=Pâté chinois, cat=Meat/Poultry, price=24.0, inStock=115)
    (Product id=61, name=Sirop d'érable, cat=Condiments, price=28.5, inStock=113)
    ...

### linq34: OrderByDescending - Comparer
```csharp
//c#
public void Linq34() 
{ 
    string[] words = { "aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry" }; 
  
    var sortedWords = words.OrderByDescending(a => a, new CaseInsensitiveComparer()); 
  
    ObjectDumper.Write(sortedWords); 
} 
```
```kotlin
//kotlin
fun linq34() {
    val words = arrayOf("aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry")

    val sortedWords = words.sortedWith(String.CASE_INSENSITIVE_ORDER).reversed()

    sortedWords.forEach { Log.d(it) }
}
```
#### Output

    ClOvEr
    cHeRry
    bRaNcH
    BlUeBeRrY
    aPPLE
    AbAcUs

### linq35: ThenBy - Simple
```csharp
//c#
public void Linq35() 
{ 
    string[] digits = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" }; 
  
    var sortedDigits = 
        from d in digits 
        orderby d.Length, d 
        select d; 
  
    Console.WriteLine("Sorted digits:"); 
    foreach (var d in sortedDigits) 
    { 
        Console.WriteLine(d); 
    } 
}
```
```kotlin
//kotlin
fun linq35() {
    val digits = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

    val sortedDigits = digits.sorted().sortedBy { it.length }

    Log.d("Sorted digits:")
    sortedDigits.forEach { Log.d(it) }
}
```
#### Output

    Sorted digits:
    one
    six
    two
    five
    four
    nine
    zero
    eight
    seven
    three

### linq36: ThenBy - Comparer
```csharp
//c#
public void Linq36() 
{ 
    string[] words = { "aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry" }; 
  
    var sortedWords = 
        words.OrderBy(a => a.Length) 
             .ThenBy(a => a, new CaseInsensitiveComparer()); 
  
    ObjectDumper.Write(sortedWords); 
} 
```
```kotlin
//kotlin
fun linq36() {
    val words = arrayOf("aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry")

    val sortedWords = words.sortedWith(String.CASE_INSENSITIVE_ORDER).sortedBy { it.length }

    sortedWords.forEach { Log.d(it) }
}
```
#### Output

    aPPLE
    AbAcUs
    bRaNcH
    cHeRry
    ClOvEr
    BlUeBeRrY

### linq37: ThenByDescending - Simple
```csharp
//c#
public void Linq37() 
{ 
    List<Product> products = GetProductList(); 
  
    var sortedProducts = 
        from p in products 
        orderby p.Category, p.UnitPrice descending 
        select p; 
  
    ObjectDumper.Write(sortedProducts); 
}
```
```kotlin
//kotlin
fun linq37() {
    val sortedProducts = orderByAll(products,
        Comparator<Product> { a, b -> a.category.compareTo(b.category) },
        Comparator<Product> { a, b -> b.unitPrice.compareTo(a.unitPrice) })

    sortedProducts.forEach { Log.d(it) }
}
```
#### Output

    (Product id=38, name=Côte de Blaye, cat=Beverages, price=263.5, inStock=17)
    (Product id=43, name=Ipoh Coffee, cat=Beverages, price=46.0, inStock=17)
    (Product id=2, name=Chang, cat=Beverages, price=19.0, inStock=17)
    (Product id=1, name=Chai, cat=Beverages, price=18.0, inStock=39)
    (Product id=35, name=Steeleye Stout, cat=Beverages, price=18.0, inStock=20)
    (Product id=39, name=Chartreuse verte, cat=Beverages, price=18.0, inStock=69)
    (Product id=76, name=Lakkalikööri, cat=Beverages, price=18.0, inStock=57)
    (Product id=70, name=Outback Lager, cat=Beverages, price=15.0, inStock=15)
    (Product id=34, name=Sasquatch Ale, cat=Beverages, price=14.0, inStock=111)
    ...

### linq38: ThenByDescending - Comparer
```csharp
//c#
public void Linq38() 
{ 
    string[] words = { "aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry" }; 
  
    var sortedWords = 
        words.OrderBy(a => a.Length) 
             .ThenByDescending(a => a, new CaseInsensitiveComparer()); 
  
    ObjectDumper.Write(sortedWords); 
} 
```
```kotlin
//kotlin
fun linq38() {
    val words = arrayOf("aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry")

    val sortedWords = orderByAll(words,
        Comparator<String> { a, b -> Integer.compare(a.length, b.length) },
        Comparator<String> { a, b -> String.CASE_INSENSITIVE_ORDER.compare(b, a) })

    sortedWords.forEach { Log.d(it) }
}
```
#### Output

    aPPLE
    ClOvEr
    cHeRry
    bRaNcH
    AbAcUs
    BlUeBeRrY

### linq39: Reverse
```csharp
//c#
public void Linq39() 
{ 
    string[] digits = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" }; 
  
    var reversedIDigits = ( 
        from d in digits 
        where d[1] == 'i' 
        select d) 
        .Reverse(); 
  
    Console.WriteLine("A backwards list of the digits with a second character of 'i':"); 
    foreach (var d in reversedIDigits) 
    { 
        Console.WriteLine(d); 
    } 
}
```
```kotlin
//kotlin
fun linq39() {
    val digits = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

    val reversedIDigits = digits.filter { it[1] == 'i' }.reversed()

    Log.d("A backwards list of the digits with a second character of 'i':")
    reversedIDigits.forEach { Log.d(it) }
}
```
#### Output

    A backwards list of the digits with a second character of 'i':
    nine
    eight
    six
    five


LINQ - Grouping Operators
-------------------------

### linq40: GroupBy - Simple 1
```csharp
//c#
public void Linq40() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    var numberGroups = 
        from n in numbers 
        group n by n % 5 into g 
        select new { Remainder = g.Key, Numbers = g }; 
  
    foreach (var g in numberGroups) 
    { 
        Console.WriteLine("Numbers with a remainder of {0} when divided by 5:", g.Remainder); 
        foreach (var n in g.Numbers) 
        { 
            Console.WriteLine(n); 
        } 
    } 
}
```
```kotlin
//kotlin
fun linq40() {
    val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

    val numberGroups = numbers.groupBy { it % 5 }
        .map { Pair(it.key, it) }

    numberGroups.forEach { it ->
        val (remainder, g) = it
        Log.d("Numbers with a remainder of $remainder when divided by 5:")
        g.value.forEach { Log.d(it) }
    }
}
```
#### Output

    Numbers with a remainder of 0 when divided by 5:
    5
    0
    Numbers with a remainder of 4 when divided by 5:
    4
    9
    Numbers with a remainder of 1 when divided by 5:
    1
    6
    Numbers with a remainder of 3 when divided by 5:
    3
    8
    Numbers with a remainder of 2 when divided by 5:
    7
    2

### linq41: GroupBy - Simple 2
```csharp
//c#
public void Linq41() 
{ 
    string[] words = { "blueberry", "chimpanzee", "abacus", "banana", "apple", "cheese" }; 
  
    var wordGroups = 
        from w in words 
        group w by w[0] into g 
        select new { FirstLetter = g.Key, Words = g }; 
  
    foreach (var g in wordGroups) 
    { 
        Console.WriteLine("Words that start with the letter '{0}':", g.FirstLetter); 
        foreach (var w in g.Words) 
        { 
            Console.WriteLine(w); 
        } 
    } 
}
```
```kotlin
//kotlin
fun linq41() {
    val words = arrayOf("blueberry", "chimpanzee", "abacus", "banana", "apple", "cheese")

    val wordGroups = words.groupBy { it[0] }
        .map { Pair(it.key, it) }

    wordGroups.forEach {
        val (firstLetter, g) = it
        Log.d("Words that start with the letter '$firstLetter':")
        g.value.forEach { Log.d(it) }
    }
}
```
#### Output

    Words that start with the letter 'b':
    blueberry
    banana
    Words that start with the letter 'c':
    chimpanzee
    cheese
    Words that start with the letter 'a':
    abacus
    apple

### linq42: GroupBy - Simple 3
```csharp
//c#
public void Linq42() 
{ 
    List<Product> products = GetProductList(); 
  
    var orderGroups = 
        from p in products 
        group p by p.Category into g 
        select new { Category = g.Key, Products = g }; 
  
    ObjectDumper.Write(orderGroups, 1); 
} 
```
```kotlin
//kotlin
fun linq42() {
    val orderGroups = products.groupBy { it.category }
        .map { Pair(it.key, it) }

    orderGroups.forEach {
        val (category,g) = it
        Log.d("${category}:")
        g.value.forEach { Log.d(it) }
    }
}
```
#### Output

    Beverages:
    (Product id=1, name=Chai, cat=Beverages, price=18.0, inStock=39)
    (Product id=2, name=Chang, cat=Beverages, price=19.0, inStock=17)
    (Product id=24, name=Guaraná Fantástica, cat=Beverages, price=4.5, inStock=20)
    (Product id=34, name=Sasquatch Ale, cat=Beverages, price=14.0, inStock=111)
    (Product id=35, name=Steeleye Stout, cat=Beverages, price=18.0, inStock=20)
    (Product id=38, name=Côte de Blaye, cat=Beverages, price=263.5, inStock=17)
    (Product id=39, name=Chartreuse verte, cat=Beverages, price=18.0, inStock=69)
    (Product id=43, name=Ipoh Coffee, cat=Beverages, price=46.0, inStock=17)
    (Product id=67, name=Laughing Lumberjack Lager, cat=Beverages, price=14.0, inStock=52)
    (Product id=70, name=Outback Lager, cat=Beverages, price=15.0, inStock=15)
    (Product id=75, name=Rhönbräu Klosterbier, cat=Beverages, price=7.75, inStock=125)
    (Product id=76, name=Lakkalikööri, cat=Beverages, price=18.0, inStock=57)
    Condiments:
    (Product id=3, name=Aniseed Syrup, cat=Condiments, price=10.0, inStock=13)
    (Product id=4, name=Chef Anton's Cajun Seasoning, cat=Condiments, price=22.0, inStock=53)

### linq43: GroupBy - Nested
```csharp
//c#
public void Linq43() 
{ 
    List<Customer> customers = GetCustomerList(); 
  
    var customerOrderGroups = 
        from c in customers 
        select 
            new 
            { 
                c.CompanyName, 
                YearGroups = 
                    from o in c.Orders 
                    group o by o.OrderDate.Year into yg 
                    select 
                        new 
                        { 
                            Year = yg.Key, 
                            MonthGroups = 
                                from o in yg 
                                group o by o.OrderDate.Month into mg 
                                select new { Month = mg.Key, Orders = mg } 
                        } 
            }; 
  
    ObjectDumper.Write(customerOrderGroups, 3); 
} 
```
```kotlin
//kotlin
fun linq43() {
    val customerOrderGroups = customers.map { c ->
        Pair(c.companyName,
             c.orders.groupBy { it.orderDate.year + 1900 }
                     .map { Pair(it.key, it.value.groupBy { it.orderDate.month + 1 }) })
    }

    customerOrderGroups.forEach {
        val (companyName, yearGroups) = it
        Log.d("\n# $companyName")
        yearGroups.forEach {
            val (year,monthGroups) = it
            Log.d("${year.toString()}: ")
            monthGroups.forEach { Log.d("    $it") }
        }
    }
}
```
#### Output

    # Alfreds Futterkiste
    1997: 
        8=[(Order id=10643, total=814.5)]
        10=[(Order id=10692, total=878.0), (Order id=10702, total=330.0)]
    1998: 
        1=[(Order id=10835, total=845.8)]
        3=[(Order id=10952, total=471.2)]
        4=[(Order id=11011, total=933.5)]

### linq44: GroupBy - Comparer
```csharp
//c#
public void Linq44() 
{ 
    string[] anagrams = { "from   ", " salt", " earn ", "  last   ", " near ", " form  " }; 
  
    var orderGroups = anagrams.GroupBy(w => w.Trim(), new AnagramEqualityComparer()); 
  
    ObjectDumper.Write(orderGroups, 1); 
} 
```
```kotlin
//kotlin
fun linq44() {
    val anagrams = listOf("from   ", " salt", " earn ", "  last   ", " near ", " form  ")

    val orderGroups = groupBy(anagrams,
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
```
#### Output

    [ ' earn ', ' near ' ]
    [ ' salt', '  last   ' ]
    [ 'from   ', ' form  ' ]

### linq45: GroupBy - Comparer, Mapped    
```csharp
//c#
public void Linq45() 
{ 
    string[] anagrams = { "from   ", " salt", " earn ", "  last   ", " near ", " form  " }; 
  
    var orderGroups = anagrams.GroupBy( 
                w => w.Trim(), 
                a => a.ToUpper(), 
                new AnagramEqualityComparer() 
                ); 
  
    ObjectDumper.Write(orderGroups, 1); 
} 
```
```kotlin
//kotlin
fun linq45() {
    val anagrams = listOf("from   ", " salt", " earn ", "  last   ", " near ", " form  ")

    val orderGroups = groupBy(anagrams,
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
```
#### Output

    [ ' EARN ', ' NEAR ' ]
    [ ' SALT', '  LAST   ' ]
    [ 'FROM   ', ' FORM  ' ]


LINQ - Set Operators
--------------------

### linq46: Distinct - 1
```csharp
//c#
public void Linq46() 
{ 
    int[] factorsOf300 = { 2, 2, 3, 5, 5 }; 
  
    var uniqueFactors = factorsOf300.Distinct(); 
  
    Console.WriteLine("Prime factors of 300:"); 
    foreach (var f in uniqueFactors) 
    { 
        Console.WriteLine(f); 
    } 
}
```
```kotlin
//kotlin
fun linq46() {
    val factorsOf300 = intArrayOf(2, 2, 3, 5, 5)

    val uniqueFactors = factorsOf300.distinct()

    Log.d("Prime factors of 300:")
    uniqueFactors.forEach { Log.d(it) }
}
```
#### Output

    Prime factors of 300:
    2
    3
    5

### linq47: Distinct - 2
```csharp
//c#
public void Linq47() 
{ 
    List<Product> products = GetProductList(); 
  
    var categoryNames = ( 
        from p in products 
        select p.Category) 
        .Distinct(); 
  
    Console.WriteLine("Category names:"); 
    foreach (var n in categoryNames) 
    { 
        Console.WriteLine(n); 
    } 
}
```
```kotlin
//kotlin
fun linq47() {
    val categoryNames = products.map { it.category}.distinct()

    Log.d("Category names:")
    categoryNames.forEach { Log.d(it) }
}
```
#### Output

    Category names:
    Beverages
    Condiments
    Produce
    Meat/Poultry
    Seafood
    Dairy Products
    Confections
    Grains/Cereals

### linq48: Union - 1
```csharp
//c#
public void Linq48() 
{ 
    int[] numbersA = { 0, 2, 4, 5, 6, 8, 9 }; 
    int[] numbersB = { 1, 3, 5, 7, 8 }; 
  
    var uniqueNumbers = numbersA.Union(numbersB); 
  
    Console.WriteLine("Unique numbers from both arrays:"); 
    foreach (var n in uniqueNumbers) 
    { 
        Console.WriteLine(n); 
    } 
}
```
```kotlin
//kotlin
fun linq48() {
    val numbersA = listOf(0, 2, 4, 5, 6, 8, 9)
    val numbersB = listOf(1, 3, 5, 7, 8)

    val uniqueNumbers = numbersA.union(numbersB)

    Log.d("Unique numbers from both arrays:")
    uniqueNumbers.forEach { Log.d(it) }
}
```
#### Output

    Unique numbers from both arrays:
    0
    2
    4
    5
    6
    8
    9
    1
    3
    7

### linq49: Union - 2
```csharp
//c#
public void Linq49() 
{ 
    List<Product> products = GetProductList(); 
    List<Customer> customers = GetCustomerList(); 
  
    var productFirstChars = 
        from p in products 
        select p.ProductName[0]; 
    var customerFirstChars = 
        from c in customers 
        select c.CompanyName[0]; 
  
    var uniqueFirstChars = productFirstChars.Union(customerFirstChars); 
  
    Console.WriteLine("Unique first letters from Product names and Customer names:"); 
    foreach (var ch in uniqueFirstChars) 
    { 
        Console.WriteLine(ch); 
    } 
}
```
```kotlin
//kotlin
fun linq49() {
    val productFirstChars = products.map { it.productName[0] }

    val customerFirstChars = customers.map { it.companyName[0] }

    val uniqueFirstChars = productFirstChars.union(customerFirstChars)

    Log.d("Unique first letters from Product names and Customer names:")
    uniqueFirstChars.forEach { Log.d(it) }
}
```
#### Output

    Unique first letters from Product names and Customer names:
    C
    A
    G
    U
    N
    M
    I
    Q
    K
    T
    P
    S
    R
    B
    J
    Z
    V
    F
    E
    W
    L
    O
    D
    H

### linq50: Intersect - 1
```csharp
//c#
public void Linq50() 
{ 
    int[] numbersA = { 0, 2, 4, 5, 6, 8, 9 }; 
    int[] numbersB = { 1, 3, 5, 7, 8 }; 
  
    var commonNumbers = numbersA.Intersect(numbersB); 
  
    Console.WriteLine("Common numbers shared by both arrays:"); 
    foreach (var n in commonNumbers) 
    { 
        Console.WriteLine(n); 
    } 
}
```
```kotlin
//kotlin
fun linq50() {
    val numbersA = listOf(0, 2, 4, 5, 6, 8, 9)
    val numbersB = listOf(1, 3, 5, 7, 8)

    val commonNumbers = numbersA.intersect(numbersB)

    Log.d("Common numbers shared by both arrays:")
    commonNumbers.forEach { Log.d(it) }
}
```
#### Output

    Common numbers shared by both arrays:
    5
    8

### linq51: Intersect - 2
```csharp
//c#
public void Linq51() 
{ 
    List<Product> products = GetProductList(); 
    List<Customer> customers = GetCustomerList(); 
  
    var productFirstChars = 
        from p in products 
        select p.ProductName[0]; 
    var customerFirstChars = 
        from c in customers 
        select c.CompanyName[0]; 
  
    var commonFirstChars = productFirstChars.Intersect(customerFirstChars); 
  
    Console.WriteLine("Common first letters from Product names and Customer names:"); 
    foreach (var ch in commonFirstChars) 
    { 
        Console.WriteLine(ch); 
    } 
}
```
```kotlin
//kotlin
fun linq51() {
    val productFirstChars = products.map { it.productName[0] }

    val customerFirstChars = customers.map { it.companyName[0] }

    val commonFirstChars = productFirstChars.intersect(customerFirstChars)

    Log.d("Common first letters from Product names and Customer names:")
    commonFirstChars.forEach { Log.d(it) }
}
```
#### Output

    Common first letters from Product names and Customer names:
    C
    A
    G
    N
    M
    I
    Q
    K
    T
    P
    S
    R
    B
    V
    F
    E
    W
    L
    O

### linq52: Except - 1
```csharp
//c#
public void Linq52() 
{ 
    int[] numbersA = { 0, 2, 4, 5, 6, 8, 9 }; 
    int[] numbersB = { 1, 3, 5, 7, 8 }; 
  
    IEnumerable<int> aOnlyNumbers = numbersA.Except(numbersB); 
  
    Console.WriteLine("Numbers in first array but not second array:"); 
    foreach (var n in aOnlyNumbers) 
    { 
        Console.WriteLine(n); 
    } 
}
```
```kotlin
//kotlin
fun linq52() {
    val numbersA = listOf(0, 2, 4, 5, 6, 8, 9)
    val numbersB = listOf(1, 3, 5, 7, 8)

    val aOnlyNumbers = numbersA.difference(numbersB)

    Log.d("Numbers in first array but not second array:")
    aOnlyNumbers.forEach { Log.d(it) }
}
```
#### Output

    Numbers in first array but not second array:
    0
    2
    4
    6
    9

### linq53: Except - 2
```csharp
//c#
public void Linq53() 
{ 
    List<Product> products = GetProductList(); 
    List<Customer> customers = GetCustomerList(); 
  
    var productFirstChars = 
        from p in products 
        select p.ProductName[0]; 
    var customerFirstChars = 
        from c in customers 
        select c.CompanyName[0]; 
  
    var productOnlyFirstChars = productFirstChars.Except(customerFirstChars); 
  
    Console.WriteLine("First letters from Product names, but not from Customer names:"); 
    foreach (var ch in productOnlyFirstChars) 
    { 
        Console.WriteLine(ch); 
    } 
}
```
```kotlin
//kotlin
fun linq53() {
    val productFirstChars = products.map { it.productName[0] }

    val customerFirstChars = customers.map { it.companyName[0] }

    val productOnlyFirstChars = productFirstChars.difference(customerFirstChars)

    Log.d("First letters from Product names, but not from Customer names:")
    productOnlyFirstChars.forEach { Log.d(it) }
}
```
#### Output

    First letters from Product names, but not from Customer names:
    U
    J
    Z


LINQ - Conversion Operators
---------------------------

### linq54: ToArray
```csharp
//c#
public void Linq54() 
{ 
    double[] doubles = { 1.7, 2.3, 1.9, 4.1, 2.9 }; 
  
    var sortedDoubles = 
        from d in doubles 
        orderby d descending 
        select d; 
    var doublesArray = sortedDoubles.ToArray(); 
  
    Console.WriteLine("Every other double from highest to lowest:"); 
    for (int d = 0; d < doublesArray.Length; d += 2) 
    { 
        Console.WriteLine(doublesArray[d]); 
    } 
}
```
```kotlin
//kotlin
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
```
#### Output

    Every other double from highest to lowest:
    4.1
    2.3
    1.7

### linq55: ToList
```csharp
//c#
public void Linq55() 
{ 
    string[] words = { "cherry", "apple", "blueberry" }; 
  
    var sortedWords = 
        from w in words 
        orderby w 
        select w; 
    var wordList = sortedWords.ToList(); 
  
    Console.WriteLine("The sorted word list:"); 
    foreach (var w in wordList) 
    { 
        Console.WriteLine(w); 
    } 
}
```
```kotlin
//kotlin
fun linq55() {
    val words = arrayOf("cherry", "apple", "blueberry")

    val sortedWords = words.sorted()
    val wordList = sortedWords.toList()

    Log.d("The sorted word list:")
    wordList.forEach { Log.d(it) }
}
```
#### Output

    The sorted word list:
    apple
    blueberry
    cherry

### linq56: ToDictionary
```csharp
//c#
public void Linq56() 
{ 
    var scoreRecords = new[] { new {Name = "Alice", Score = 50}, 
                                new {Name = "Bob"  , Score = 40}, 
                                new {Name = "Cathy", Score = 45} 
                            }; 
  
    var scoreRecordsDict = scoreRecords.ToDictionary(sr => sr.Name); 
  
    Console.WriteLine("Bob's score: {0}", scoreRecordsDict["Bob"]); 
}
```
```kotlin
//kotlin
fun linq56() {
    val scoreRecords = listOf(
        Pair("Alice", 50),
        Pair("Bob", 40),
        Pair("Cathy", 45)
    )

    val scoreRecordsDict = scoreRecords.toMap()

    Log.d("Bob's score: ${scoreRecordsDict["Bob"]}")
}
```
#### Output

    Bob's score: 40

### linq57: OfType    
```csharp
//c#
public void Linq57() 
{ 
    object[] numbers = { null, 1.0, "two", 3, "four", 5, "six", 7.0 }; 
  
    var doubles = numbers.OfType<double>(); 
  
    Console.WriteLine("Numbers stored as doubles:"); 
    foreach (var d in doubles) 
    { 
        Console.WriteLine(d); 
    } 
}
```
```kotlin
//kotlin
fun linq57() {
    val numbers = arrayOf(null, 1.0, "two", 3, "four", 5, "six", 7.0)

    val doubles = numbers.filter { it is Double }

    Log.d("Numbers stored as doubles:")
    doubles.forEach { Log.d(it) }
}
```
#### Output

    Numbers stored as doubles:
    1.0
    7.0


LINQ - Element Operators
------------------------

### linq58: First - Simple
```csharp
//c#
public void Linq58() 
{ 
    List<Product> products = GetProductList(); 
 
    Product product12 = ( 
        from p in products 
        where p.ProductID == 12 
        select p) 
        .First(); 
  
    ObjectDumper.Write(product12); 
}
```
```kotlin
//kotlin
fun linq58() {
    val product12 = products.filter { it.productId == 12 }.first()

    Log.d(product12)
}
```
#### Output

    (Product id=12, name=Queso Manchego La Pastora, cat=Dairy Products, price=38.0, inStock=86)

### linq59: First - Condition
```csharp
//c#
public void Linq59() 
{ 
    string[] strings = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" }; 
  
    string startsWithO = strings.First(s => s[0] == 'o'); 
  
    Console.WriteLine("A string starting with 'o': {0}", startsWithO); 
}
```
```kotlin
//kotlin
fun linq59() {
    val strings = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

    val startsWithO = strings.first { it[0] == 'o' }

    Log.d("A string starting with 'o': $startsWithO")
}
```
#### Output

    A string starting with 'o': one

### linq61: FirstOrDefault - Simple
```csharp
//c#
public void Linq61() 
{ 
    int[] numbers = { }; 
  
    int firstNumOrDefault = numbers.FirstOrDefault(); 
  
    Console.WriteLine(firstNumOrDefault); 
}
```
```kotlin
//kotlin
fun linq61() {
    val numbers = intArrayOf()

    val firstNumOrDefault = numbers.firstOrNull() ?: 0

    Log.d(firstNumOrDefault)
}
```
#### Output

    0

### linq62: FirstOrDefault - Condition
```csharp
//c#
public void Linq62() 
{ 
    List<Product> products = GetProductList(); 
  
    Product product789 = products.FirstOrDefault(p => p.ProductID == 789); 
 
    Console.WriteLine("Product 789 exists: {0}", product789 != null); 
}
```
```kotlin
//kotlin
fun linq62() {
    val product789 = products.firstOrNull { it.productId == 789 }

    Log.d("Product 789 exists: ${product789 != null}")
}
```
#### Output

    Product 789 exists: false

### linq64: ElementAt
```csharp
//c#
public void Linq64() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    int fourthLowNum = ( 
        from n in numbers 
        where n > 5 
        select n) 
        .ElementAt(1);  // second number is index 1 because sequences use 0-based indexing 
 
    Console.WriteLine("Second number > 5: {0}", fourthLowNum); 
}
```
```kotlin
//kotlin
fun linq64() {
    val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

    val fourthLowNum = numbers.filter { it > 5 }[1]

    Log.d("Second number > 5: $fourthLowNum")
}
```
#### Output

    Second number > 5: 8


LINQ - Generation Operators
---------------------------

### linq65: Range
```csharp
//c#
public void Linq65() 
{ 
    var numbers = 
        from n in Enumerable.Range(100, 50) 
  
        select new { Number = n, OddEven = n % 2 == 1 ? "odd" : "even" }; 
  
    foreach (var n in numbers) 
    { 
        Console.WriteLine("The number {0} is {1}.", n.Number, n.OddEven); 
    } 
}
```
```kotlin
//kotlin
fun linq65() {
    val numbers = (100..150).map { n -> Pair(n, if (n % 2 == 1) "odd" else "even") }

    numbers.forEach { Log.d("The number ${it.first} is ${it.second}") }
}
```
#### Output

    The number 100 is even
    The number 101 is odd
    The number 102 is even
    The number 103 is odd
    The number 104 is even
    The number 105 is odd
    The number 106 is even
    The number 107 is odd
    The number 108 is even
    The number 109 is odd
    The number 110 is even
    ...

### linq66: Repeat
```csharp
//c#
public void Linq66() 
{ 
    var numbers = Enumerable.Repeat(7, 10); 
  
    foreach (var n in numbers) 
    {  
        Console.WriteLine(n); 
    } 
}
```
```kotlin
//kotlin
fun linq66() {
    val numbers = "7".repeat(10)

    numbers.forEach { Log.d(it) }
}
```
#### Output

    7
    7
    7
    7
    7
    7
    7
    7
    7
    7


LINQ - Quantifiers
------------------

### linq67: Any - Simple
```csharp
//c#
public void Linq67() 
{ 
    string[] words = { "believe", "relief", "receipt", "field" }; 
  
    bool iAfterE = words.Any(w => w.Contains("ei")); 
 
    Console.WriteLine("There is a word that contains in the list that contains 'ei': {0}", iAfterE); 
}
```
```kotlin
//kotlin
fun linq67() {
    val words = arrayOf("believe", "relief", "receipt", "field")

    val iAfterE = words.any { it.contains("ei") }

    Log.d("There is a word that contains in the list that contains 'ei': $iAfterE")
}
```
#### Output

    There is a word that contains in the list that contains 'ei': true

### linq69: Any - Grouped
```csharp
//c#
public void Linq69() 
{ 
    List<Product> products = GetProductList(); 
    var productGroups = 
        from p in products 
        group p by p.Category into g 
        where g.Any(p => p.UnitsInStock == 0) 
        select new { Category = g.Key, Products = g }; 
 
    ObjectDumper.Write(productGroups, 1);  
}
```
```kotlin
//kotlin
fun linq69() {
    val productGroups = products
        .groupBy { it.category }
        .filter { it.value.any { it.unitsInStock == 0 } }
        .map { Pair(it.key, it) }

    productGroups.forEach { Log.d(it.second) }
}
```
#### Output

    Condiments=[(Product id=3, name=Aniseed Syrup, cat=Condiments, price=10.0, inStock=13), (Product id=4, name=Chef Anton's Cajun Seasoning, cat=Condiments, price=22.0, inStock=53), (Product id=5, name=Chef Anton's Gumbo Mix, cat=Condiments, price=21.35, inStock=0), (Product id=6, name=Grandma's Boysenberry Spread, cat=Condiments, price=25.0, inStock=120), (Product id=8, name=Northwoods Cranberry Sauce, cat=Condiments, price=40.0, inStock=6), (Product id=15, name=Genen Shouyu, cat=Condiments, price=15.5, inStock=39), (Product id=44, name=Gula Malacca, cat=Condiments, price=19.45, inStock=27), (Product id=61, name=Sirop d'érable, cat=Condiments, price=28.5, inStock=113), (Product id=63, name=Vegie-spread, cat=Condiments, price=43.9, inStock=24), (Product id=65, name=Louisiana Fiery Hot Pepper Sauce, cat=Condiments, price=21.05, inStock=76), (Product id=66, name=Louisiana Hot Spiced Okra, cat=Condiments, price=17.0, inStock=4), (Product id=77, name=Original Frankfurter grüne Soße, cat=Condiments, price=13.0, inStock=32)]
    Meat/Poultry=[(Product id=9, name=Mishi Kobe Niku, cat=Meat/Poultry, price=97.0, inStock=29), (Product id=17, name=Alice Mutton, cat=Meat/Poultry, price=39.0, inStock=0), (Product id=29, name=Thüringer Rostbratwurst, cat=Meat/Poultry, price=123.79, inStock=0), (Product id=53, name=Perth Pasties, cat=Meat/Poultry, price=32.8, inStock=0), (Product id=54, name=Tourtière, cat=Meat/Poultry, price=7.45, inStock=21), (Product id=55, name=Pâté chinois, cat=Meat/Poultry, price=24.0, inStock=115)]
    Dairy Products=[(Product id=11, name=Queso Cabrales, cat=Dairy Products, price=21.0, inStock=22), (Product id=12, name=Queso Manchego La Pastora, cat=Dairy Products, price=38.0, inStock=86), (Product id=31, name=Gorgonzola Telino, cat=Dairy Products, price=12.5, inStock=0), (Product id=32, name=Mascarpone Fabioli, cat=Dairy Products, price=32.0, inStock=9), (Product id=33, name=Geitost, cat=Dairy Products, price=2.5, inStock=112), (Product id=59, name=Raclette Courdavault, cat=Dairy Products, price=55.0, inStock=79), (Product id=60, name=Camembert Pierrot, cat=Dairy Products, price=34.0, inStock=19), (Product id=69, name=Gudbrandsdalsost, cat=Dairy Products, price=36.0, inStock=26), (Product id=71, name=Flotemysost, cat=Dairy Products, price=21.5, inStock=26), (Product id=72, name=Mozzarella di Giovanni, cat=Dairy Products, price=34.8, inStock=14)]
    ...

### linq70: All - Simple
```csharp
//c#
public void Linq70() 
{  
    int[] numbers = { 1, 11, 3, 19, 41, 65, 19 }; 
  
    bool onlyOdd = numbers.All(n => n % 2 == 1); 
  
    Console.WriteLine("The list contains only odd numbers: {0}", onlyOdd); 
}
```
```kotlin
//kotlin
fun linq70() {
    val numbers = intArrayOf(1, 11, 3, 19, 41, 65, 19)

    val onlyOdd = numbers.all { it % 2 == 1 }

    Log.d("The list contains only odd numbers: $onlyOdd")
}
```
#### Output

    The list contains only odd numbers: true

### linq72: All - Grouped    
```csharp
//c#
public void Linq72() 
{ 
    List<Product> products = GetProductList(); 
  
    var productGroups = 
        from p in products 
        group p by p.Category into g 
        where g.All(p => p.UnitsInStock > 0) 
        select new { Category = g.Key, Products = g }; 
     
    ObjectDumper.Write(productGroups, 1); 
}
```
```kotlin
//kotlin
fun linq72() {
    val productGroups = products
        .groupBy { it.category }
        .filter { it.value.all { it.unitsInStock > 0 } }
        .map { Pair(it.key, it) }

    productGroups.forEach { Log.d(it.second) }
}
```
#### Output

    Beverages=[(Product id=1, name=Chai, cat=Beverages, price=18.0, inStock=39), (Product id=2, name=Chang, cat=Beverages, price=19.0, inStock=17), (Product id=24, name=Guaraná Fantástica, cat=Beverages, price=4.5, inStock=20), (Product id=34, name=Sasquatch Ale, cat=Beverages, price=14.0, inStock=111), (Product id=35, name=Steeleye Stout, cat=Beverages, price=18.0, inStock=20), (Product id=38, name=Côte de Blaye, cat=Beverages, price=263.5, inStock=17), (Product id=39, name=Chartreuse verte, cat=Beverages, price=18.0, inStock=69), (Product id=43, name=Ipoh Coffee, cat=Beverages, price=46.0, inStock=17), (Product id=67, name=Laughing Lumberjack Lager, cat=Beverages, price=14.0, inStock=52), (Product id=70, name=Outback Lager, cat=Beverages, price=15.0, inStock=15), (Product id=75, name=Rhönbräu Klosterbier, cat=Beverages, price=7.75, inStock=125), (Product id=76, name=Lakkalikööri, cat=Beverages, price=18.0, inStock=57)]
    ...


LINQ - Aggregate Operators
--------------------------

### linq73: Count - Simple
```csharp
//c#
public void Linq73() 
{ 
    int[] factorsOf300 = { 2, 2, 3, 5, 5 }; 
  
    int uniqueFactors = factorsOf300.Distinct().Count(); 
  
    Console.WriteLine("There are {0} unique factors of 300.", uniqueFactors); 
}
```
```kotlin
//kotlin
fun linq73() {
    val factorsOf300 = intArrayOf(2, 2, 3, 5, 5)

    val uniqueFactors = factorsOf300.distinct().size

    Log.d("There are $uniqueFactors unique factors of 300.")
}
```
#### Output

    There are 3 unique factors of 300.

### linq74: Count - Conditional
```csharp
//c#
public void Linq74() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    int oddNumbers = numbers.Count(n => n % 2 == 1); 
  
    Console.WriteLine("There are {0} odd numbers in the list.", oddNumbers); 
}
```
```kotlin
//kotlin
fun linq74() {
    val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

    val oddNumbers = numbers.count { it % 2 == 1 }

    Log.d("There are $oddNumbers odd numbers in the list.")
}
```
#### Output

    There are 5 odd numbers in the list.

### linq76: Count - Nested
```csharp
//c#
public void Linq76() 
{ 
    List<Customer> customers = GetCustomerList(); 
  
    var orderCounts = 
        from c in customers 
        select new { c.CustomerID, OrderCount = c.Orders.Count() }; 
  
    ObjectDumper.Write(orderCounts); 
}
```
```kotlin
//kotlin
fun linq76() {
    val orderCounts = customers.map { Pair(it.customerId, it.orders.size) }

    orderCounts.forEach { Log.d(it) }
}
```
#### Output

    (ALFKI, 6)
    (ANATR, 4)
    (ANTON, 7)
    (AROUT, 13)
    (BERGS, 18)
    (BLAUS, 7)
    (BLONP, 11)
    ...

### linq77: Count - Grouped
```csharp
//c#
public void Linq77() 
{ 
    List<Product> products = GetProductList(); 
  
    var categoryCounts = 
        from p in products 
        group p by p.Category into g 
        select new { Category = g.Key, ProductCount = g.Count() }; 
  
    ObjectDumper.Write(categoryCounts 
}
```
```kotlin
//kotlin
fun linq77() {
    val categoryCounts = products.groupBy { it.category }
        .map { Pair(it.key, it.value.size) }

    categoryCounts.forEach { Log.d(it) }
}
```
#### Output

    (Beverages, 12)
    (Condiments, 12)
    (Produce, 5)
    (Meat/Poultry, 6)
    (Seafood, 12)
    (Dairy Products, 10)
    (Confections, 13)
    (Grains/Cereals, 7)

### linq78: Sum - Simple
```csharp
//c#
public void Linq78() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    double numSum = numbers.Sum(); 
  
    Console.WriteLine("The sum of the numbers is {0}.", numSum); 
}
```
```kotlin
//kotlin
fun linq78() {
    val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

    val numSum = numbers.sum().toDouble()

    Log.d("The sum of the numbers is $numSum")
}
```
#### Output

    The sum of the numbers is 45.0

### linq79: Sum - Projection
```csharp
//c#
public void Linq79() 
{ 
    string[] words = { "cherry", "apple", "blueberry" }; 
  
    double totalChars = words.Sum(w => w.Length); 
  
    Console.WriteLine("There are a total of {0} characters in these words.", totalChars); 
}
```
```kotlin
//kotlin
fun linq79() {
    val words = arrayOf("cherry", "apple", "blueberry")

    val totalChars = words.sumBy { it.length }

    Log.d("There are a total of $totalChars characters in these words.")
}
```
#### Output

    There are a total of 20 characters in these words.

### linq80: Sum - Grouped
```csharp
//c#
public void Linq80() 
{ 
    List<Product> products = GetProductList(); 
  
    var categories = 
        from p in products 
        group p by p.Category into g 
        select new { Category = g.Key, TotalUnitsInStock = g.Sum(p => p.UnitsInStock) }; 
  
    ObjectDumper.Write(categories); 
}
```
```kotlin
//kotlin
fun linq80() {
    val categories = products.groupBy { it.category }
        .map { Pair(it.key, it.value.sumBy { it.unitsInStock }) }

    categories.forEach { Log.d(it) }
}
```
#### Output

    (Beverages, 559)
    (Condiments, 507)
    (Produce, 100)
    (Meat/Poultry, 165)
    (Seafood, 701)
    (Dairy Products, 393)
    (Confections, 386)
    (Grains/Cereals, 308)

### linq81: Min - Simple
```csharp
//c#
public void Linq81() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    int minNum = numbers.Min(); 
  
    Console.WriteLine("The minimum number is {0}.", minNum); 
}
```
```kotlin
//kotlin
fun linq81() {
    val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

    val minNum = numbers.min()

    Log.d("The minimum number is $minNum")
}
```
#### Output

    The minimum number is 0

### linq82: Min - Projection
```csharp
//c#
public void Linq82() 
{ 
    string[] words = { "cherry", "apple", "blueberry" }; 
  
    int shortestWord = words.Min(w => w.Length); 
  
    Console.WriteLine("The shortest word is {0} characters long.", shortestWord); 
}
```
```kotlin
//kotlin
fun linq82() {
    val words = arrayOf("cherry", "apple", "blueberry")

    val shortestWord = words.minBy { it.length }?.length

    Log.d("The shortest word is $shortestWord characters long.")
}
```
#### Output

    The shortest word is 5 characters long.

### linq83: Min - Grouped
```csharp
//c#
public void Linq83() 
{ 
    List<Product> products = GetProductList(); 
  
    var categories = 
        from p in products 
        group p by p.Category into g 
        select new { Category = g.Key, CheapestPrice = g.Min(p => p.UnitPrice) }; 
  
    ObjectDumper.Write(categories); 
}
```
```kotlin
//kotlin
fun linq83() {
    val categories = products.groupBy { it.category }
        .map { Pair(it.key, it.value.minBy { it.unitPrice }?.unitPrice) }

    categories.forEach { Log.d(it) }
}
```
#### Output

    (Beverages, 4.5)
    (Condiments, 10.0)
    (Produce, 10.0)
    (Meat/Poultry, 7.45)
    (Seafood, 6.0)
    (Dairy Products, 2.5)
    (Confections, 9.2)
    (Grains/Cereals, 7.0)

### linq84: Min - Elements
```csharp
//c#
public void Linq84() 
{ 
    List<Product> products = GetProductList(); 
  
    var categories = 
        from p in products 
        group p by p.Category into g 
        let minPrice = g.Min(p => p.UnitPrice) 
        select new { Category = g.Key, CheapestProducts = g.Where(p => p.UnitPrice == minPrice) }; 
  
    ObjectDumper.Write(categories, 1); 
}
```
```kotlin
//kotlin
fun linq84() {
    val categories = products.groupBy { it.category }
        .map {
            val minPrice = it.value.minBy { it.unitPrice }!!.unitPrice
            Pair(it.key, it.value.filter { p -> p.unitPrice == minPrice })
        }

    categories.forEach {
        val (category,cheapestProducts) = it
        Log.d(category + ": ")
        cheapestProducts.forEach { Log.d(it) }
    }
}
```
#### Output

    Beverages: 
    (Product id=24, name=Guaraná Fantástica, cat=Beverages, price=4.5, inStock=20)
    Condiments: 
    (Product id=3, name=Aniseed Syrup, cat=Condiments, price=10.0, inStock=13)
    Produce: 
    (Product id=74, name=Longlife Tofu, cat=Produce, price=10.0, inStock=4)
    Meat/Poultry: 
    (Product id=54, name=Tourtière, cat=Meat/Poultry, price=7.45, inStock=21)
    Seafood: 
    (Product id=13, name=Konbu, cat=Seafood, price=6.0, inStock=24)
    Dairy Products: 
    (Product id=33, name=Geitost, cat=Dairy Products, price=2.5, inStock=112)
    Confections: 
    (Product id=19, name=Teatime Chocolate Biscuits, cat=Confections, price=9.2, inStock=25)
    Grains/Cereals: 
    (Product id=52, name=Filo Mix, cat=Grains/Cereals, price=7.0, inStock=38)

### linq85: Max - Simple
```csharp
//c#
public void Linq85() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    int maxNum = numbers.Max(); 
  
    Console.WriteLine("The maximum number is {0}.", maxNum); 
}
```
```kotlin
//kotlin
fun linq85() {
    val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

    val maxNum = numbers.max()

    Log.d("The maximum number is $maxNum")
}
```
#### Output

    The maximum number is 9

### linq86: Max - Projection
```csharp
//c#
public void Linq86() 
{ 
    string[] words = { "cherry", "apple", "blueberry" }; 
  
    int longestLength = words.Max(w => w.Length); 
  
    Console.WriteLine("The longest word is {0} characters long.", longestLength); 
}
```
```kotlin
//kotlin
fun linq86() {
    val words = arrayOf("cherry", "apple", "blueberry")

    val longestLength = words.maxBy { it.length }?.length

    Log.d("The longest word is $longestLength characters long.")
}
```
#### Output

    The longest word is 9 characters long.

### linq87: Max - Grouped
```csharp
//c#
public void Linq87() 
{ 
    List<Product> products = GetProductList(); 
  
    var categories = 
        from p in products 
        group p by p.Category into g 
        select new { Category = g.Key, MostExpensivePrice = g.Max(p => p.UnitPrice) }; 
  
    ObjectDumper.Write(categories); 
}
```
```kotlin
//kotlin
fun linq87() {
    val categories = products.groupBy { it.category }
        .map { Pair(it.key, it.value.maxBy { it.unitPrice }?.unitPrice) }

    categories.forEach { Log.d(it) }
}
```
#### Output

    (Beverages, 263.5)
    (Condiments, 43.9)
    (Produce, 53.0)
    (Meat/Poultry, 123.79)
    (Seafood, 62.5)
    (Dairy Products, 55.0)
    (Confections, 81.0)
    (Grains/Cereals, 38.0)

### linq88: Max - Elements
```csharp
//c#
public void Linq88() 
{ 
    List<Product> products = GetProductList(); 
  
    var categories = 
        from p in products 
        group p by p.Category into g 
        let maxPrice = g.Max(p => p.UnitPrice) 
        select new { Category = g.Key, MostExpensiveProducts = g.Where(p => p.UnitPrice == maxPrice) }; 
  
    ObjectDumper.Write(categories, 1); 
}
```
```kotlin
//kotlin
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
```
#### Output

    Beverages: 
    (Product id=38, name=Côte de Blaye, cat=Beverages, price=263.5, inStock=17)
    Condiments: 
    (Product id=63, name=Vegie-spread, cat=Condiments, price=43.9, inStock=24)
    Produce: 
    (Product id=51, name=Manjimup Dried Apples, cat=Produce, price=53.0, inStock=20)
    Meat/Poultry: 
    (Product id=29, name=Thüringer Rostbratwurst, cat=Meat/Poultry, price=123.79, inStock=0)
    Seafood: 
    (Product id=18, name=Carnarvon Tigers, cat=Seafood, price=62.5, inStock=42)
    Dairy Products: 
    (Product id=59, name=Raclette Courdavault, cat=Dairy Products, price=55.0, inStock=79)
    Confections: 
    (Product id=20, name=Sir Rodney's Marmalade, cat=Confections, price=81.0, inStock=40)
    Grains/Cereals: 
    (Product id=56, name=Gnocchi di nonna Alice, cat=Grains/Cereals, price=38.0, inStock=21)

### linq89: Average - Simple
```csharp
//c#
public void Linq89() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    double averageNum = numbers.Average(); 
  
    Console.WriteLine("The average number is {0}.", averageNum); 
}
```
```kotlin
//kotlin
fun linq89() {
    val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

    val averageNum = numbers.average()

    Log.d("The average number is $averageNum")
}
```
#### Output

    The average number is 4.5

### linq90: Average - Projection
```csharp
//c#
public void Linq90() 
{ 
    string[] words = { "cherry", "apple", "blueberry" }; 
  
    double averageLength = words.Average(w => w.Length); 
  
    Console.WriteLine("The average word length is {0} characters.", averageLength); 
}
```
```kotlin
//kotlin
fun linq90() {
    val words = arrayOf("cherry", "apple", "blueberry")

    val averageLength = words.map { it.length }.average()

    Log.d("The average word length is $averageLength characters.")
}
```
#### Output

    The average word length is 6.666666666666667 characters.

### linq91: Average - Grouped
```csharp
//c#
public void Linq91() 
{ 
    List<Product> products = GetProductList(); 
  
    var categories = 
        from p in products 
        group p by p.Category into g 
        select new { Category = g.Key, AveragePrice = g.Average(p => p.UnitPrice) }; 
  
    ObjectDumper.Write(categories); 
}
```
```kotlin
//kotlin
fun linq91() {
    val categories = products.groupBy { it.category }
        .map { Pair(it.key, it.value.map{it.unitPrice }.average() ) }

    categories.forEach { Log.d("Category: ${it.first}, AveragePrice: ${it.second}") }
}
```
#### Output

    Category: Beverages, AveragePrice: 37.979166666666664
    Category: Condiments, AveragePrice: 23.0625
    Category: Produce, AveragePrice: 32.37
    Category: Meat/Poultry, AveragePrice: 54.00666666666667
    Category: Seafood, AveragePrice: 20.6825
    Category: Dairy Products, AveragePrice: 28.73
    Category: Confections, AveragePrice: 25.16
    Category: Grains/Cereals, AveragePrice: 20.25

### linq92: Aggregate - Simple
```csharp
//c#
public void Linq92() 
{ 
    double[] doubles = { 1.7, 2.3, 1.9, 4.1, 2.9 }; 
  
    double product = doubles.Aggregate((runningProduct, nextFactor) => runningProduct * nextFactor); 
  
    Console.WriteLine("Total product of all numbers: {0}", product); 
}
```
```kotlin
//kotlin
fun linq92() {
    val doubles = doubleArrayOf(1.7, 2.3, 1.9, 4.1, 2.9)

    val product = doubles.reduce { runningProduct, nextFactor -> runningProduct * nextFactor }

    Log.d("Total product of all numbers: $product")
}
```
#### Output

    Total product of all numbers: 88.33080999999999

### linq93: Aggregate - Seed
```csharp
//c#
public void Linq93() 
{ 
    double startBalance = 100.0; 
  
    int[] attemptedWithdrawals = { 20, 10, 40, 50, 10, 70, 30 }; 
  
    double endBalance = 
        attemptedWithdrawals.Aggregate(startBalance, 
            (balance, nextWithdrawal) => 
                ((nextWithdrawal <= balance) ? (balance - nextWithdrawal) : balance)); 
  
    Console.WriteLine("Ending balance: {0}", endBalance); 
}
```
```kotlin
//kotlin
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
```
#### Output

    Ending balance: 20


LINQ - Miscellaneous Operators
------------------------------

### linq94: Concat - 1
```csharp
//c#
public void Linq94() 
{ 
    int[] numbersA = { 0, 2, 4, 5, 6, 8, 9 }; 
    int[] numbersB = { 1, 3, 5, 7, 8 }; 
  
    var allNumbers = numbersA.Concat(numbersB); 
  
    Console.WriteLine("All numbers from both arrays:"); 
    foreach (var n in allNumbers) 
    { 
        Console.WriteLine(n); 
    } 
}
```
```kotlin
//kotlin
fun linq94() {
    val numbersA = intArrayOf(0, 2, 4, 5, 6, 8, 9)
    val numbersB = intArrayOf(1, 3, 5, 7, 8)

    val allNumbers = numbersA + numbersB

    Log.d("All numbers from both arrays:")
    allNumbers.forEach { Log.d(it) }
}
```
#### Output

    All numbers from both arrays:
    0
    2
    4
    5
    6
    8
    9
    1
    3
    5
    7
    8

### linq95: Concat - 2
```csharp
//c#
public void Linq95() 
{ 
    List<Customer> customers = GetCustomerList(); 
    List<Product> products = GetProductList(); 
  
    var customerNames = 
        from c in customers 
        select c.CompanyName; 
    var productNames = 
        from p in products 
        select p.ProductName; 
  
    var allNames = customerNames.Concat(productNames); 
  
    Console.WriteLine("Customer and product names:"); 
    foreach (var n in allNames) 
    { 
        Console.WriteLine(n); 
    } 
}
```
```kotlin
//kotlin
fun linq95() {
    val customerNames = customers.map { it.companyName }

    val productNames = products.map { it.productName }

    val allNames = customerNames + productNames

    Log.d("Customer and product names:")
    allNames.forEach { Log.d(it) }
}
```
#### Output

    Customer and product names:
    Alfreds Futterkiste
    Ana Trujillo Emparedados y helados
    Antonio Moreno Taquería
    Around the Horn
    Berglunds snabbköp
    Blauer See Delikatessen
    ...

### linq96: EqualAll - 1
```csharp
//c#
public void Linq96() 
{ 
    var wordsA = new string[] { "cherry", "apple", "blueberry" }; 
    var wordsB = new string[] { "cherry", "apple", "blueberry" }; 
  
    bool match = wordsA.SequenceEqual(wordsB); 
  
    Console.WriteLine("The sequences match: {0}", match); 
}
```
```kotlin
//kotlin
fun linq96() {
    val wordsA = arrayOf("cherry", "apple", "blueberry")
    val wordsB = arrayOf("cherry", "apple", "blueberry")

    val match = Arrays.equals(wordsA, wordsB)

    Log.d("The sequences match: $match")
}
```
#### Output

    The sequences match: true

### linq97: EqualAll - 2
```csharp
//c#
public void Linq97() 
{ 
    var wordsA = new string[] { "cherry", "apple", "blueberry" }; 
    var wordsB = new string[] { "apple", "blueberry", "cherry" }; 
  
    bool match = wordsA.SequenceEqual(wordsB); 
  
    Console.WriteLine("The sequences match: {0}", match); 
}
```
```kotlin
//kotlin
fun linq97() {
    val wordsA = arrayOf("cherry", "apple", "blueberry")
    val wordsB = arrayOf("cherry", "blueberry", "cherry")

    val match = Arrays.equals(wordsA, wordsB)

    Log.d("The sequences match: $match")
}
```
#### Output

    The sequences match: false

LINQ - Query Execution
----------------------

### linq99: Deferred Execution
```csharp
//c#
public void Linq99() 
{ 
    // Sequence operators form first-class queries that 
    // are not executed until you enumerate over them. 
  
    int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    int i = 0; 
    var q = 
        from n in numbers 
        select ++i; 
  
    // Note, the local variable 'i' is not incremented 
    // until each element is evaluated (as a side-effect): 
    foreach (var v in q) 
    { 
        Console.WriteLine("v = {0}, i = {1}", v, i); 
    } 
}
```
```kotlin
//kotlin
fun linq099() {
    val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

    var i = 0
    val q = numbers.map { { ++i } }

    for (f in q) {
        val v = f()
        Log.d("v = $v, i = $i")
    }
}
```
#### Output

    v = 1, i = 1
    v = 2, i = 2
    v = 3, i = 3
    v = 4, i = 4
    v = 5, i = 5
    v = 6, i = 6
    v = 7, i = 7
    v = 8, i = 8
    v = 9, i = 9
    v = 10, i = 10

### linq100: Immediate Execution
```csharp
//c#
public void Linq100() 
{ 
    // Methods like ToList() cause the query to be 
    // executed immediately, caching the results. 
  
    int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    int i = 0; 
    var q = ( 
        from n in numbers 
        select ++i) 
        .ToList(); 
  
    // The local variable i has already been fully 
    // incremented before we iterate the results: 
    foreach (var v in q) 
    { 
        Console.WriteLine("v = {0}, i = {1}", v, i); 
    } 
} 
```
```kotlin
//kotlin
fun linq100() {
    val numbers = intArrayOf(5, 4, 1, 3, 9, 8, 6, 7, 2, 0)

    var i = 0
    val q = numbers.map { ++i }

    q.forEach { v -> Log.d("v = $v, i = $i") }
}
```
#### Output

    v = 1, i = 10
    v = 2, i = 10
    v = 3, i = 10
    v = 4, i = 10
    v = 5, i = 10
    v = 6, i = 10
    v = 7, i = 10
    v = 8, i = 10
    v = 9, i = 10
    v = 10, i = 10

### linq101: Query Reuse
```csharp
//c#
public void Linq101() 
{ 
    // Deferred execution lets us define a query once 
    // and then reuse it later after data changes. 
  
    int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
    var lowNumbers = 
        from n in numbers 
        where n <= 3 
        select n; 
  
    Console.WriteLine("First run numbers <= 3:"); 
    foreach (int n in lowNumbers) 
    { 
        Console.WriteLine(n); 
    } 
  
    for (int i = 0; i < 10; i++) 
    { 
        numbers[i] = -numbers[i]; 
    } 
  
    // During this second run, the same query object, 
    // lowNumbers, will be iterating over the new state 
    // of numbers[], producing different results: 
    Console.WriteLine("Second run numbers <= 3:"); 
    foreach (int n in lowNumbers) 
    { 
        Console.WriteLine(n); 
    } 
} 
```
```kotlin
//kotlin
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
```
#### Output

    First run numbers <= 3:
    1
    3
    2
    0
    Second run numbers <= 3:
    -5
    -4
    -1
    -3
    -9
    -8
    -6
    -7
    -2
    0


LINQ - Join Operators
---------------------

### linq102: Cross Join
```csharp
//c#
public void Linq102() 
{ 
    string[] categories = new string[]{  
        "Beverages",   
        "Condiments",   
        "Vegetables",   
        "Dairy Products",   
        "Seafood" };  
  
    List<Product> products = GetProductList(); 
  
    var q = 
        from c in categories 
        join p in products on c equals p.Category 
        select new { Category = c, p.ProductName }; 
 
    foreach (var v in q) 
    { 
        Console.WriteLine(v.ProductName + ": " + v.Category);  
    } 
}
```
```kotlin
//kotlin
fun linq102() {
    val categories = listOf("Beverages", "Condiments", "Vegetables", "Dairy Products", "Seafood")

    val q = join(categories, products) { c, p -> c == p.category }
            .map { Pair(it.A, it.B.productName) }

    q.forEach { Log.d("${it.first}: ${it.second}") }
}
```
#### Output

    Beverages: Chai
    Beverages: Chang
    Beverages: Guaraná Fantástica
    Beverages: Sasquatch Ale
    Beverages: Steeleye Stout
    Beverages: Côte de Blaye
    Beverages: Chartreuse verte
    Beverages: Ipoh Coffee
    ...

### linq103: Group Join
```csharp
//c#
public void Linq103() 
{ 
    string[] categories = new string[]{  
        "Beverages",  
        "Condiments",  
        "Vegetables",  
        "Dairy Products",  
        "Seafood" }; 
  
    List<Product> products = GetProductList(); 
  
    var q = 
        from c in categories 
        join p in products on c equals p.Category into ps 
        select new { Category = c, Products = ps }; 
  
    foreach (var v in q) 
    { 
        Console.WriteLine(v.Category + ":"); 
        foreach (var p in v.Products) 
        { 
            Console.WriteLine("   " + p.ProductName); 
        } 
    } 
}
```
```kotlin
//kotlin
fun linq103() {
    val categories = listOf("Beverages", "Condiments", "Vegetables", "Dairy Products", "Seafood")

    val q = joinGroup(categories, products) { c, p -> c == p.category }
        .map { Pair(it.key, it.items.map { it.B }) }

    q.forEach {
        Log.d("${it.first}:")
        it.second.forEach { p -> Log.d("   ${p.productName}") }
    }
}
```
#### Output

    Beverages:
       Chai
       Chang
       Guaraná Fantástica
       Sasquatch Ale
       Steeleye Stout
       Côte de Blaye
       Chartreuse verte
       Ipoh Coffee
       Laughing Lumberjack Lager
       Outback Lager
       Rhönbräu Klosterbier
       Lakkalikööri
    Seafood:
       Ikura
       Konbu
       Carnarvon Tigers
       Nord-Ost Matjeshering
       Inlagd Sill
       Gravad lax
       Boston Crab Meat
       Jack's New England Clam Chowder
       Rogede sild
       Spegesild
       Escargots de Bourgogne
       Röd Kaviar
    ...

### linq104: Cross Join with Group Join
```csharp
//c#
public void Linq104() 
{ 
    string[] categories = new string[]{   
        "Beverages",  
        "Condiments",  
        "Vegetables", 
        "Dairy Products",   
        "Seafood" }; 
  
    List<Product> products = GetProductList(); 
  
    var q = 
        from c in categories 
        join p in products on c equals p.Category into ps 
        from p in ps 
        select new { Category = c, p.ProductName }; 
  
    foreach (var v in q) 
    { 
        Console.WriteLine(v.ProductName + ": " + v.Category); 
    } 
}
```
```kotlin
//kotlin
fun linq104() {
    val categories = listOf("Beverages", "Condiments", "Vegetables", "Dairy Products", "Seafood")

    val q = joinGroup(categories, products) { c, p -> c == p.category }
        .flatMap { j -> j.items.map { it.B }.map {  Pair(j.key, it.productName) } }

    q.forEach { Log.d("${it.second}: ${it.first}") }
}
```
#### Output

    Chai: Beverages
    Chang: Beverages
    Guaraná Fantástica: Beverages
    Sasquatch Ale: Beverages
    Steeleye Stout: Beverages
    Côte de Blaye: Beverages
    Chartreuse verte: Beverages
    Ipoh Coffee: Beverages
    Laughing Lumberjack Lager: Beverages
    Outback Lager: Beverages
    Rhönbräu Klosterbier: Beverages
    Lakkalikööri: Beverages
    Ikura: Seafood
    Konbu: Seafood
    Carnarvon Tigers: Seafood
    ...

### linq105: Left Outer Join
```csharp
//c#
public void Linq105()  
{ 
    string[] categories = new string[]{   
        "Beverages",  
        "Condiments",   
        "Vegetables",   
        "Dairy Products",  
        "Seafood" }; 
  
    List<Product> products = GetProductList(); 
  
    var q = 
        from c in categories 
        join p in products on c equals p.Category into ps 
        from p in ps.DefaultIfEmpty() 
        select new { Category = c, ProductName = p == null ? "(No products)" : p.ProductName }; 
  
    foreach (var v in q) 
    { 
        Console.WriteLine(v.ProductName + ": " + v.Category); 
    } 
}
```
```kotlin
//kotlin
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
```
#### Output

    Chai: Beverages
    Chang: Beverages
    Guaraná Fantástica: Beverages
    Sasquatch Ale: Beverages
    Steeleye Stout: Beverages
    Côte de Blaye: Beverages
    Chartreuse verte: Beverages
    Ipoh Coffee: Beverages
    Laughing Lumberjack Lager: Beverages
    Outback Lager: Beverages
    Rhönbräu Klosterbier: Beverages
    Lakkalikööri: Beverages
    Aniseed Syrup: Condiments
    Chef Anton's Cajun Seasoning: Condiments
    Chef Anton's Gumbo Mix: Condiments
    Grandma's Boysenberry Spread: Condiments
    Northwoods Cranberry Sauce: Condiments
    Genen Shouyu: Condiments
    Gula Malacca: Condiments
    Sirop d'érable: Condiments
    Vegie-spread: Condiments
    Louisiana Fiery Hot Pepper Sauce: Condiments
    Louisiana Hot Spiced Okra: Condiments
    Original Frankfurter grüne Soße: Condiments
    (No products): Vegetables
    ...


### Contributors

  - [mythz](https://github.com/mythz) (Demis Bellot)

