package sg.edu.rp.c346.id21001096.l07_fruitsarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    String[] fruits;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> fruits;
        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        String text = "Fruits\n";
        text += "=====\n";

        for (int i=0; i<fruits.size(); i++) {
            text += fruits.get(i) + "\n";
        }

        tv = findViewById(R.id.tv);
        tv.setText(text);

    }
}