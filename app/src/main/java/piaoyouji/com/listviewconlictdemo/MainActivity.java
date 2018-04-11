package piaoyouji.com.listviewconlictdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import piaoyouji.com.listviewconlictdemo.module.DataProvider;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listview);
        MyAdatper myAdatper = new MyAdatper();
        myAdatper.setInts(DataProvider.getInts(100));
        myAdatper.setStrings(DataProvider.getStrings(100));
        listView.setAdapter(myAdatper);
    }
}
