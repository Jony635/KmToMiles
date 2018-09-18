package com.example.jonathanmc.kmtomiles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void KmToMilles(View view) {
        EditText kmInput = findViewById(R.id.KilometresInput);

        String kmText = kmInput.getText().toString();
        float kmAmount = Float.valueOf(kmText);
        float milesAmount = (float)(kmAmount * 0.621371);


        EditText milesText = findViewById(R.id.MilesInput);
        milesText.setText(Float.toString(milesAmount));
    }

    public void MilesToKm(View view)
    {
        EditText milesInput = findViewById(R.id.MilesInput);

        String milesText = milesInput.getText().toString();
        float milesAmount = Float.valueOf(milesText);
        float kmAmount = (float)(milesAmount / 0.621371);


        EditText kmText = findViewById(R.id.KilometresInput);
        kmText.setText(Float.toString(kmAmount));
    }
}
