package com.example.panchoa.mastermind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DefeatActivity extends AppCompatActivity {

    private int mainMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ecran_defaite);

        this.mainMenu=8;
    }

    public void gererClickMenu(View button){
        Intent myIntent = new Intent(DefeatActivity.this,MainActivity.class);
        int buttonTag = Integer.parseInt(button.getTag().toString());
        if(buttonTag==mainMenu){
            startActivity(myIntent);
        }
    }
}
