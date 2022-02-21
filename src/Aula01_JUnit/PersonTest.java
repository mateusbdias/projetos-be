package Aula01_JUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PersonTest {
    private Person person = new Person("Mateus", "Dias",
            "mateus@mail.com", 27);

    @Test
    void exibirNomeTeste() {
        assertEquals("Dias, Mateus", person.exibirNome());
    }

    @Test
    void maiorIdade() {
        assertTrue(person.maiorIdade());
    }
}