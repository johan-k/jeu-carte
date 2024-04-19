package com.example.jeucarte.model;

import java.util.ArrayList;
import java.util.List;

public class Desk {
    private List<Carte> cartes;

    public Desk() {
        cartes = new ArrayList<>(52);
        for (Couleur couleur : Couleur.values()) {
            for (Valeur valeur : Valeur.values()) {
                cartes.add(new Carte(couleur, valeur));
            }
        }
    }

    public List<Carte> getCartes() {
        return cartes;
    }

    public List<Carte> distributeTenCartes() {
        return null;
    }
}
