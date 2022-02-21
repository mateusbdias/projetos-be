package Aula01S_JUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadradoTest {
    Figura quad1 = new Quadrado(2.2);

    @Test
    void imprimirQuadrado(){
        System.out.println(quad1.toString());
    }

    @Test
    void testePerimetro(){
        assertEquals(4 * ((Quadrado)quad1).getLado(), ((Quadrado)quad1).calcularPerimetro());
        System.out.println("Passou no teste");
    }
}