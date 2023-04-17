 package com.busaridwan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

 public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Intent i = getIntent();
        String data = i.getStringExtra("DATA");
        ((TextView) findViewById(R.id.message)).setText(data);
    }
    public void goToYou(View v){
        Intent i = new Intent(this, YouTube.class);
        startActivity(i);

    }
}