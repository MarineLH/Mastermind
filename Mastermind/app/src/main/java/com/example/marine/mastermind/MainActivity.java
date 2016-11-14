package com.example.marine.mastermind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int Regles;
    private int RetourMenu;
    private int Jouer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.Regles = 1;
        this.RetourMenu = 2;
        this.Jouer = 0;
    }

    public void gererClickButtons(View button){
        Log.v("MYAPP", "On a cliqué sur le bouton des règles");

        int buttonTag = Integer.parseInt(button.getTag().toString());

        if (buttonTag == Regles) {

            setContentView(R.layout.regles_layout);
        }
        else if (buttonTag == RetourMenu){

            setContentView((R.layout.activity_main));
        }
        else if (buttonTag == Jouer){

            Intent myIntent = new Intent(MainActivity.this, ModeJeuActivity.class);
            startActivity(myIntent);
        }
    }
}
