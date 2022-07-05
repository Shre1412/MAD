package com.indhu.pavancalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, budiv, bumul, buminus, buplus, budec, bueq, buclear;
    EditText e1, result;
    float v1, v2;
    boolean add, sub, mul, div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.but1);
        b2=findViewById(R.id.but2);
        b3=findViewById(R.id.but3);
        b4=findViewById(R.id.but4);
        b5=findViewById(R.id.but5);
        b6=findViewById(R.id.but6);
        b7=findViewById(R.id.but7);
        b8=findViewById(R.id.but8);
        b9=findViewById(R.id.but9);
        b0=findViewById(R.id.but0);
        budiv=findViewById(R.id.butdiv);
        bumul=findViewById(R.id.butmul);
        buminus=findViewById(R.id.butminus);
        buplus=findViewById(R.id.butplus);
        budec=findViewById(R.id.butdec);
        bueq=findViewById(R.id.buteq);
        buclear=findViewById(R.id.butclear);
        e1=findViewById(R.id.edit1);
        result=findViewById(R.id.res);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"0");
            }
        });

        buclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(null);
                result.setText(null);
            }
        });

        budec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+".");
            }
        });

        buplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=Float.parseFloat(e1.getText().toString());
                e1.setText(null);
                add=true;
            }
        });
        buminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=Float.parseFloat(e1.getText().toString());
                e1.setText(null);
                sub=true;
            }
        });
        bumul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=Float.parseFloat(e1.getText().toString());
                e1.setText(null);
                mul=true;
            }
        });
        budiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=Float.parseFloat(e1.getText().toString());
                e1.setText(null);
                div=true;
            }
        });

        bueq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(add==true)
                {
                    v2=Float.parseFloat(e1.getText().toString());
                    result.setText(v1+v2+"");
                    e1.setText(null);
                    add=false;
                }
                else if(sub==true)
                {
                    v2=Float.parseFloat(e1.getText().toString());
                    result.setText(v1-v2+"");
                    e1.setText(null);
                    sub=false;
                }
                else if(mul==true)
                {
                    v2=Float.parseFloat(e1.getText().toString());
                    result.setText(v1*v2+"");
                    e1.setText(null);
                    mul=false;
                }
                else if(div==true)
                {
                    v2=Float.parseFloat(e1.getText().toString());
                    if(v2==0)
                    {
                        result.setText("Zero Division Error");
                        e1.setText(null);
                        div=false;
                    }
                    else
                        result.setText(v1/v2+"");
                        e1.setText(null);
                        div=false;
                }
            }
        });


    }
}
