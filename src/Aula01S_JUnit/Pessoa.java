package Aula01S_JUnit;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    // Atributos
    private String nome;
    private String sobrenome;
    LocalDate idade;
    List<String> colecao = new ArrayList<>();

    // Construtor


    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    // Getters & Setters
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

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public List<String> getColecao() {
        return colecao;
    }

    public void setColecao(List<String> colecao) {
        this.colecao = colecao;
    }

    public List<String> adicionarNome(Pessoa pessoa){
        // Lógica
        int var = pessoa.getNome().length();
        int idade = pessoa.calcularIdade();
        if(var >= 5 && idade >= 18){
            colecao.add(pessoa.getNome());
            System.out.println(colecao);
        }
        return null;
    }

    // Cálculo da idade
    public int calcularIdade(){
        int idade = Period.between(this.idade, LocalDate.of(2022, 02, 21)).getYears();
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
