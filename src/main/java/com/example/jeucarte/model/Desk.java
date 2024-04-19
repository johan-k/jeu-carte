package com.example.jeucarte.model;

import java.util.ArrayList;
import java.util.List;

public class Desk {
    public static final int NUMBER_OF_GAME_CARTES = 52;
    private List<Carte> cartes;

    public Desk() {
        cartes = new ArrayList<>(NUMBER_OF_GAME_CARTES);
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
        List<Carte> toDistribute = new ArrayList<>(cartes.subList(0, 10));
        cartes.subList(0, 10).clear();
        return toDistribute;
    }

    public void shuffle() {
        List<Carte> shuffled = new ArrayList<>();
        while (!cartes.isEmpty()) {
            int index = (int) (Math.random() * cartes.size());
            shuffled.add(cartes.get(index));
            cartes.remove(index);
        }
        cartes = shuffled;
    }
}
