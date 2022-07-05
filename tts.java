package com.example.texttospeech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText e1;
    Button b1;
    TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.editTextTextPersonName);
        b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(this);
        tts = new TextToSpeech(getBaseContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i!=TextToSpeech.ERROR){
                    Toast.makeText(getBaseContext(), "success", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tts.setLanguage(Locale.ENGLISH);
    }

    @Override
    public void onClick(View view) {
        String Text = e1.getText().toString();
        tts.speak(Text, TextToSpeech.QUEUE_FLUSH, null);
    }
}
