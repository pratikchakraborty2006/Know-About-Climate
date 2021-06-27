package com.example.knowaboutclimate;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import static androidx.core.content.ContextCompat.startActivities;
import static androidx.core.content.ContextCompat.startActivity;

public class DesignAdapter extends ArrayAdapter <String> {
    private String[] questions;
    private Context context;

    public DesignAdapter(@NonNull Context context, int resource, @NonNull String[] questions) {
        super(context, resource, questions);
        this.context = context;
        this.questions = questions;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return questions[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.main_design_adapter, parent, false);
        TextView t = convertView.findViewById(R.id.textView);
        t.setText(getItem(position));
/*
        int main_position = (position+1);
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "You Clicked on Question No. " + (main_position), Toast.LENGTH_SHORT).show();
            }
        });*/
        return convertView;
    }
}
