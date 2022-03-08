package Aula08S_Facade.service.impl;

import Aula08S_Facade.model.Card;

public class ApiCard {

    public int discount(Card card) {

        if (card.getBank().compareToIgnoreCase("Star Bank") == 0) {
            return 20;
        } else {
            return 0;
        }

    }

}
