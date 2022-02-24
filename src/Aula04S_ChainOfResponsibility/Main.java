package Aula04S_ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        CheckMail verificaMail = new CheckMail();

        verificaMail.verificar(new Mail("mail@mail.com",
                "tecnica@colmeia.com", "Reclamação"));

        verificaMail.verificar(new Mail("mbd@mail.com",
                "gerencia@dh.com.py", "Oportunidade"));

        verificaMail.verificar(new Mail("mbd@mail.com",
                "john@colmeia.com", "Gerencia"));
    }
}
