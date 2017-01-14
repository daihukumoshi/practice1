package com.practice.android.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);

    }



    public void plus(View v){
        count = count+1;
        textView.setText(count+"");
    }
    public void minus(View v){
        count = count-1;
        textView.setText(count+"");
    }
}
