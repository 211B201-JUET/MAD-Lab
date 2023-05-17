package com.example.animation_211b201;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isEgg = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void change(View view){
        ImageView IVEgg = findViewById(R.id.imgeggs);
        ImageView IVChick = findViewById(R.id.imgchicks);
        if(isEgg) {
            IVEgg.animate().setDuration(2000).alpha(0);
            IVChick.animate().setDuration(2000).alpha(1);
            isEgg = false;
        } else {
            IVEgg.animate().setDuration(2000).alpha(1);
            IVChick.animate().setDuration(2000).alpha(0);
            isEgg = true;
        }
    }
}