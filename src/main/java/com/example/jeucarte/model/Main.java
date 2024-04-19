package com.example.jeucarte.model;

import java.util.List;

public class Main {
    private List<Carte> cartes;
    
    public Main(List<Carte> cartes) {
        this.cartes = cartes;
    }

    public List<Carte> getCartes() {
        return this.cartes;
    }
}
