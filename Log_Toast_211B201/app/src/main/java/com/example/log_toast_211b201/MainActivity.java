package com.example.log_toast_211b201;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    protected int c=0;
    public void displayToast(View view){
        Log.i("displayToast","Button has been clicked!");
        Toast.makeText(this,"This is Toast : " + c++,Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}