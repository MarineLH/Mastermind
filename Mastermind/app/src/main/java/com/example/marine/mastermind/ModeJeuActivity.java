package com.example.marine.mastermind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ModeJeuActivity extends AppCompatActivity {

    private int ia;
    private int j2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modejeulayout);


        this.ia = 3;
        this.j2 = 4;

    }



    public void click(View button)
    {
        Log.v("MYAPP","On a cliqué");
        int buttonTag= Integer.parseInt(button.getTag().toString());

        if (buttonTag == ia)
        {
            Intent myIntent = new Intent(ModeJeuActivity.this,PlayIaActivity.class);

            startActivity(myIntent);

        }
        else if (buttonTag == j2)
        {
            Intent myIntent = new Intent(ModeJeuActivity.this,PlayJ2Activity.class);
            
            startActivity(myIntent);
        }

    }
}
