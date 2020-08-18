package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityQuote extends AppCompatActivity implements View.OnClickListener {

    public int REQ_RESPONSE = 1;
    String quote = "you haven't write anything";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_quote);

        Button write = findViewById(R.id.write);
        if(write != null){
            write.setOnClickListener(this);
        }

        Button show = findViewById(R.id.show);
        if(show != null){
            show.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v){
        int id = v.getId();

        if (id == R.id.write){
            Intent intent = new Intent(this, WriteQuote.class);
            startActivityForResult(intent, REQ_RESPONSE);
        }
        else if(id == R.id.show){
            Intent intent = new Intent(this, ShowQuote.class);
            intent.putExtra("quoteShow", quote);
            startActivity(intent);
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (resultCode != RESULT_OK){
            return;
        }

        if(requestCode==REQ_RESPONSE){
            String quoteNew = intent.getStringExtra("quoteNew");
            if (quoteNew != null){
                quote = quoteNew;
            }
        }

    }
}