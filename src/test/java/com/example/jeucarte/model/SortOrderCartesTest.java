package com.example.jeucarte.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortOrderCartesTest {
    @Test
    public void givenListCouleursAndValeurs_whenInitializingSortOrderCartes_thenReturnCouleurAndValeurOrder() {
        SortOrderCartes sortOrderCartes = new SortOrderCartes();
        assertEquals(sortOrderCartes.getCouleurOrder().size(), Couleur.values().length);
        assertEquals(sortOrderCartes.getValeurOrder().size(), Valeur.values().length);
    }
}
