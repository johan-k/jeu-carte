package com.example.jeucarte.model;

public class Carte {
    private Couleur couleur;
    private Valeur valeur;

    public Carte(Couleur couleur, Valeur valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public Valeur getValeur() {
        return valeur;
    }

    @Override
    public String toString() {
        return valeur + " de " + couleur;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        return couleur.equals(((Carte) other).getCouleur()) && valeur.equals(((Carte) other).getValeur());
    }
}
