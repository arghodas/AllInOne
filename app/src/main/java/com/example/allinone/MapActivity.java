package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MapActivity extends AppCompatActivity {
    EditText edit;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        this.setTitle("Map");

        edit= findViewById(R.id.edit);
        button = findViewById(R.id.searchbutton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String location= String.valueOf(edit.getText()) ;

                location.replaceAll("\\s","+");

                String parsedLocation = "http://maps.google.com/maps?q=:" + location;
                Toast.makeText(MapActivity.this,location,Toast.LENGTH_LONG).show();
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(parsedLocation));

                startActivity(intent);
            }
        });
    }
}