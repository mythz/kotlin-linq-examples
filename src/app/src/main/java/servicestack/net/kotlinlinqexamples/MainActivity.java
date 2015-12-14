package servicestack.net.kotlinlinqexamples;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import net.servicestack.client.Log;
import net.servicestack.client.LogProvider;
import net.servicestack.client.LogType;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import servicestack.net.kotlinlinqexamples.support.DataKt;

public class MainActivity extends Activity {

    public class StringBuilderLogProvider extends LogProvider {
        StringBuilder sb;

        public StringBuilderLogProvider(StringBuilder sb){
            super(null, true);
            this.sb = sb;
        }

        @Override
        public void println(LogType type, Object message) {
            sb.append("\n").append(message.toString());
        }
    }

    StringBuilder sb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar bar = getActionBar();
        bar.setDisplayShowHomeEnabled(true);
        bar.setLogo(R.drawable.ic_action_android);
        bar.setDisplayUseLogoEnabled(true);

        sb = new StringBuilder();
        Log.Instance = new StringBuilderLogProvider(sb);
        DataKt.init(getResources());

        Log.i("101 Kotlin LINQ Examples");
        Log.i("======================\n");
        Run(new Restrictions());
        Run(new Projections());
        Run(new Partitioning());
        Run(new Ordering());
        Run(new Grouping());
        Run(new SetOperators());
        Run(new Conversion());
        Run(new ElementOperators());
        Run(new GenerationOperators());
        Run(new Quantifiers());
        Run(new AggregateOperators());
        Run(new MiscOperators());
        Run(new QueryExecution());
        Run(new JoinOperators());
    }

    void Run(Object linqExamples){
        Class cls = linqExamples.getClass();
        Method[] methods = cls.getMethods();
        for (Method method : methods){
            if (method.getDeclaringClass() != cls || method.getParameterTypes().length != 0)
                continue;

            Log.i("\n# " + method.getName().toUpperCase());
            try {
                method.invoke(linqExamples);
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.e(e.getCause().toString());
                e.printStackTrace();
            }
        }

        TextView txtMain = (TextView)findViewById(R.id.txtMain);
        txtMain.setText(sb.toString());

        final ScrollView scrollView = (ScrollView)findViewById(R.id.scrollView);
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                scrollView.fullScroll(View.FOCUS_DOWN);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
