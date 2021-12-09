/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.tp_dames.amal_nigron;

/**
 *
 * @author qtngr
 */
public class Plateau {
    
    /**
     * Notre plateau
     */
    private Case[][] cases;
    
    /**
     * Taille du plateau
     */
    public int taille;
    
    public Plateau(int taille) {
        this.taille = taille;
        this.cases = new Case[taille][taille];
        boolean doitEtreBlanc;
        for (int y = 0; y < this.taille; y++) {
            doitEtreBlanc = (y%2 == 0);
            for (int x = 0; x < this.taille; x++) {
                if (doitEtreBlanc) {
                    this.cases[y][x] = new Case(doitEtreBlanc);
                    // Changement valeur pour la prochaine case
                    doitEtreBlanc = false;
                } else {
                    this.cases[y][x] = new Case(doitEtreBlanc);
                    doitEtreBlanc = true;
                }
            }
        }
    }
}
