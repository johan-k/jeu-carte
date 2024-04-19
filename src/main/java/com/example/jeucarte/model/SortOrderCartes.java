package com.example.jeucarte.model;

import java.util.*;

public class SortOrderCartes {
    private List<Couleur> couleurOrder;
    private List<Valeur> valeurOrder;

    public SortOrderCartes() {
        List<Couleur> couleurs = new ArrayList<>(Arrays.asList(Couleur.values()));
        List<Valeur> valeurs = new ArrayList<>(Arrays.asList(Valeur.values()));
        Collections.shuffle(couleurs);
        Collections.shuffle(valeurs);
        this.couleurOrder = couleurs;
        this.valeurOrder = valeurs;
    }

    public List<Couleur> getCouleurOrder() {
        return couleurOrder;
    }

    public List<Valeur> getValeurOrder() {
        return valeurOrder;
    }
}
