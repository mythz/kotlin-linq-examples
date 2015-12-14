package servicestack.net.kotlinlinqexamples

import android.app.Activity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ScrollView
import android.widget.TextView
import net.servicestack.client.Log
import net.servicestack.client.LogProvider
import net.servicestack.client.LogType
import servicestack.net.kotlinlinqexamples.support.init
import java.lang.reflect.InvocationTargetException

class MainActivity : Activity() {

    inner class StringBuilderLogProvider(internal var sb: StringBuilder) : LogProvider(null, true) {

        override fun println(type: LogType, message: Any?) {
            sb.append("\n").append(message!!.toString())
        }
    }

    internal var sb: StringBuilder = StringBuilder()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bar = actionBar
        bar.setDisplayShowHomeEnabled(true)
        bar.setLogo(R.drawable.ic_action_android)
        bar.setDisplayUseLogoEnabled(true)

        sb = StringBuilder()
        Log.Instance = StringBuilderLogProvider(sb)
        init(resources)

        Log.i("101 Kotlin LINQ Examples")
        Log.i("========================\n")
        Run(Restrictions())
        Run(Projections())
        Run(Partitioning())
        Run(Ordering())
        Run(Grouping())
        Run(SetOperators())
        Run(Conversion())
        Run(ElementOperators())
        Run(GenerationOperators())
        Run(Quantifiers())
        Run(AggregateOperators())
        Run(MiscOperators())
        Run(QueryExecution())
        Run(JoinOperators())
    }

    internal fun Run(linqExamples: Any) {
        val cls = linqExamples.javaClass
        val methods = cls.methods
        for (method in methods) {
            if (method.declaringClass != cls || method.parameterTypes.size != 0)
                continue

            Log.i("\n# " + method.name.toUpperCase())
            try {
                method.invoke(linqExamples)
            } catch (e: IllegalAccessException) {
                Log.e(e.cause.toString())
                e.printStackTrace()
            } catch (e: InvocationTargetException) {
                Log.e(e.cause.toString())
                e.printStackTrace()
            }

        }

        val txtMain = findViewById(R.id.txtMain) as TextView
        txtMain.text = sb.toString()

        val scrollView = findViewById(R.id.scrollView) as ScrollView
        scrollView.post { scrollView.fullScroll(View.FOCUS_DOWN) }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}
