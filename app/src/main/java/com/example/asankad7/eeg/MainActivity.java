package com.example.asankad7.eeg;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import at.markushi.ui.CircleButton;
public class MainActivity extends AppCompatActivity {
Toolbar toolbarabout;
   Toolbar toolbar;
    CircleButton bStartone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bStartone = (CircleButton) findViewById(R.id.bStartone);
        bStartone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Graph.class);
                startActivity(intent);
            }
        });
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        toolbarabout = (Toolbar)findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        setSupportActionBar(toolbarabout);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.about) {
          //  Toast.makeText(MainActivity.this, "Action clicked", Toast.LENGTH_LONG).show();
            setContentView(R.layout.activity_about);
            setSupportActionBar(toolbarabout);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            toolbarabout.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                }
            });
            return true;
        }else if (id == R.id.logout) {
          //  Toast.makeText(MainActivity.this, "Action clicked", Toast.LENGTH_LONG).show();
           finish();
            System.exit(0);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
