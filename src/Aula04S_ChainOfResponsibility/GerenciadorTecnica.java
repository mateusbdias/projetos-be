package Aula04S_ChainOfResponsibility;

public class GerenciadorTecnica extends Gerenciador {
    @Override
    public void verificar(Mail mail) {
        if ((mail.getDestino().equalsIgnoreCase("tecnica@colmeia.com")) ||
                (mail.getAssunto().equalsIgnoreCase("Técnico"))) {
            System.out.println("Enviado ao Departamento Técnico");
        } else if (this.getSeguinte() != null) {
            this.getSeguinte().verificar(mail);
        }
    }
}
