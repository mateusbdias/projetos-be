package Aula08S_Facade.service.impl;

import Aula08S_Facade.model.Product;

public class ApiProduct {

    public int discount(Product product) {

        if (product.getType().compareToIgnoreCase("Lata") == 0) {
            return 10;
        } else {
            return 0;
        }

    }

}
