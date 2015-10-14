package com.example.apple.javacoding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.apple.javacoding.utilities.MyTextUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWelcomeString();//TODO 定义一个新方法来放新写的一些代码

    }

    private void getWelcomeString() {
        //TODO 定义自定义类MyTextUtil
        MyTextUtil myUtil = new MyTextUtil();
        TextView tv = (TextView) findViewById(R.id.myTextView);
        tv.setText(myUtil.getValue());
        /* TODO 调试代码Log类是将调试结果显示在logcat界面，i是info的意思 */
        for (int counter = 0; counter < 10; counter++) {
            Log.i("MainActivity", "value: " + counter);
        }
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
