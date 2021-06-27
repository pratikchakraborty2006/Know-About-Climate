package com.example.knowaboutclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class question_10 extends AppCompatActivity {
    private TextView q_10;
    private TextView information_Q_10;
    private VideoView question10VideoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_10);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        VideoView question10VideoView = findViewById(R.id.question10VideoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video_q10;
        Uri uri = Uri.parse(videoPath);
        question10VideoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        question10VideoView.setMediaController(mediaController);
        mediaController.setAnchorView(question10VideoView);
        question10VideoView.start();

        this.setTitle("Solution to Climate ?");
        q_10 = findViewById(R.id.q_10);
        information_Q_10 = findViewById(R.id.information_Q_10);
        q_10.setPaintFlags(q_10.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }
}