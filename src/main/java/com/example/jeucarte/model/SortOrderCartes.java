package com.example.jeucarte.model;

import java.util.*;

public class SortOrderCartes {
    private List<Couleur> couleurOrder;
    private List<Valeur> valeurOrder;

    public SortOrderCartes() {
        this.couleurOrder = new ArrayList<>();
        this.valeurOrder = new ArrayList<>();
    }

    public List<Couleur> getCouleurOrder() {
        return couleurOrder;
    }

    public List<Valeur> getValeurOrder() {
        return valeurOrder;
    }
}
