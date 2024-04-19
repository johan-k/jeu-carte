package com.example.jeucarte.service;

import com.example.jeucarte.model.Carte;
import com.example.jeucarte.model.Desk;
import com.example.jeucarte.model.Main;
import com.example.jeucarte.model.SortOrderCartes;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MainDeJeuService {

    public List<List<Carte>> mainDeJeuTrieeEtNonTriee() {
        Desk desk = new Desk();
        desk.shuffle();
        Main main = new Main(desk.distributeTenCartes());
        List<Carte> mainNonTriee = new ArrayList<>(main.getCartes());
        main.order(new SortOrderCartes());
        List<Carte> mainTriee = main.getCartes();
        return List.of(mainNonTriee, mainTriee);
    }
}
