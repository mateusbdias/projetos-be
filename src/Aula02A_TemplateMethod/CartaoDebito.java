package Aula02A_TemplateMethod;

public class CartaoDebito extends Cartao{
    double saldoDisp;

    public CartaoDebito(String numero, String codSeguranca, double saldoDisp) {
        super(numero, codSeguranca);
        this.saldoDisp = saldoDisp;
    }

    public double getSaldoDisp() {
        return saldoDisp;
    }

    public void setSaldoDisp(double saldoDisp) {
        this.saldoDisp = saldoDisp;
    }

    @Override
    public String toString() {
        return "CartaoDebito{" +
                "numero=" + super.getNumero() +
                ", codSeguranca=" + super.getCodSeguranca() +
                ", dataValidade=" + dataValidade +
                ", saldoDisp=" + saldoDisp +
                '}';
    }
}
