package com.example.knowaboutclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class question_8 extends AppCompatActivity {
    private TextView q_8;
    private TextView information_Q_8;
    private VideoView question8VideoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_8);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        VideoView question8VideoView = findViewById(R.id.question8VideoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video_q8;
        Uri uri = Uri.parse(videoPath);
        question8VideoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        question8VideoView.setMediaController(mediaController);
        mediaController.setAnchorView(question8VideoView);
        question8VideoView.start();

        this.setTitle("Disaster No. 2 !");
        q_8 = findViewById(R.id.q_8);
        information_Q_8 = findViewById(R.id.information_Q_8);
        q_8.setPaintFlags(q_8.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }
}