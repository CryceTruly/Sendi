
package com.crycetruly.sendi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gonow(View view) {
        Intent I = new Intent(this, get.class);
        // get user input
        final EditText userInput = (EditText) findViewById(R.id.ptvUserInput);
        String userMessage = userInput.getText().toString();
        // pass user input in the intent
        I.putExtra("Message", userMessage);

        startActivity(I);
    }

}