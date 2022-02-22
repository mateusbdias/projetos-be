package Aula02S_TemplateMethod;

public abstract class Funcionario {
    private String nome;
    private String sobrenome;
    private String numConta;

    public Funcionario(String nome, String sobrenome, String numConta) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numConta = numConta;
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

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void pagamentoSalario() {
        double quantia;
        quantia = calculoSalario();
        impressaoRecibo(quantia);
        depositoSalario(quantia);
    }

    public abstract double calculoSalario();

    public abstract void impressaoRecibo(double quantia);

    public void depositoSalario(double quantia) {
        System.out.println("Foi depositado em conta o valor de " + quantia);
    }
}
