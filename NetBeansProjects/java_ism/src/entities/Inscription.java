/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Mr Demba Ndiaye
 */
public class Inscription {
    private int annee;
    
    public Inscription() {
    }

    public Inscription(int annee) {
        this.annee = annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getAnnee() {
        return annee;
    }
    
    
}
