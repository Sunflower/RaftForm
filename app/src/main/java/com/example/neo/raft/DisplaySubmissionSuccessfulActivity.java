package com.example.neo.raft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplaySubmissionSuccessfulActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_submission_successful);
    }

    public void done(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }

}
