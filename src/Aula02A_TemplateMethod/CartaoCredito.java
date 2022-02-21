package Aula02A_TemplateMethod;

public class CartaoCredito extends Cartao{
    private double limite;
    private double saldoUtilizado;

    public CartaoCredito(String numero, String codSeguranca, double limite, double saldoUtilizado) {
        super(numero, codSeguranca);
        this.limite = limite;
        this.saldoUtilizado = saldoUtilizado;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldoUtilizado() {
        return saldoUtilizado;
    }

    public void setSaldoUtilizado(double saldoUtilizado) {
        this.saldoUtilizado = saldoUtilizado;
    }

    @Override
    public String toString() {
        return "CartaoCredito{" +
                "numero=" + super.getNumero() +
                ", codSeguranca=" + super.getCodSeguranca() +
                ", dataValidade=" + dataValidade +
                ", limite=" + limite +
                ", saldoUtilizado=" + saldoUtilizado +
                '}';
    }
}
