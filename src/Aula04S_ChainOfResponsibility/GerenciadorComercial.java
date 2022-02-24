package Aula04S_ChainOfResponsibility;

public class GerenciadorComercial extends Gerenciador {
    @Override
    public void verificar(Mail mail) {
        if ((mail.getDestino().equalsIgnoreCase("comercial@colmeia.com")) ||
                (mail.getAssunto().equalsIgnoreCase("Comercial"))) {
            System.out.println("Enviado ao Departamento Comercial");
        } else if (this.getSeguinte() != null) {
            this.getSeguinte().verificar(mail);
        }
    }
}
