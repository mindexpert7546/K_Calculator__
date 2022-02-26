package com.mindblowing143.kcal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      EditText editText = findViewById(R.id.et1);
      EditText editText1 = findViewById(R.id.et2);

      TextView textView = findViewById(R.id.restv1);
        Button button = findViewById(R.id.addbtn1);
        Button button1 = findViewById(R.id.subbtn2);
        Button button2 = findViewById(R.id.mulbtn3);
        Button button3 = findViewById( R.id.divbtn4);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b,res;
                a = Integer.parseInt(editText.getText().toString());
                b = Integer.parseInt(editText1.getText().toString());
                res = a+b;
                textView.setText("Result : " + res);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a , b, res;
                a = Integer.parseInt(editText.getText().toString());
                b = Integer.parseInt(editText1.getText().toString());
                res = a-b;
                textView.setText("Result : " + res);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a , b, res;
                a = Integer.parseInt(editText.getText().toString());
                b = Integer.parseInt(editText1.getText().toString());
                res = a*b;
                textView.setText("Result : " + res);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a , b, res;
                a = Integer.parseInt(editText.getText().toString());
                b = Integer.parseInt(editText1.getText().toString());
                res = a/b;
                textView.setText("Result : " + res);
            }
        });

    }
}