package com.example.android.androidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);
        TextView jokes_tv = (TextView) findViewById(R.id.jokes_tv);

        if(getIntent() != null){
            jokes_tv.setText(getIntent().getStringExtra("Joke"));
        }
    }
}
