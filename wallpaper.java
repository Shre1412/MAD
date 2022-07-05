package com.example.wallpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Button changewallpaper;
    Timer mytimer;
    Drawable drawable;
    WallpaperManager wpm;
    int id = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytimer = new Timer();
        wpm = WallpaperManager.getInstance(this);
        changewallpaper = findViewById(R.id.button);

        changewallpaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setWallpaper();
            }
        });
    }

    private void setWallpaper() {
        mytimer.schedule(new TimerTask(){
            @Override
            public void run() {
                if(id==1){
                    drawable = getResources().getDrawable(R.drawable.wallpaper);
                    id = 2;
                }
                else if(id==2) {
                    drawable = getResources().getDrawable(R.drawable.wallpapertwo);
                    id = 3;
                }
                else if(id==3) {
                    drawable = getResources().getDrawable(R.drawable.wallpaperthree);
                    id = 4;
                }
                else if(id==4) {
                    drawable = getResources().getDrawable(R.drawable.wallpaperfour);
                    id = 5;
                }
                else if(id==5) {
                    drawable = getResources().getDrawable(R.drawable.wallpaperfive);
                    id = 1;
                }
                Bitmap wallpaper = ((BitmapDrawable)drawable).getBitmap();
                try{
                    wpm.setBitmap(wallpaper);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


},0,5000);
}
}
