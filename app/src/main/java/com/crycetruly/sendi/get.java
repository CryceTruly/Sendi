package com.crycetruly.sendi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class get extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get);

        Bundle Data = getIntent().getExtras();
        if (Data== null){
            return;
        }
        String Message = Data.getString("Message");
        String msg="they sent "+Message;
        TextView gettv = (TextView) findViewById(R.id.gettv);
        gettv.setText(msg);
    }
    public void nextclicked(View view){
        Intent I = new Intent(this, MainActivity.class);
        startActivity(I);
    }


    }

