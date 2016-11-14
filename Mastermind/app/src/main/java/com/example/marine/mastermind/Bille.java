package com.example.marine.mastermind;

/**
 * Created by Marine on 14/11/2016.
 */

public enum Bille {

        Bleue(R.color.billeBleue),
        Rouge(R.color.billeRouge),
        Verte(R.color.billeVerte),
        Jaune(R.color.billeJaune),
        Rose(R.color.billeRose),
        Orange(R.color.billeOrange);

        private int colorId;

        Bille(int colorId) {
            this.colorId = colorId;
        }

        public int getColorId() {
            return colorId;
        }

        public static Bille getRandom() {
            return values()[(int) (Math.random() * values().length)];
        }

}
