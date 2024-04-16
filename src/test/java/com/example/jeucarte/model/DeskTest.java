package com.example.jeucarte.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DeskTest {
    @Test
    public void givenDesk_whenInitialization_ThenReturnDeskWith52Cartes() {
        Desk desk = new Desk();
        assertEquals(52, desk.getCartes().length);
    }

    @Test
    public void givenDesk_whenInitialization_ThenReturnDeskWith52CartesWithDifferentValues() {
        Desk desk = new Desk();
        Carte[] cartes = desk.getCartes();
        for (int i = 0; i < cartes.length; i++) {
            for (int j = i + 1; j < cartes.length; j++) {
                assertNotEquals(cartes[i], cartes[j]);
            }
        }
    }
}
