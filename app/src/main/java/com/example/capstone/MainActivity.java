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
     * This will open the Art page when the button is clicked
     * @param view
     */
    public void artPage(View view) {
        Intent i = new Intent(this,ArtPageActivty.class);
        startActivity(i);
    }

    /**
     * This will open the Contact Me page when the button is clicked
     * @param view
     */
    public void contactMe(View view) {
        Intent i = new Intent(this,ContactMeActivity.class);
        startActivity(i);
    }
}