package com.example.knowaboutclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class question_1 extends AppCompatActivity {
    private TextView q_1;
    private TextView information_Q_1;
    private VideoView question1VideoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        VideoView question1VideoView = findViewById(R.id.question1VideoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video_q1;
        Uri uri = Uri.parse(videoPath);
        question1VideoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        question1VideoView.setMediaController(mediaController);
        mediaController.setAnchorView(question1VideoView);
        question1VideoView.start();

        this.setTitle("What is Weather ?");
        q_1 = findViewById(R.id.q_1);
        information_Q_1 = findViewById(R.id.information_Q_1);
        q_1.setPaintFlags(q_1.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

    }
}