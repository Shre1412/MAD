package com.example.counter097;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button start, stop, reset;
    EditText res;
    boolean running = false;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.button);
        stop = (Button) findViewById(R.id.button2);
        reset = (Button) findViewById(R.id.button3);
        res = (EditText) findViewById(R.id.editTextTextPersonName);
        start.setOnClickListener(this);
        stop.setOnClickListener(this);
        reset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.equals(start)) {
            counter = 0;
            running = true;
            new MyCounter().start();
        } else if (v.equals(stop))
            running = false;
        else {
            running = false;
            res.setText("0");
        }
    }


    Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            res.setText(String.valueOf(msg.what));
        }
    };

    class MyCounter extends Thread{
        public void run(){
            while(running){
                counter++;
                handler.sendEmptyMessage(counter);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
