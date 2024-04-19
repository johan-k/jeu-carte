package com.example.jeucarte.service;

import com.example.jeucarte.model.Carte;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MainDeJeuServiceTest {
    @Test
    public void whenInitializingNewGame_thenReturnMainDeJeuTrieeAndNonTriee() {
        MainDeJeuService service = new MainDeJeuService();
        List<List<Carte>> mainTrieeNonTriee = service.mainDeJeuTrieeEtNonTriee();
        assertEquals(2, mainTrieeNonTriee.size());
        assertEquals(mainTrieeNonTriee.get(0).size(), mainTrieeNonTriee.get(1).size());
        assertNotEquals(mainTrieeNonTriee.get(0), mainTrieeNonTriee.get(1));
    }
}
