package com.example.button_textview_211b201;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void updateText(View view){
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView);
        if (button.getText()==textView.getText()){
            button.setText("Button");
        } else {
            button.setText(textView.getText().toString());
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}