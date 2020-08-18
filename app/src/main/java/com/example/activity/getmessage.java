package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class getmessage extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.getmessage);

        Intent intent = getIntent();
        String quote = intent.getStringExtra("quote");

        TextView textView = findViewById(R.id.quote);
        if(textView!=null){
            textView.setText(quote);
        }

        Button get = findViewById(R.id.getok);
        if(get != null){
            get.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v){
        finish();
        }
    }
