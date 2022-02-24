package Aula04S_ChainOfResponsibility;

public class GerenciadorGerencia extends Gerenciador {
    @Override
    public void verificar(Mail mail) {
        if ((mail.getDestino().equalsIgnoreCase("gerencia@colmeia.com")) ||
        (mail.getAssunto().equalsIgnoreCase("Gerência"))) {
            System.out.println("Enviado ao Departamento Gerencial");
        } else if (this.getSeguinte() != null) {
            this.getSeguinte().verificar(mail);
        }
    }
}
