package com.example.marine.mastermind;

/**
 * Created by Marine on 14/11/2016.
 */

public class Manche {

    private int numManche;
    private Bille[] billes;
    private BilleResultat[] billesResultats;

    public Manche(int numManche) {
        this.numManche = numManche;
        this.billes = new Bille[4];
        this.billesResultats = new BilleResultat[4];
    }

    public int getNumManche() {
        return this.numManche;
    }

    public Bille[] getBilles() {
        return this.billes;
    }

    public void addBille(Bille bille) {
        if (billes[0] == null) {
            billes[0] = bille;

        } else if (billes[1] == null) {
            billes[1] = bille;

        } else if (billes[2] == null) {
            billes[2] = bille;

        } else if (billes[3] == null) {
            billes[3] = bille;
        }
    }

    public void addBilleResultat(BilleResultat billeresultat) {
        if (billesResultats[0] == null) {
            billesResultats[0] = billeresultat;

        } else if (billesResultats[1] == null) {
            billesResultats[1] = billeresultat;

        } else if (billesResultats[2] == null) {
            billesResultats[2] = billeresultat;

        } else if (billesResultats[3] == null) {
            billesResultats[3] = billeresultat;
        }
    }

    public BilleResultat[] getBillesResultats() {
        return billesResultats;
    }
}
