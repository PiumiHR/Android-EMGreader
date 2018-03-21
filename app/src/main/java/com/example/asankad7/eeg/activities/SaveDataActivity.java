package com.example.asankad7.eeg.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import com.example.asankad7.eeg.R;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by piumi on 3/19/18.
 */

public class SaveDataActivity extends AppCompatActivity{
    //CardView cardView;
    private AppCompatButton btn1;
    private TextInputEditText email;
    private TextInputEditText password;
    private TextInputEditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.item_user_recycler);
      //  cardView = (CardView) findViewById(R.id.cardView);
        btn1 = (AppCompatButton) findViewById(R.id.appCompatButtonRegister);
        email = (TextInputEditText) findViewById(R.id.textInputEditTextEmail);
        username = (TextInputEditText) findViewById(R.id.textInputEditTextName);
        password = (TextInputEditText) findViewById(R.id.textInputEditTextPassword);

    }
    public void save(View v){
        String FILENAME = "usersinfo";
      //  String string = cardView.toString();
        String stringone = email.getText().toString();
       // String stringtwo  = username.getText().toString();
       // String stringthree = password.getText().toString();

        FileOutputStream fos = null;
        try {
            fos = openFileOutput(FILENAME, Context.MODE_PRIVATE);

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        try {
            fos.write(stringone.getBytes());
         //   fos.write(stringtwo.getBytes());
         //   fos.write(stringthree.getBytes());
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
