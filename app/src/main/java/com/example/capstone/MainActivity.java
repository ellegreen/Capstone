package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This will open the NowHiring page when the button is clicked
     * @param view
     */
    public void artPage(View view) {
        Intent i = new Intent(this,ArtPage.class);
        startActivity(i);
    }

    /**
     * This will open the NowHiring page when the button is clicked
     * @param view
     */
    public void contactMe(View view) {
        Intent i = new Intent(this,ContactMePage.class);
        startActivity(i);
    }
}