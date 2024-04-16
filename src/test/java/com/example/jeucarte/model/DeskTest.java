package com.example.jeucarte.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeskTest {
    @Test
    public void givenDesk_whenInitialization_ThenReturnDeskWith52Cartes() {
        Desk desk = new Desk();
        assertEquals(52, desk.getCartes().length);
    }
}
