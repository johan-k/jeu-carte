package com.example.jeucarte.controller;

import com.example.jeucarte.service.MainDeJeuService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class MainDeJeuControllerTest {

    @Mock
    private MainDeJeuService mainDeJeuService;

    @InjectMocks
    private MainDeJeuController mainDeJeuController;

    @Test
    public void givenMainDeJeuTrieeAndNonTriee_whenInitializingMainDeJeuTrieeEtNonTriee_thenReturnMainDeJeuTrieeAndNonTriee() {

        mainDeJeuController.startGame();
        verify(mainDeJeuService, times(1)).mainDeJeuTrieeEtNonTriee();
    }
}
