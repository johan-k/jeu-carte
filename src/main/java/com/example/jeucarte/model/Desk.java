package com.example.jeucarte.model;

public class Desk {
    private Carte[] cartes;

    public Desk() {
        cartes = new Carte[52];
        int i = 0;
        for (Couleur couleur : Couleur.values()) {
            for (Valeur valeur : Valeur.values()) {
                cartes[i] = new Carte(couleur, valeur);
                i++;
            }
        }
    }

    public Carte[] getCartes() {
        return cartes;
    }
}
