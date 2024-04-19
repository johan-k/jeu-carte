package com.example.jeucarte.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DeskTest {
    @Test
    public void givenDesk_whenInitialization_ThenReturnDeskWith52Cartes() {
        Desk desk = new Desk();
        assertEquals(52, desk.getCartes().size());
    }

    @Test
    public void givenDesk_whenInitialization_ThenReturnDeskWith52CartesWithDifferentValues() {
        Desk desk = new Desk();
        List<Carte> cartes = desk.getCartes();
        for (int i = 0; i < cartes.size(); i++) {
            for (int j = i + 1; j < cartes.size(); j++) {
                assertNotEquals(cartes.get(i), cartes.get(j));
            }
        }
    }

    @Test
    public void givenDesk_when10CartesIsGiven_ThenReturnDeskWithoutTheseCartes() {
        Desk desk = new Desk();
        List<Carte> cartesDistributed = desk.distributeTenCartes();
        assertEquals(10, cartesDistributed.size());
        assertEquals(42, desk.getCartes().size());
    }

}
