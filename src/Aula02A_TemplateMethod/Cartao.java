package Aula02A_TemplateMethod;

import java.time.LocalDate;
import java.time.Period;

public abstract class Cartao {
    private String numero;
    private String codSeguranca;
    LocalDate dataValidade;

    public Cartao(String numero, String codSeguranca) {
        this.numero = numero;
        this.codSeguranca = codSeguranca;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodSeguranca() {
        return codSeguranca;
    }

    public void setCodSeguranca(String codSeguranca) {
        this.codSeguranca = codSeguranca;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
}
