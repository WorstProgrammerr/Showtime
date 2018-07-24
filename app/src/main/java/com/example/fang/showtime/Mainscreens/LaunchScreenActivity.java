package com.example.fang.showtime.Mainscreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.fang.showtime.R;

public class LaunchScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screen);

    }

    public void handleSelection (View view){

        Intent startNewActivity = new Intent(this, LoginScreenActivity.class);
        startActivity(startNewActivity);

    }



}
