package com.example.knowaboutclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class question_7 extends AppCompatActivity {
    private TextView q_7;
    private TextView information_Q_7;
    private VideoView question7VideoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        VideoView question7VideoView = findViewById(R.id.question7VideoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video_q7;
        Uri uri = Uri.parse(videoPath);
        question7VideoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        question7VideoView.setMediaController(mediaController);
        mediaController.setAnchorView(question7VideoView);
        question7VideoView.start();

        this.setTitle("Disaster No. 1 !");
        q_7 = findViewById(R.id.q_7);
        information_Q_7 = findViewById(R.id.information_Q_7);
        q_7.setPaintFlags(q_7.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }
}