package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final int REQ_RESPONSE=1;
    String quote = "Your haven't enter anything";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button put = findViewById(R.id.left);
        if(put != null){
            put.setOnClickListener(this);
        }

        Button get = findViewById(R.id.right);
        if(get != null)
            get.setOnClickListener(this);

    }
    @Override
    public void onClick (View v){
        int id = v.getId();
        if(id==R.id.left){
            Intent intent = new Intent(this, putmessage.class);
            startActivityForResult(intent, REQ_RESPONSE);
        }
        else if (id == R.id.right){
            Intent intent = new Intent(this, getmessage.class);
            intent.putExtra("quote",quote);
            startActivity(intent);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (resultCode != RESULT_OK) {
            return;
        }

        if (requestCode == REQ_RESPONSE) {
            String newQuote = intent.getStringExtra("newQuote");
            if (newQuote != null){
                quote = newQuote;
            }
        }
    }
}
