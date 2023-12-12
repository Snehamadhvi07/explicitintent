package com.example.explicitintent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class mainact2 extends AppCompatActivity {
     TextView tv;
     String namefinal;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_main2);

        tv = findViewById(R.id.disname);

        namefinal = getIntent().getStringExtra("nameact1");
        tv.setText(namefinal);
    }

}
