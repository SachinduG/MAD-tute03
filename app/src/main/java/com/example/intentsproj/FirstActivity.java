package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private Button btnok;
    private EditText txt1;
    private  EditText txt2;
    public String val1,val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnok = findViewById(R.id.btnok);
        txt1 = findViewById(R.id.Num1);
        txt2 = findViewById(R.id.Num2);


        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence message =  "Sending Numbers";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context,message,duration);
                toast.show();

                val1 = txt1.getText().toString();
                val2 = txt2.getText().toString();

                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("Number1",val1);
                intent.putExtra("Number2",val2);
                startActivity(intent);

            }
        });
    }
}