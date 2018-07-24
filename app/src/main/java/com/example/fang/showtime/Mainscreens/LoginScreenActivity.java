package com.example.fang.showtime.Mainscreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fang.showtime.Mainscreens.HomeScreenActivity;
import com.example.fang.showtime.R;

public class LoginScreenActivity extends AppCompatActivity {

    private EditText email;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);
    }

    public void button (View view) {
        String user = email.getText().toString();
        String pass = password.getText().toString();
        if (user.equals("admin") && pass.equals("admin"))
        {
            Intent intent = new Intent(LoginScreenActivity.this,HomeScreenActivity.class);
            startActivity(intent);
        }else
        {
            Toast.makeText(this,"Wrong password or email",Toast.LENGTH_LONG).show();
        }

    }


}
