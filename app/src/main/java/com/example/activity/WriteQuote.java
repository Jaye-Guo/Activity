package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WriteQuote extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_quote);

        Button save = findViewById(R.id.okSave);
        if (save != null){
            save.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v){
        EditText quoteNew = findViewById(R.id.quoteNew);
        Intent intent = new Intent();
        intent.putExtra("quoteNew", quoteNew.getText().toString());
        setResult(RESULT_OK,intent);
        finish();
    }
}