package com.example.knowaboutclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class question_3 extends AppCompatActivity {
    private TextView q_3;
    private TextView information_Q_3;
    private VideoView question2VideoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        VideoView question3VideoView = findViewById(R.id.question3VideoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video_q3;
        Uri uri = Uri.parse(videoPath);
        question3VideoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        question3VideoView.setMediaController(mediaController);
        mediaController.setAnchorView(question3VideoView);
        question3VideoView.start();

        this.setTitle("The Causes of Climate Change");
        q_3 = findViewById(R.id.q_3);
        information_Q_3 = findViewById(R.id.information_Q_3);
        q_3.setPaintFlags(q_3.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }
}