package Aula02A_TemplateMethod;

import java.time.LocalDate;
import java.time.Period;

public abstract class Processador {
    public void processarPagamento(Cartao cartao, double valor){
        validarDataVencimento(cartao);
        boolean valid = validarDataVencimento(cartao);
        if(valid) {
            System.out.println("Cartão válido!");
            autorizarPagamento(cartao, valor);
        } else {
            System.out.println("Cartão fora da validade!");
        }
    }

    public abstract void autorizarPagamento(Cartao cartao, double valor);

    public boolean validarDataVencimento(Cartao cartao){
        return !Period.between(LocalDate.now(), cartao.getDataValidade()).isNegative();
    }
}
