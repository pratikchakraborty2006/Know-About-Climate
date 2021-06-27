package com.example.knowaboutclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class question_5 extends AppCompatActivity {
    private TextView q_5;
    private TextView information_Q_5;
    private VideoView question5VideoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_5);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        VideoView question5VideoView = findViewById(R.id.question5VideoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video_q5;
        Uri uri = Uri.parse(videoPath);
        question5VideoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        question5VideoView.setMediaController(mediaController);
        mediaController.setAnchorView(question5VideoView);
        question5VideoView.start();

        this.setTitle("Global Temperature Rise Details !");
        q_5 = findViewById(R.id.q_5);
        information_Q_5 = findViewById(R.id.information_Q_5);
        q_5.setPaintFlags(q_5.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }
}