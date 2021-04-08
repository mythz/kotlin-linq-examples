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

    inner class StringBuilderLogProvider(private var sb: StringBuilder) : LogProvider(null, true) {
        override fun println(type: LogType, message: Any?) {
            sb.append("\n").append(message!!.toString())
        }
    }

    private var sb: StringBuilder = StringBuilder()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        actionBar?.let {
            it.setDisplayShowHomeEnabled(true)
            it.setLogo(R.drawable.ic_action_android)
            it.setDisplayUseLogoEnabled(true)
        }

        sb = StringBuilder()
        Log.Instance = StringBuilderLogProvider(sb)
        init(resources)

        Log.i("101 Kotlin LINQ Examples")
        Log.i("========================\n")
        run(Restrictions())
        run(Projections())
        run(Partitioning())
        run(Ordering())
        run(Grouping())
        run(SetOperators())
        run(Conversion())
        run(ElementOperators())
        run(GenerationOperators())
        run(Quantifiers())
        run(AggregateOperators())
        run(MiscOperators())
        run(QueryExecution())
        run(JoinOperators())
    }

    private fun run(linqExamples: Any) {
        val cls = linqExamples.javaClass
        val methods = cls.methods
        for (method in methods) {
            if (method.declaringClass != cls || method.parameterTypes.isNotEmpty()) continue

            Log.i("\n# " + method.name.toUpperCase())
            try {
                method.invoke(linqExamples)
            } catch (e: IllegalAccessException) {
                Log.e(e.cause.toString())
            } catch (e: InvocationTargetException) {
                Log.e(e.cause.toString())
            }
        }

        val txtMain = findViewById<TextView>(R.id.txtMain)
        txtMain.text = sb.toString()

        val scrollView = findViewById<ScrollView>(R.id.scrollView)
        scrollView.post {
            scrollView.fullScroll(View.FOCUS_DOWN)
        }
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
