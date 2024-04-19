package com.example.jeucarte.controller;

import com.example.jeucarte.model.Carte;
import com.example.jeucarte.service.MainDeJeuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/main-de-jeu")
public class MainDeJeuController {

    @Autowired
    private MainDeJeuService mainDeJeuService;

    @GetMapping("/start")
    public List<List<Carte>> startGame() {
        return mainDeJeuService.mainDeJeuTrieeEtNonTriee();
    }
}
