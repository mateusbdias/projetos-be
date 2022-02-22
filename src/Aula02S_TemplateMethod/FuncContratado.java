package Aula02S_TemplateMethod;

public class FuncContratado extends Funcionario {
    private double valorHora;
    private int horas;

    public FuncContratado(String nome, String sobrenome, String numConta, double valorHora, int horas) {
        super(nome, sobrenome, numConta);
        this.valorHora = valorHora;
        this.horas = horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public double calculoSalario() {
        return valorHora * horas;
    }

    @Override
    public void impressaoRecibo(double quantia) {
        System.out.println("Gerado recibo digital referente à quantia de " +
                quantia);
    }
}
