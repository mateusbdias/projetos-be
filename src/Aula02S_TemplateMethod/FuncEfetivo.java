package Aula02S_TemplateMethod;

public class FuncEfetivo extends Funcionario {
    private double salarioBase;
    private double descontos;
    private double bonificacoes;

    public FuncEfetivo(String nome, String sobrenome, String numConta, double salarioBase, double descontos, double bonificacoes) {
        super(nome, sobrenome, numConta);
        this.salarioBase = salarioBase;
        this.descontos = descontos;
        this.bonificacoes = bonificacoes;
    }

    @Override
    public double calculoSalario() {
        return salarioBase + bonificacoes - descontos;
    }

    @Override
    public void impressaoRecibo(double quantia) {
        System.out.println("Gerado recibo em papel referente à quantia de " +
                quantia);
    }
}
