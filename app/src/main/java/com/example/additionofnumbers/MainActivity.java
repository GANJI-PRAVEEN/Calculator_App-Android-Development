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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    String regex = "^[a-zA-Z]*$";
    public void OnBtnClick(View view){
        System.out.println("Initialized ra");
        EditText ed1=findViewById(R.id.num1);
        EditText ed2=findViewById(R.id.num2);
        TextView  resview=findViewById(R.id.res);
        String n1str=ed1.getText().toString();
        Button add = findViewById(R.id.b1);
        Button sub = findViewById(R.id.b2);
        Button mul = findViewById(R.id.b3);
        Button div = findViewById(R.id.b4);
        Button mod = findViewById(R.id.b5);
        String n2str=ed2.getText().toString();
        if(n1str.matches(regex) || n2str.matches(regex)) {
            Toast.makeText(MainActivity.this, "Invalid Number", Toast.LENGTH_SHORT).show();
        }
        else {
            Double n1 = Double.parseDouble(ed1.getText().toString());
            Double n2 = Double.parseDouble(ed2.getText().toString());
            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    System.out.println("Clicked On Add");
                    Double res = n1 + n2;
                    Toast.makeText(MainActivity.this, "Addition Operation", Toast.LENGTH_SHORT).show();
                    resview.setText(Double.toString(res));
                }
            });
            sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Double res = n1 - n2;
                    Toast.makeText(MainActivity.this, "Subtraction Operation", Toast.LENGTH_SHORT).show();
                    resview.setText(Double.toString(res));
                }
            });
            mul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Double res = n1 * n2;
                    Toast.makeText(MainActivity.this, "Multiplication Operation", Toast.LENGTH_SHORT).show();
                    resview.setText(Double.toString(res));
                }
            });
            div.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Double res =  (n1 / n2);
                    Toast.makeText(MainActivity.this, "Division Operation", Toast.LENGTH_SHORT).show();
                    resview.setText(Double.toString(res));
                }
            });
            mod.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Double res = (n1 % n2);
                    Toast.makeText(MainActivity.this, "MOD Operation", Toast.LENGTH_SHORT).show();
                    resview.setText(Double.toString(res));
                }
            });
        }
    }
}