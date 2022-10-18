package com.example.imd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity {
    ImageButton imgbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.camerapage);
        imgbutton = (ImageButton) findViewById(R.id.imageButton);
        imgbutton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity6.this,MainActivity3.class);
                startActivity(intent);
            }
        }));
        imgbutton = (ImageButton) findViewById(R.id.imageButton8);
        imgbutton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity6.this,MainActivity4.class);
                startActivity(intent);
            }
        }));
        imgbutton = (ImageButton) findViewById(R.id.imageButton9);
        imgbutton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity6.this,MainActivity5.class);
                startActivity(intent);
            }
        }));
    }
}