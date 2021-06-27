package com.example.knowaboutclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class question_9 extends AppCompatActivity {
    private TextView q_9;
    private TextView information_Q_9;
    private VideoView question9VideoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_9);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        VideoView question9VideoView = findViewById(R.id.question9VideoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video_q9;
        Uri uri = Uri.parse(videoPath);
        question9VideoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        question9VideoView.setMediaController(mediaController);
        mediaController.setAnchorView(question9VideoView);
        question9VideoView.start();

        this.setTitle("Disaster No. 3 !");
        q_9 = findViewById(R.id.q_9);
        information_Q_9 = findViewById(R.id.information_Q_9);
        q_9.setPaintFlags(q_9.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }
}