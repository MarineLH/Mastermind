package com.example.marine.mastermind;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.view.LayoutInflater;
import com.example.marine.mastermind.Bille;
import android.widget.ListView;

import java.util.List;

public class PlayIaActivity extends AppCompatActivity implements View.OnClickListener {


    private PlayIaActivity viewModel;
    private ListView manches_listView;
    private Manche mancheActuelle;
    private List<Manche> manches;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_ia_layout);

        //viewModel = new PlayIaActivity(this);

        initMancheListView();

        setListeners();

    }

    public List<Manche> getManches() {
        return this.manches;
    }

    public Manche getMancheById(int mancheId) {
        Manche mancheTrouvee = null;

        for (Manche manche : getManches()) {
            if (manche.getNumManche() == mancheId) {
                mancheTrouvee = manche;
                break;
            }
        }

        return mancheTrouvee;
    }

    public static boolean isRoundComplete(Manche manche) {
        Bille bille = manche.getBilles()[manche.getBilles().length - 1];
        return bille != null;
    }

    /*private void finishRound() {
        MastermindHelper.resolveRound(game, actualRound);
        if (game.getGameState() == GameState.Playing) {
            actualRound = MastermindHelper.getRoundById(game, actualRound.getNumRound() + 1);

        } else if (game.getGameState() == GameState.Won) {
            listener.onGameWon(game);

        } else if (game.getGameState() == GameState.Lost) {
            listener.onGameLost(game);
        }
    }*/


    public void addBille(Bille bille) {

        mancheActuelle.addBille(bille);

        if (isRoundComplete(mancheActuelle)) {
            //finishRound();
        }
    }



    private void initMancheListView()
    {
        manches_listView = (ListView)findViewById(R.id.manches_listView);

    }


    private void setListeners() {
        ImageButton billeBleue = (ImageButton) findViewById(R.id.billeBleue_imageButton);
        ImageButton billeRouge = (ImageButton) findViewById(R.id.billeRouge_imageButton);
        ImageButton billeVerte = (ImageButton) findViewById(R.id.billeVerte_imageButton);
        ImageButton billeJaune = (ImageButton) findViewById(R.id.billeJaune_imageButton);
        ImageButton billeRose = (ImageButton) findViewById(R.id.billeRose_imageButton);
        ImageButton billeOrange = (ImageButton) findViewById(R.id.billeOrange_imageButton);

        billeBleue.setOnClickListener(this);
        billeRouge.setOnClickListener(this);
        billeVerte.setOnClickListener(this);
        billeJaune.setOnClickListener(this);
        billeRose.setOnClickListener(this);
        billeOrange.setOnClickListener(this);
    }


    private void billeSelection(Bille bille)
    {
        viewModel.addBille(bille);
        //adapter.notifyDataSetChanged;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        Bille bille = null;

        switch (id) {
            case R.id.billeBleue_imageButton:
                bille = Bille.Bleue;
                break;
            case R.id.billeRouge_imageButton:
                bille = Bille.Rouge;
                break;
            case R.id.billeVerte_imageButton:
                bille = Bille.Verte;
                break;
            case R.id.billeJaune_imageButton:
                bille = Bille.Jaune;
                break;
            case R.id.billeRose_imageButton:
                bille = Bille.Rose;
                break;
            case R.id.billeOrange_imageButton:
                bille = Bille.Orange;
                break;
            default:
        }
        if (bille != null) {
            billeSelection(bille);
        }
    }
}
