package com.busaridwan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");


//        R.id.button;
    }


    public void disable(View v){
        // METHOD ONE
        v.setEnabled(false);
        Button button = (Button) v;
        button.setText("Disabled");

        // METHOD TWO

        View x = findViewById(R.id.button);
        Button btn = (Button) x;
        btn.setText("New Disabled");

        //METHOD THREE

        ((Button) findViewById(R.id.button)).setText("Disabled");
    }

    public void handleText(View v){
//        TextView t = findViewById(R.id.source);
        EditText t = findViewById(R.id.source);
        String input = t.getText().toString();
        TextView x = findViewById(R.id.output);
        x.setText(input);
        // POPUP ALERT
        Toast.makeText(this, input, Toast.LENGTH_LONG).show();
    }

    public void goToDash(View v){
        Intent intent = new Intent(this, DashboardActivity.class );
        // PASS DATA FROM HOME TO DASH
        String message = ((EditText) findViewById(R.id.source)).getText().toString();
        intent.putExtra("DATA", message);
        startActivity(intent);
    }

}