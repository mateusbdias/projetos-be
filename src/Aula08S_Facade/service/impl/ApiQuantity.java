package Aula08S_Facade.service.impl;

public class ApiQuantity {

    public int discount(int qty) {

        if (qty > 12) {
            return 15;
        } else {
            return 0;
        }

    }

}
