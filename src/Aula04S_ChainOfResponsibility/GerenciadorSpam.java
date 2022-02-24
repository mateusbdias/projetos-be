package Aula04S_ChainOfResponsibility;

public class GerenciadorSpam extends Gerenciador {
    @Override
    public void verificar(Mail mail) {
        System.out.println("Marcado como SPAM");
    }
}
