package com.example.allinone;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static android.os.VibrationEffect.DEFAULT_AMPLITUDE;
import static com.example.allinone.R.*;
import static com.example.allinone.R.raw.*;

public class MainActivity extends AppCompatActivity {
    private ImageView button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        this.setTitle("All In One");

        final Vibrator vibrator=(Vibrator)getSystemService(VIBRATOR_SERVICE);
        final MediaPlayer mp = MediaPlayer.create(this, click);
        button=findViewById(id.weatherButton);
        button.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v){
                openWeatherActivity();
                vibrator.vibrate(VibrationEffect.createOneShot(200,DEFAULT_AMPLITUDE));
                mp.start();
            }
        });

        button=findViewById(id.mapButton);
        button.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v){
                openMapActivity();
                vibrator.vibrate(VibrationEffect.createOneShot(200,DEFAULT_AMPLITUDE));
                mp.start();
            }
        });

        button= findViewById(id.calendarButton);
        button.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v){
                openCalanderActivity();
                vibrator.vibrate(VibrationEffect.createOneShot(200,DEFAULT_AMPLITUDE));
                mp.start();
            }
        });

        button=findViewById(id.ageButton);
        button.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v){
                openAgeActivity();
                vibrator.vibrate(VibrationEffect.createOneShot(200,DEFAULT_AMPLITUDE));
                mp.start();
            }
        });

        button = findViewById(id.calculatorButton);
        button.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v){
                openCalculatorActivity();
                vibrator.vibrate(VibrationEffect.createOneShot(200,DEFAULT_AMPLITUDE));
                mp.start();
            }
        });
        button=findViewById(id.locationButton);
        button.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v){
                openLocationActivity();
                vibrator.vibrate(VibrationEffect.createOneShot(200,DEFAULT_AMPLITUDE));
                mp.start();
            }
        });
        button=findViewById(id.compassButton);
        button.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v){
                openCompassActivity();
                vibrator.vibrate(VibrationEffect.createOneShot(200,DEFAULT_AMPLITUDE));
                mp.start();
            }
        });
    }
    public void openWeatherActivity(){
        Intent intent=new Intent(this, WeatherActivity.class);
        startActivity(intent);
    }
    public void openMapActivity(){
        Intent intent=new Intent(this, MapActivity.class);
        startActivity(intent);
    }
    public void openCalanderActivity(){
        Intent intent=new Intent(this, CalendarActivity.class);
        startActivity(intent);
    }
    public void openAgeActivity(){
        Intent intent=new Intent(this, AgeActivity.class);
        startActivity(intent);
    }
    public void openCalculatorActivity(){
        Intent intent=new Intent(this, CalculatorActivity.class);
        startActivity(intent);
    }
    public void openLocationActivity(){
        Intent intent=new Intent(this, LocationActivity.class);
        startActivity(intent);
    }
    public void openCompassActivity(){
        Intent intent=new Intent(this, CompassActivity.class);
        startActivity(intent);
    }
}
