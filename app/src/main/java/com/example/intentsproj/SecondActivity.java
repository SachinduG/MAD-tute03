package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private int val1,val2;
    private Button btnAdd;
    private Button btnSub;
    private Button btnMul;
    private Button btnDiv;
    private EditText tvNum1;
    private EditText tvNum2;
    private TextView tvResult;
    private String Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        tvNum1 = findViewById(R.id.tvNum1);
        tvNum2 = findViewById(R.id.tvNum2);
        tvResult = findViewById(R.id.tvResult);

        Intent intent = getIntent();
        val1 = Integer.parseInt(intent.getStringExtra("Number1"));
        val2 = Integer.parseInt(intent.getStringExtra("Number2"));

        tvNum1.setText(intent.getStringExtra("Number1"));
        tvNum2.setText(intent.getStringExtra("Number2"));

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result = String.valueOf(val1+val2);
                tvResult.setText(val1+" + "+val2+" = "+Result);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result = String.valueOf(val1 - val2);
                tvResult.setText(val1+" - "+val2+" = "+Result);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result = String.valueOf(val1 / val2);
                tvResult.setText(val1+" / "+val2+" = "+Result);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result = String.valueOf(val1 * val2);
                tvResult.setText(val1+" x "+val2+" = "+Result);
            }
        });


    }
}