package com.example.marine.mastermind;

/**
 * Created by Marine on 14/11/2016.
 */

public enum BilleResultat {



        Blanc(R.color.billeBlanche),
        Noir(R.color.billeNoire);

        private int colorId;

        BilleResultat(int colorId) {
            this.colorId = colorId;
        }

        public int getColorId() {
            return colorId;
        }
    }


