package com.example.jeucarte.service;

import com.example.jeucarte.model.Carte;
import com.example.jeucarte.model.Desk;

import java.util.List;

public class MainDeJeuService {

    public List<Carte> takeTenCartes() {
        return new Desk().getCartes().stream().limit(10).toList();
    }
}
