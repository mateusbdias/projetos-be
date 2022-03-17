package Aula20S_Integradora6.model;

import java.io.Serializable;

public class Funcionario implements Serializable {

    private String nome;
    private String sobrenome;
    private String documento;
    private Double salario;

    public Funcionario(String nome, String sobrenome, String documento, Double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.documento = documento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
