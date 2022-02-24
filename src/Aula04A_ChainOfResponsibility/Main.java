package Aula04A_ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Usuario handler = new Deputado().setProximoUsuario(new Ministro().setProximoUsuario(new Presidente()));
        Documento doc1 = new Documento("E-mail festa de gabinete", 1);
        Documento doc2 = new Documento("Projeto de Lei", 2);
        Documento doc3 = new Documento("Declaração de guerra", 3);

        System.out.println("TENTATIVA 1 - Leitura do doc1:");
        handler.lerDocumento(doc1);
        System.out.println("==============================");
        System.out.println("TENTATIVA 2 - Leitura do doc2:");
        handler.lerDocumento(doc2);
        System.out.println("==============================");
        System.out.println("TENTATIVA 3 - Leitura do doc3:");
        handler.lerDocumento(doc3);
    }
}
