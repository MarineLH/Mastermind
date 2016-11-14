package com.example.marine.mastermind;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.marine.mastermind.Bille;
import com.example.marine.mastermind.BilleResultat;
import com.example.marine.mastermind.Manche;

/**
 * Created by algil on 09/01/16.
 */
public class RoundAdapter extends ArrayAdapter<Manche> {

    public RoundAdapter(Context context) {
        super(context, 0);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        Manche manche = getItem(position);

        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.manche_layout, null);

        } else {
            view = convertView;
        }

        TextView numRound = (TextView) view.findViewById(R.id.numeroManche_textView);
        numRound.setText(String.valueOf(manche.getNumManche()));

        ImageButton hole1 =  (ImageButton) view.findViewById(R.id.bille1_imageBoutton);
        ImageButton hole2 =  (ImageButton) view.findViewById(R.id.bille2_imageBoutton);
        ImageButton hole3 =  (ImageButton) view.findViewById(R.id.bille3_imageBoutton);
        ImageButton hole4 =  (ImageButton) view.findViewById(R.id.bille4_imageBoutton);

        hole1.setColorFilter(getColorBall(view, manche.getBilles()[0]));
        hole2.setColorFilter(getColorBall(view, manche.getBilles()[1]));
        hole3.setColorFilter(getColorBall(view, manche.getBilles()[2]));
        hole4.setColorFilter(getColorBall(view, manche.getBilles()[3]));

        ImageView result1 =  (ImageView) view.findViewById(R.id.resultat1_imageView);
        ImageView result2 =  (ImageView) view.findViewById(R.id.resultat2_imageView);
        ImageView result3 =  (ImageView) view.findViewById(R.id.resultat3_imageView);
        ImageView result4 =  (ImageView) view.findViewById(R.id.resultat4_imageView);

        result1.setColorFilter(getColorResult(view, manche.getBillesResultats()[0]));
        result2.setColorFilter(getColorResult(view, manche.getBillesResultats()[1]));
        result3.setColorFilter(getColorResult(view, manche.getBillesResultats()[2]));
        result4.setColorFilter(getColorResult(view, manche.getBillesResultats()[3]));

        return view;
    }

    private int getColorBall(View view, Bille bille) {
        int colorId = R.color.billeVide;
        if (bille != null) {
            colorId = bille.getColorId();
        }
        return view.getResources().getColor(colorId);
    }

    private int getColorResult(View view, BilleResultat billeResultat) {
        int colorId = R.color.billeVide;
        if (billeResultat != null) {
            colorId = billeResultat.getColorId();
        }
        return view.getResources().getColor(colorId);
    }
}
