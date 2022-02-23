package Aula03S_Integradora1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    Funcionario func1, func2;
    Afiliado afi1, afi2, afi3;
    Estagiario estag1, estag2;

    @BeforeEach
    public void doBefore() {
        func1 = new Funcionario("Pedro", 2);
        func1.vender(2);

        func2 = new Funcionario("Maria",1);
        func2.vender(1);

        afi1 = new Afiliado("Ramon");
        afi1.vender(4);

        afi2 = new Afiliado("Paulo");
        afi2.vender(1);

        afi3 = new Afiliado("José");

        func1.addAfiliado(afi1);

        estag1 = new Estagiario("João");
        estag1.vender(5);

        estag2 = new Estagiario("Luiza");
        estag2.vender(11);
    }

    @Test
    public void mostrarVendedores() {
        func1.mostrarCategoria();
        func2.mostrarCategoria();
        afi1.mostrarCategoria();
        afi2.mostrarCategoria();
        afi3.mostrarCategoria();
        estag1.mostrarCategoria();
        estag2.mostrarCategoria();
    }

}