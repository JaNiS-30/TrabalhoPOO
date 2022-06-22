package br.com.rioleao.model;

import java.io.Serializable;

public final class ComunidadeRioLeao implements Serializable {
    private float dinheiro;
    private int numRefri;
    private int numCerveja;
    private int numSalg;
    private int numFichaChurrasco;
    private float valRefri;
    private float valCerveja;
    private float valSalg;
    private float valChurrasco;
    

    public float getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getNumRefri() {
        return numRefri;
    }

    public void setNumRefri(int numRefri) {
        this.numRefri = numRefri;
    }

    public int getNumCerveja() {
        return numCerveja;
    }

    public void setNumCerveja(int numCerveja) {
        this.numCerveja = numCerveja;
    }

    public int getNumSalg() {
        return numSalg;
    }

    public void setNumSalg(int numSalg) {
        this.numSalg = numSalg;
    }

    public int getNumFichaChurrasco() {
        return numFichaChurrasco;
    }

    public void setNumFichaChurrasco(int numFichaChurrasco) {
        this.numFichaChurrasco = numFichaChurrasco;
    }

    public float getValRefri() {
        return valRefri;
    }

    public void setValRefri(float valRefri) {
        this.valRefri = valRefri;
    }

    public float getValCerveja() {
        return valCerveja;
    }

    public void setValCerveja(float valCerveja) {
        this.valCerveja = valCerveja;
    }

    public float getValSalg() {
        return valSalg;
    }

    public void setValSalg(float valSalg) {
        this.valSalg = valSalg;
    }

    public float getValChurrasco() {
        return valChurrasco;
    }

    public void setValChurrasco(float valChurrasco) {
        this.valChurrasco = valChurrasco;
    }
    
    
}
