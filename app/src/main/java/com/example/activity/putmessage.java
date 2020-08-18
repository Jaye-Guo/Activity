package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;
import java.util.Scanner;

public class putmessage extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.putmessage);

        Button save = findViewById(R.id.oksave);
        if (save != null)
            save.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        EditText newQuote = findViewById(R.id.newQuote);
        if(newQuote!=null){
            Intent intent = new Intent();
            intent.putExtra("newQuote", newQuote.getText().toString());
            setResult(RESULT_OK, intent);
            finish();
        }
/*        int id = v.getId();
        if (id == R.id.oksave){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }*/
    }
}
