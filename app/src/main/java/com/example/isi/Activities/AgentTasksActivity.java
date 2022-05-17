package com.example.isi.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.isi.R;

public class AgentTasksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent_tasks);
        Button taskBTN= (Button) findViewById(R.id.button_Task);
        Intent intent= getIntent();
        String auth=(String) intent.getSerializableExtra("data");
        String user=(String) intent.getSerializableExtra("nom");
        Button tasksBTN= (Button) findViewById(R.id.button_Tasks);
        taskBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nom= taskBTN.getText().toString();
                startActivity(new Intent(AgentTasksActivity.this, ListActivity.class).putExtra("data", auth).putExtra("nom",user).putExtra("btn",nom));
            }
        });
        tasksBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nom= tasksBTN.getText().toString();
                startActivity(new Intent(AgentTasksActivity.this, ListActivity.class).putExtra("data", auth).putExtra("nom",user).putExtra("btn",nom));
            }
        });
    }
}