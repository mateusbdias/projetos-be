package Aula08S_Facade.service;

import Aula08S_Facade.model.Card;
import Aula08S_Facade.model.Product;

public interface IFacadeDiscount {

    public int discount(Card card, Product product, int qty);

}
