package com.example.neo.raft;

import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Looper;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;


public class MainActivity extends AppCompatActivity /*implements MeshStateListener*/ {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitForm(View view) {

        Intent intent = new Intent(this, DisplaySubmissionSuccessfulActivity.class);

        startActivity(intent);
    }

    public void inAppForm(View view) {

        Intent intent = new Intent(this, inApp.class);

        startActivity(intent);
    }

    public void useBrowserForForm(View view) {
        String url = "https://docs.google.com/forms/d/e/1FAIpQLSeeDAXyo-jHBNudQI_Ym_LCXBtcZhPwZMjxIJIT4h-3B-3mYQ/viewform";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    // copied from lines-davies
    private void alert(String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(message);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                throw new RuntimeException();
            }
        });
        builder.create().show();
        try {
            Looper.loop();
        } catch (RuntimeException ex) {
        }
    }
}
