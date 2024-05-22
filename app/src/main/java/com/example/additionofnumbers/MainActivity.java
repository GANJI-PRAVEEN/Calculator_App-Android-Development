package com.example.additionofnumbers;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText ed1 = findViewById(R.id.num1);
        EditText ed2 = findViewById(R.id.num2);
        TextView resview = findViewById(R.id.res);
        Button add = findViewById(R.id.b1);
        Button sub = findViewById(R.id.b2);
        Button mul = findViewById(R.id.b3);
        Button div = findViewById(R.id.b4);
        Button mod = findViewById(R.id.b5);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Toast.makeText(MainActivity.this,"Addition Operation",Toast.LENGTH_LONG).show();
                    Double num1 = Double.parseDouble(ed1.getText().toString());
                    Double num2 = Double.parseDouble(ed2.getText().toString());
                    resview.setText(Double.toString(num1 + num2));
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Invalid Number", Toast.LENGTH_SHORT).show();
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Toast.makeText(MainActivity.this,"Subtraction Operation",Toast.LENGTH_LONG).show();
                    Double num1 = Double.parseDouble(ed1.getText().toString());
                    Double num2 = Double.parseDouble(ed2.getText().toString());
                    resview.setText(Double.toString(num1 - num2));
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Invalid Number", Toast.LENGTH_SHORT).show();
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Toast.makeText(MainActivity.this,"Multiplication Operation",Toast.LENGTH_LONG).show();
                    Double num1 = Double.parseDouble(ed1.getText().toString());
                    Double num2 = Double.parseDouble(ed2.getText().toString());
                    resview.setText(Double.toString(num1 * num2));
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Invalid Number", Toast.LENGTH_SHORT).show();
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Division Operation",Toast.LENGTH_LONG).show();
                try {
                    Double num1 = Double.parseDouble(ed1.getText().toString());
                    Double num2 = Double.parseDouble(ed2.getText().toString());
                    resview.setText(Double.toString(num1 / num2));
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Invalid Number", Toast.LENGTH_SHORT).show();
                }
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Toast.makeText(MainActivity.this,"MOD Operation",Toast.LENGTH_LONG).show();
                    Double num1 = Double.parseDouble(ed1.getText().toString());
                    Double num2 = Double.parseDouble(ed2.getText().toString());
                    resview.setText(Double.toString(num1 % num2));
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Invalid Number", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}