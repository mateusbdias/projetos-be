package Aula02A_TemplateMethod;

public class ProcessadorDebito extends Processador{
    @Override
    public void autorizarPagamento(Cartao cartao, double valor){
        if(valor <= ((CartaoDebito)cartao).getSaldoDisp()){
            System.out.println("Pagamento autorizado!");
            ((CartaoDebito)cartao).setSaldoDisp(((CartaoDebito) cartao).getSaldoDisp() - valor);
            System.out.println("Novo saldo: " + ((CartaoDebito)cartao).getSaldoDisp());
        } else {
            System.out.println("Pagamento não autorizado!");
        }
    }
}
