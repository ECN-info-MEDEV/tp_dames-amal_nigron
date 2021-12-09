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
public class Pion {

    private int coordX;
    private int coordY;
    public String typePion;
    public boolean blanc;
    public boolean selectionne;

    /*
    typePion: mort, pion, dame
    blanc: si false, représente joueur 2
     */
    public Pion(int coordX, int coordY, String typePion, boolean blanc) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.typePion = typePion;
        this.blanc = blanc;
        this.selectionne = false;
    }

    public int getX() {
        return coordX;
    }

    public int getY() {
        return coordY;
    }

    public String getTypePion() {
        return typePion;
    }

    public void setTypePion(String typePion) {
        this.typePion = typePion;
    }

    public String toString() {
        if (this.typePion.equals("pion")) {
            if (blanc) {
                return "b";
            } else {
                return "n";
            }
        } else {
            if (this.typePion.equals("dame")) { //une Dame
                if (blanc) {
                    return "B";
                } else {
                    return "N";
                }
            } else {
                return "x";
            }
        }
    }

}
