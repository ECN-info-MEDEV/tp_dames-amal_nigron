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
public class Case {

    public boolean blanc;
    public Pion pion;

    public Case() {
        this.blanc = false;
    }
    
    public Case(boolean blanc) {
        this.blanc = blanc;
    }

    public void setBlanc() {
        this.blanc = true;
    }

    public boolean isBlanc() {
        return blanc;
    }

    public boolean isNoir() { return !blanc;}
    
    public void setPion(Pion pion) {
        this.pion = pion;
    }
}
