package com.example.jeucarte.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarteTest {
    @Test
    public void givenCouleurAndValeur_whenDescribingCarteAsPique_ThenReturnAsDePique() {
        Carte carte = new Carte(Couleur.PIQUE, Valeur.AS);
        String expected = "AS de PIQUE";
        String actual = carte.toString();
        assertEquals(expected, actual);
    }
}
