package com.example.knowaboutclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class question_4 extends AppCompatActivity {
    private TextView q_4;
    private TextView information_Q_4;
    private VideoView question4VideoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_4);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        VideoView question4VideoView = findViewById(R.id.question4VideoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video_q4;
        Uri uri = Uri.parse(videoPath);
        question4VideoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        question4VideoView.setMediaController(mediaController);
        mediaController.setAnchorView(question4VideoView);
        question4VideoView.start();

        this.setTitle("What is the Effects of Climate Change ?");
        q_4 = findViewById(R.id.q_4);
        information_Q_4 = findViewById(R.id.information_Q_4);
        q_4.setPaintFlags(q_4.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }
}