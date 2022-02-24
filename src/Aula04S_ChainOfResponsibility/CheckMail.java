package Aula04S_ChainOfResponsibility;

public class CheckMail {
    private Gerenciador inicial;

    public CheckMail() {
        this.inicial = new GerenciadorGerencia();
        Gerenciador comercial = new GerenciadorComercial();
        Gerenciador tecnica = new GerenciadorTecnica();
        Gerenciador spam = new GerenciadorSpam();

        inicial.setSeguinte(comercial);
        comercial.setSeguinte(tecnica);
        tecnica.setSeguinte(spam);
    }

    public void verificar(Mail mail){
        inicial.verificar(mail);
    }
}
