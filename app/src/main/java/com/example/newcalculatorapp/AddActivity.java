package com.example.newcalculatorapp;

import android.content.Intent;
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

public class AddActivity extends AppCompatActivity {
Button b,b1;
EditText et1,et2;
String s1,s2,r="";
TextView t;
int a,c,s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);
        b=(Button) findViewById(R.id.addy);
        b1=(Button) findViewById(R.id.back);
        et1=(EditText)findViewById(R.id.n1);
        et2=(EditText)findViewById(R.id.n2);
        t=(TextView)findViewById(R.id.resT);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(o);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            s1=et1.getText().toString();
            s2=et2.getText().toString();
            a=Integer.parseInt(s1);
            c=Integer.parseInt(s2);
            s=a+c;
            r=Integer.toString(s);
            t.setText(r);
                Toast.makeText(getApplicationContext(),r,Toast.LENGTH_LONG).show();
            }
        });
    }
}