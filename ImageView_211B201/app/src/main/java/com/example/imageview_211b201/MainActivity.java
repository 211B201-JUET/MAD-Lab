package com.example.imageview_211b201;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void changeImage(View view){
        ImageView ImgV = findViewById(R.id.imageView);
        TextView TxtV = findViewById(R.id.textView2);
        if(TxtV.getText()=="Eggs"){
            ImgV.setImageResource(R.drawable.chicks);
            TxtV.setText("Chicks");
        } else {
            ImgV.setImageResource(R.drawable.eggs);
            TxtV.setText("Eggs");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}