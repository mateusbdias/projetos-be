package Aula09S_Integradora3.test;

import Aula09S_Integradora3.model.Triangulo;
import Aula09S_Integradora3.model.Quadrado;
import Aula09S_Integradora3.service.FlyweightFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlyweightFactoryTest {

    @Test
    void getTrianguloComTamanho2() {

        Triangulo triangulo = FlyweightFactory.obterTriangulo("vermelho");
        triangulo.setTamanho(2);

        Triangulo triangulo1 = FlyweightFactory.obterTriangulo("vermelho");
        triangulo1.setTamanho(4);

        Triangulo triangulo2 = FlyweightFactory.obterTriangulo("azul");
        triangulo2.setTamanho(6);

        assertEquals(triangulo.getCor(), "vermelho");
        assertEquals(triangulo1.getTamanho(), 4);
        assertEquals(FlyweightFactory.trianguloMap.size() == 2, true);

    }

    @Test
    void getQuadrado() {

        Quadrado quadrado = FlyweightFactory.obterQuadrado(2);
        quadrado.setCor("vermelho");

        Quadrado quadrado1 = FlyweightFactory.obterQuadrado(2);
        quadrado1.setCor("azul");

        Quadrado quadrado2 = FlyweightFactory.obterQuadrado(4);
        quadrado2.setCor("preto");

        assertEquals(quadrado.getTamanho(), 2);
        assertEquals(quadrado1.getCor(), "azul");
        assertEquals(FlyweightFactory.quadradoMap.size() == 2, true);

    }

}
