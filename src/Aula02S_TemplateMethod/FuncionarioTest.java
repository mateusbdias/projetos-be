package Aula02S_TemplateMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    @Test
    void calculos() {
        Funcionario func1 = new FuncEfetivo("Odair", "Antunes",
                "55201-X", 3000.0, 1000.0, 500.0);
        func1.pagamentoSalario();
        assertEquals(2500.0, func1.calculoSalario());

        Funcionario func2 = new FuncContratado("Marlene", "Peixoto",
                "3456-0", 50.0, 50);
        func2.pagamentoSalario();
        assertEquals(2500.0, func2.calculoSalario());
    }
}