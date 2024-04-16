package com.example.jeucarte.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainDeJeuServiceTest {

    @Test
    public void givenMainDeJeuService_whenTakeTenCartes_ThenReturnListWithTenCartes() {
        MainDeJeuService mainDeJeuService = new MainDeJeuService();
        assertEquals(mainDeJeuService.takeTenCartes().size(), 10);
    }
}
