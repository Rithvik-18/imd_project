package com.example.imd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    ImageButton imgbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        imgbutton = (ImageButton) findViewById(R.id.imageButton3);
        imgbutton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(intent);
            }
        }));
        imgbutton = (ImageButton) findViewById(R.id.imageButton4);
        imgbutton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this,MainActivity5.class);
                startActivity(intent);
            }
        }));
    }
}