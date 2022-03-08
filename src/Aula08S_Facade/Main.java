package Aula08S_Facade;

import Aula08S_Facade.model.Card;
import Aula08S_Facade.model.Product;
import Aula08S_Facade.service.impl.FacadeDiscount;

public class Main {

    public static void main(String[] args) {

        FacadeDiscount facade = new FacadeDiscount();
        Card card = new Card("11223344", "Star Bank");
        Product product = new Product("Lasanha", "lata");
        System.out.println("Desconto concedido: " + facade.discount(card, product, 15) + "%");

    }

}
