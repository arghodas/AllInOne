package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;

public class CalendarActivity extends AppCompatActivity {
    private DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        this.setTitle("Calander");
        datePicker=(DatePicker)findViewById(R.id.datepikerid);
    }
}