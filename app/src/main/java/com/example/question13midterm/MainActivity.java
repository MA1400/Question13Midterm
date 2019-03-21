package com.example.question13midterm;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textName;
    TextView textViewResult;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textName = (TextInputEditText) findViewById(R.id.textName);
        textViewResult = findViewById(R.id.textViewResult);

    }
    public void buttonPushMeClick(View view) {
        String finalResult = "is a great Android Programmer";
    textViewResult.setText(textName + finalResult);
    }
}
