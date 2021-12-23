package com.example.ex10_activity_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.nio.file.FileAlreadyExistsException;

public class MainActivity extends AppCompatActivity {

    Intent intent1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        RadioButton radio1 = findViewById(R.id.radio1);
        RadioButton radio2 = findViewById(R.id.radio2);


        radio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent1 = new Intent(MainActivity.this,SecondActivity.class);
            }
        });
        radio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent1 = new Intent(MainActivity.this,ThridActivity.class);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 다른 액티비티로 이동
                // 1. 인텐트를 만든다
                // 2. 인텐트를 쓴다.
                // new Intent(A,B) A에서 B로
                startActivity(intent1);
            }
        });
    }
}