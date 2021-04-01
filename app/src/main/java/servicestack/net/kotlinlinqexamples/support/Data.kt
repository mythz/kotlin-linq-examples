package servicestack.net.kotlinlinqexamples.support

import android.content.res.Resources
import com.google.gson.GsonBuilder
import com.google.gson.JsonDeserializer
import net.servicestack.func.Func.toList
import servicestack.net.kotlinlinqexamples.R
import java.io.BufferedReader
import java.io.InputStreamReader
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

val products: List<Product> by lazy {
    listOf(
        Product(1, "Chai", "Beverages", 18.000, 39),
        Product(2, "Chang", "Beverages", 19.000, 17),
        Product(3, "Aniseed Syrup", "Condiments", 10.000, 13),
        Product(4, "Chef Anton's Cajun Seasoning", "Condiments", 22.000, 53),
        Product(5, "Chef Anton's Gumbo Mix", "Condiments", 21.350, 0),
        Product(6, "Grandma's Boysenberry Spread", "Condiments", 25.000, 120),
        Product(7, "Uncle Bob's Organic Dried Pears", "Produce", 30.000, 15),
        Product(8, "Northwoods Cranberry Sauce", "Condiments", 40.000, 6),
        Product(9, "Mishi Kobe Niku", "Meat/Poultry", 97.000, 29),
        Product(10, "Ikura", "Seafood", 31.000, 31),
        Product(11, "Queso Cabrales", "Dairy Products", 21.000, 22),
        Product(12, "Queso Manchego La Pastora", "Dairy Products", 38.000, 86),
        Product(13, "Konbu", "Seafood", 6.000, 24),
        Product(14, "Tofu", "Produce", 23.250, 35),
        Product(15, "Genen Shouyu", "Condiments", 15.500, 39),
        Product(16, "Pavlova", "Confections", 17.450, 29),
        Product(17, "Alice Mutton", "Meat/Poultry", 39.000, 0),
        Product(18, "Carnarvon Tigers", "Seafood", 62.500, 42),
        Product(19, "Teatime Chocolate Biscuits", "Confections", 9.200, 25),
        Product(20, "Sir Rodney's Marmalade", "Confections", 81.000, 40),
        Product(21, "Sir Rodney's Scones", "Confections", 10.000, 3),
        Product(22, "Gustaf's Kn\u00e4ckebr\u00f6d", "Grains/Cereals", 21.000, 104),
        Product(23, "Tunnbr\u00f6d", "Grains/Cereals", 9.000, 61),
        Product(24, "Guaran\u00e1 Fant\u00e1stica", "Beverages", 4.500, 20),
        Product(25, "NuNuCa Nu\u00df-Nougat-Creme", "Confections", 14.000, 76),
        Product(26, "Gumb\u00e4r Gummib\u00e4rchen", "Confections", 31.230, 15),
        Product(27, "Schoggi Schokolade", "Confections", 43.900, 49),
        Product(28, "R\u00f6ssle Sauerkraut", "Produce", 45.600, 26),
        Product(29, "Th\u00fcringer Rostbratwurst", "Meat/Poultry", 123.790, 0),
        Product(30, "Nord-Ost Matjeshering", "Seafood", 25.890, 10),
        Product(31, "Gorgonzola Telino", "Dairy Products", 12.500, 0),
        Product(32, "Mascarpone Fabioli", "Dairy Products", 32.000, 9),
        Product(33, "Geitost", "Dairy Products", 2.500, 112),
        Product(34, "Sasquatch Ale", "Beverages", 14.000, 111),
        Product(35, "Steeleye Stout", "Beverages", 18.000, 20),
        Product(36, "Inlagd Sill", "Seafood", 19.000, 112),
        Product(37, "Gravad lax", "Seafood", 26.000, 11),
        Product(38, "C\u00f4te de Blaye", "Beverages", 263.500, 17),
        Product(39, "Chartreuse verte", "Beverages", 18.000, 69),
        Product(40, "Boston Crab Meat", "Seafood", 18.400, 123),
        Product(41, "Jack's New England Clam Chowder", "Seafood", 9.650, 85),
        Product(42, "Singaporean Hokkien Fried Mee", "Grains/Cereals", 14.000, 26),
        Product(43, "Ipoh Coffee", "Beverages", 46.000, 17),
        Product(44, "Gula Malacca", "Condiments", 19.450, 27),
        Product(45, "Rogede sild", "Seafood", 9.500, 5),
        Product(46, "Spegesild", "Seafood", 12.000, 95),
        Product(47, "Zaanse koeken", "Confections", 9.500, 36),
        Product(48, "Chocolade", "Confections", 12.750, 15),
        Product(49, "Maxilaku", "Confections", 20.000, 10),
        Product(50, "Valkoinen suklaa", "Confections", 16.250, 65),
        Product(51, "Manjimup Dried Apples", "Produce", 53.000, 20),
        Product(52, "Filo Mix", "Grains/Cereals", 7.000, 38),
        Product(53, "Perth Pasties", "Meat/Poultry", 32.800, 0),
        Product(54, "Tourti\u00e8re", "Meat/Poultry", 7.450, 21),
        Product(55, "P\u00e2t\u00e9 chinois", "Meat/Poultry", 24.000, 115),
        Product(56, "Gnocchi di nonna Alice", "Grains/Cereals", 38.000, 21),
        Product(57, "Ravioli Angelo", "Grains/Cereals", 19.500, 36),
        Product(58, "Escargots de Bourgogne", "Seafood", 13.250, 62),
        Product(59, "Raclette Courdavault", "Dairy Products", 55.000, 79),
        Product(60, "Camembert Pierrot", "Dairy Products", 34.000, 19),
        Product(61, "Sirop d'\u00e9rable", "Condiments", 28.500, 113),
        Product(62, "Tarte au sucre", "Confections", 49.300, 17),
        Product(63, "Vegie-spread", "Condiments", 43.900, 24),
        Product(64, "Wimmers gute Semmelkn\u00f6del", "Grains/Cereals", 33.250, 22),
        Product(65, "Louisiana Fiery Hot Pepper Sauce", "Condiments", 21.050, 76),
        Product(66, "Louisiana Hot Spiced Okra", "Condiments", 17.000, 4),
        Product(67, "Laughing Lumberjack Lager", "Beverages", 14.000, 52),
        Product(68, "Scottish Longbreads", "Confections", 12.500, 6),
        Product(69, "Gudbrandsdalsost", "Dairy Products", 36.000, 26),
        Product(70, "Outback Lager", "Beverages", 15.000, 15),
        Product(71, "Flotemysost", "Dairy Products", 21.500, 26),
        Product(72, "Mozzarella di Giovanni", "Dairy Products", 34.800, 14),
        Product(73, "R\u00f6d Kaviar", "Seafood", 15.000, 101),
        Product(74, "Longlife Tofu", "Produce", 10.000, 4),
        Product(75, "Rh\u00f6nbr\u00e4u Klosterbier", "Beverages", 7.750, 125),
        Product(76, "Lakkalik\u00f6\u00f6ri", "Beverages", 18.000, 57),
        Product(77, "Original Frankfurter gr\u00fcne So\u00dfe", "Condiments", 13.000, 32))
}

val dateDeserializer: JsonDeserializer<Date>
    get() {
        val iso8601Formatter = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")

        return JsonDeserializer<java.util.Date> { json, typeOfT, context ->
            try {
                return@JsonDeserializer if (json == null) null else iso8601Formatter.parse(json.asString)
            } catch (e: ParseException) {
                throw RuntimeException(e)
            }
        }
    }

internal var _customers: ArrayList<Customer> = ArrayList()
fun init(res: Resources) {
    try {
        val stream = res.openRawResource(R.raw.customers)
        val reader = BufferedReader(InputStreamReader(stream, "UTF-8"))

        val gson = GsonBuilder().registerTypeAdapter(Date::class.java, dateDeserializer).create()

        val c = gson.fromJson(reader, Array<Customer>::class.java)
        _customers = toList(*c)

        reader.close()
    } catch (e: Exception) {
        throw RuntimeException(e)
    }
}

val customers: List<Customer> by lazy {
    _customers
}

internal var dateFormat = SimpleDateFormat("yyyy/MM/dd")

fun dateFmt(date: Date?): String {
    if (date == null)
        return ""

    return dateFormat.format(date)
}
