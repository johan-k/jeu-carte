package com.example.jeucarte.model;

import java.util.Arrays;
import java.util.List;

public class Main {
    private List<Carte> cartes;
    
    public Main(Desk desk) {
        this.cartes = desk.getCartes().stream().limit(10).toList();
    }
}
