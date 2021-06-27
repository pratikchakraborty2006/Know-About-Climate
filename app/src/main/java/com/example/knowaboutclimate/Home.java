package com.example.knowaboutclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    ListView listView;
    String questions [] = {"1. What is Weather ?", "2. What is Climate Change ?", "3. What is the Causes of Climate Change ?", "4. What is the Effects of Climate Change ?", "5. Global Temperature Rise Details !", "6. Disasters made for Climate Changes !", "       i) Disaster No. 1", "       ii) Disaster No. 2","       iii) Disaster No. 3", "7. Solution to Climate ?", "8. All the Information Source"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        listView = findViewById(R.id.listView);
        DesignAdapter DA = new DesignAdapter(this, R.layout.main_design_adapter, questions);
        listView.setAdapter(DA);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),Home.class);
                intent.putExtra("key", position);
                startActivity(intent);
                if (position == 0){
                    // Toast.makeText(Home.this, "Opening Activity", Toast.LENGTH_SHORT).show();
                    Intent q1 = new Intent(view.getContext(), question_1.class);
                    startActivity(q1);
                    finish();
                }
                if (position == 1){
                    // Toast.makeText(Home.this, "Opening Activity", Toast.LENGTH_SHORT).show();
                    Intent q2 = new Intent(view.getContext(), question_2.class);
                    startActivity(q2);
                    finish();
                }
                if (position == 2){
                    Intent q3 = new Intent(view.getContext(), question_3.class);
                    startActivity(q3);
                    finish();
                }
                if (position == 3){
                    Intent q4 = new Intent(view.getContext(), question_4.class);
                    startActivity(q4);
                    finish();
                }
                if (position == 4){
                    Intent q5 = new Intent(view.getContext(), question_5.class);
                    startActivity(q5);
                    finish();
                }
                if (position == 5){
                    Toast.makeText(Home.this, "Opening Disaster 1", Toast.LENGTH_SHORT).show();
                    Intent q6 = new Intent(view.getContext(), question_7.class);
                    startActivity(q6);
                    finish();
                }
                if (position == 6){
                    Intent q7 = new Intent(view.getContext(), question_7.class);
                    startActivity(q7);
                    finish();
                }
                if (position == 7){
                    Intent q8 = new Intent(view.getContext(), question_8.class);
                    startActivity(q8);
                    finish();
                }
                if (position == 8){
                    Intent q9 = new Intent(view.getContext(), question_9.class);
                    startActivity(q9);
                    finish();
                }
                if (position == 9){
                    Intent q10 = new Intent(view.getContext(), question_10.class);
                    startActivity(q10);
                    finish();
                }
                if (position == 10){
                    Intent q11 = new Intent(view.getContext(), question_11.class);
                    startActivity(q11);
                    finish();
                }
            }
        });
    }
}