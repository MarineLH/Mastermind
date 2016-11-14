package com.example.marine.mastermind;

import android.net.sip.SipSession;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import com.example.marine.mastermind.Manche;

import java.util.List;

public class PlayJ2Activity extends AppCompatActivity {

    private PlayIaActivity viewModel;
    private ListView manches_listView;
    private Manche mancheActuelle;
    private List<Manche> manches;
    private RoundAdapter adapter;
    private SipSession.Listener listener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_ia_layout);
    }



    private void initMancheListView()
    {
        manches_listView = (ListView)findViewById(R.id.manches_listView);

        adapter = new RoundAdapter(this);
        manches_listView.setAdapter(adapter);

        //initDataList();
    }



}
