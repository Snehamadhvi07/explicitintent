package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText name;
private Button change;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.nameact1);
        change=findViewById(R.id.button);

        change.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent it=new Intent(MainActivity.this,mainact2.class);
                                          Bundle b= new Bundle();
                                          b.putString("name",name.getText().toString());
                                          it.putExtras(b);
                                          startActivity(it);
                                      }
                                  }
        );
    }
}