package com.example.knowaboutclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class contact extends AppCompatActivity {
    TextView name;
    TextView m_class;
    TextView contact_number;
    TextView knowme;
    ImageView pic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        this.setTitle("Contact Me !");
    }
}