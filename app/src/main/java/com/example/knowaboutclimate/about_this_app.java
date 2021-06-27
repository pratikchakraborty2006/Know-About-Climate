package com.example.knowaboutclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class about_this_app extends AppCompatActivity {
    TextView about_h;
    TextView about_content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_this_app);

        TextView about_h = findViewById(R.id.about_h);
        TextView about_content = findViewById(R.id.about_content);

        this.setTitle("About this App !");
    }
}