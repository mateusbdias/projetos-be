package Aula08S_Facade.service.impl;

import Aula08S_Facade.model.Card;
import Aula08S_Facade.model.Product;
import Aula08S_Facade.service.IFacadeDiscount;

public class FacadeDiscount implements IFacadeDiscount {

    // Armazenar as variáveis para as instâncias
    private ApiCard apiCard;
    private ApiProduct apiProduct;
    private ApiQuantity apiQuantity;

    public FacadeDiscount() {
        apiCard = new ApiCard();
        apiProduct = new ApiProduct();
        apiQuantity = new ApiQuantity();
    }

    // Utilização das APIs para os cálculos dos descontos
    public int discount(Card card, Product product, int qty) {

        int discount = 0;
        discount += apiCard.discount(card);
        discount += apiProduct.discount(product);
        discount += apiQuantity.discount(qty);
        return discount;

    }
}
