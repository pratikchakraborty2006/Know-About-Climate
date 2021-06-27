package com.example.knowaboutclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class question_2 extends AppCompatActivity {
    private TextView q_2;
    private TextView information_Q_2;
    private VideoView question2VideoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        VideoView question2VideoView = findViewById(R.id.question2VideoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video_q2;
        Uri uri = Uri.parse(videoPath);
        question2VideoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        question2VideoView.setMediaController(mediaController);
        mediaController.setAnchorView(question2VideoView);
        question2VideoView.start();

        this.setTitle("What is Climate Change?");
        q_2 = findViewById(R.id.q_2);
        information_Q_2 = findViewById(R.id.information_Q_2);
        q_2.setPaintFlags(q_2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }
}