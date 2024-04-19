package com.example.jeucarte.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void whenInitializingNewMainWithCartes_thenReturnMainWithCartes() {
        List<Carte> cartes = new ArrayList<>();
        cartes.add(new Carte(Couleur.COEUR, Valeur.AS));
        cartes.add(new Carte(Couleur.COEUR, Valeur.DEUX));
        Main main = new Main(cartes);
        assertEquals(main.getCartes().size(),cartes.size());
    }
}
