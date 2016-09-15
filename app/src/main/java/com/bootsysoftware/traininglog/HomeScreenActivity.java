package com.bootsysoftware.traininglog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class HomeScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Toast.makeText(HomeScreenActivity.this, "Hello World!", Toast.LENGTH_SHORT).show();
    }
}
