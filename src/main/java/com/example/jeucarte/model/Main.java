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

    public void order(SortOrderCartes sortOrderCartes) {
        this.cartes.sort((carte1, carte2) -> {
            int couleurOrder1 = sortOrderCartes.getCouleurOrder().indexOf(carte1.getCouleur());
            int couleurOrder2 = sortOrderCartes.getCouleurOrder().indexOf(carte2.getCouleur());
            if (couleurOrder1 != couleurOrder2) {
                return couleurOrder1 - couleurOrder2;
            }
            int valeurOrder1 = sortOrderCartes.getValeurOrder().indexOf(carte1.getValeur());
            int valeurOrder2 = sortOrderCartes.getValeurOrder().indexOf(carte2.getValeur());
            return valeurOrder1 - valeurOrder2;
        });
    }
}
