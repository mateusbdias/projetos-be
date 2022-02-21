package Aula01S_JUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {
    Figura circ1 = new Circulo(2.5);

    @Test
    void imprimirCirculo(){
        System.out.println(circ1.toString());
    }

    @Test
    void testePerimetro(){
        assertEquals(2 * Math.PI * ((Circulo)circ1).getRaio(), ((Circulo)circ1).calcularPerimetro());
        System.out.println("Passou no teste");
    }
}