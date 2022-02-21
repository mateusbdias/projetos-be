package Aula02A_TemplateMethod;

public class ProcessadorCredito extends Processador{
    @Override
    public void autorizarPagamento(Cartao cartao, double valor){
        if(valor <= ((CartaoCredito)cartao).getLimite()){
            System.out.println("Pagamento autorizado!");
            ((CartaoCredito)cartao).setLimite(((CartaoCredito) cartao).getLimite() - valor);
            ((CartaoCredito)cartao).setSaldoUtilizado(((CartaoCredito) cartao).getSaldoUtilizado() + valor);
            System.out.println("Novo limite: " + ((CartaoCredito)cartao).getLimite());
        } else {
            System.out.println("Pagamento não autorizado!");
        }
    }
}
