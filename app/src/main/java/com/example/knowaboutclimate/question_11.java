package com.example.knowaboutclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class question_11 extends AppCompatActivity {
    TextView give_credit;
    TextView credit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_11);

        give_credit = findViewById(R.id.about_content);
        credit = findViewById(R.id.credit);
    }
}