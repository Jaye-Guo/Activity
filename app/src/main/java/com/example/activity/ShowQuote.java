package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowQuote extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_quote);

        Intent intent = getIntent();
        String quote = intent.getStringExtra("quoteShow");
        TextView textView = findViewById(R.id.showQuote);
        if(textView != null){
            textView.setText(quote);
        }

        Button show = findViewById(R.id.okGet);
        if(show != null){
            show.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v){
        finish();
    }
}