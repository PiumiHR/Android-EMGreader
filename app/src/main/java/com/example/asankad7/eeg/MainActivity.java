package com.example.asankad7.eeg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import at.markushi.ui.CircleButton;

public class MainActivity extends Activity {

CircleButton bStartone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bStartone = (CircleButton) findViewById(R.id.bStartone);
//btnSubmit = (SubmitButton) findViewById(R.id.bStartone);
        bStartone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Graph.class);
                startActivity(intent);
            }
        });


    }


}
