package com.example.panchoa.mastermind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WinActivity extends AppCompatActivity {

    private int mainMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.ecran_victoire);

        this.mainMenu=6;
    }

    public void gererClickMenu(View button){
        Intent myIntent = new Intent(WinActivity.this,MainActivity.class);
        int buttonTag = Integer.parseInt(button.getTag().toString());
        if(buttonTag==mainMenu){
            startActivity(myIntent);
        }

    }
}
