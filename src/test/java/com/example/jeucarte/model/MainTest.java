package com.example.jeucarte.model;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class MainTest {
    @Test
    public void whenInitializingNewMainWithCartes_thenReturnMainWithCartes() {
        List<Carte> cartes = new ArrayList<>();
        cartes.add(new Carte(Couleur.COEUR, Valeur.AS));
        cartes.add(new Carte(Couleur.COEUR, Valeur.DEUX));
        Main main = new Main(cartes);
        assertEquals(main.getCartes().size(),cartes.size());
    }

    @Test
    public void givenMainAndOrder_whenOrdering_thenReturnMainOrdered() {
        List<Carte> cartes = new ArrayList<>();
        cartes.add(new Carte(Couleur.COEUR, Valeur.AS));
        cartes.add(new Carte(Couleur.COEUR, Valeur.DEUX));
        cartes.add(new Carte(Couleur.PIQUE, Valeur.AS));
        cartes.add(new Carte(Couleur.TREFLE, Valeur.TROIS));
        cartes.add(new Carte(Couleur.PIQUE, Valeur.ROI));
        cartes.add(new Carte(Couleur.CARREAU, Valeur.AS));
        cartes.add(new Carte(Couleur.CARREAU, Valeur.DEUX));
        cartes.add(new Carte(Couleur.PIQUE, Valeur.SEPT));
        cartes.add(new Carte(Couleur.CARREAU, Valeur.DAME));
        cartes.add(new Carte(Couleur.PIQUE, Valeur.VALET));

        Main main = new Main(cartes);

        List<Carte> cartesOrdered = new ArrayList<>();
        cartesOrdered.add(new Carte(Couleur.CARREAU, Valeur.AS));
        cartesOrdered.add(new Carte(Couleur.CARREAU, Valeur.DAME));
        cartesOrdered.add(new Carte(Couleur.CARREAU, Valeur.DEUX));
        cartesOrdered.add(new Carte(Couleur.COEUR, Valeur.AS));
        cartesOrdered.add(new Carte(Couleur.COEUR, Valeur.DEUX));
        cartesOrdered.add(new Carte(Couleur.TREFLE, Valeur.TROIS));
        cartesOrdered.add(new Carte(Couleur.PIQUE, Valeur.VALET));
        cartesOrdered.add(new Carte(Couleur.PIQUE, Valeur.SEPT));
        cartesOrdered.add(new Carte(Couleur.PIQUE, Valeur.ROI));
        cartesOrdered.add(new Carte(Couleur.PIQUE, Valeur.AS));

        SortOrderCartes sortOrderCartes = Mockito.mock(SortOrderCartes.class);
        when(sortOrderCartes.getCouleurOrder()).thenReturn(Arrays.asList(Couleur.CARREAU, Couleur.COEUR, Couleur.TREFLE, Couleur.PIQUE));
        when(sortOrderCartes.getValeurOrder()).thenReturn(Arrays.asList(Valeur.VALET, Valeur.HUIT, Valeur.SEPT, Valeur.ROI, Valeur.TROIS, Valeur.AS, Valeur.SIX, Valeur.NEUF, Valeur.DAME, Valeur.DIX, Valeur.DEUX, Valeur.CINQ, Valeur.QUATRE));

        main.order(sortOrderCartes);
        assertEquals(cartes,cartesOrdered);
    }
}
