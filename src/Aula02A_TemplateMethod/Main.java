package Aula02A_TemplateMethod;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cartao cartaoCred = new CartaoCredito("12345678", "123",
                2000.00, 0.00);
        Cartao cartaoDeb = new CartaoDebito("98765432", "090",
                3000.00);

        cartaoCred.setDataValidade(LocalDate.of(2024, 2, 1));
        cartaoDeb.setDataValidade(LocalDate.of(2022, 1, 1));

        Processador procCred = new ProcessadorCredito();
        Processador procDeb = new ProcessadorDebito();

        System.out.println(cartaoCred);
        System.out.println(cartaoDeb);

        System.out.println("========================");
        System.out.println("Pagamento Crédito:");
        procCred.processarPagamento(cartaoCred, 200.00);
        System.out.println("========================");
        System.out.println("Pagamento Débito:");
        procDeb.processarPagamento(cartaoDeb, 200.00);
        System.out.println("========================");

        System.out.println(cartaoCred);
        System.out.println(cartaoDeb);
    }
}
