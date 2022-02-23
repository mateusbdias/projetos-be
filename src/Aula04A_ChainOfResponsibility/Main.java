package Aula04A_ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Usuario dep = new Deputado();
        Usuario min = new Ministro();
        Usuario pres = new Presidente();

        dep.setProximoUsuario(min.setProximoUsuario(pres));
        Documento doc1 = new Documento("E-mail festa de gabinete", 1);
        Documento doc2 = new Documento("Projeto de Lei", 2);
        Documento doc3 = new Documento("Declaração de guerra", 3);

        System.out.println("TENTATIVA 1: Leitura do doc3 pelo Deputado:");
        dep.lerDocumento(doc3);
        System.out.println("===========================================");
        System.out.println("TENTATIVA 2: Leitura do doc2 pelo Deputado:");
        dep.lerDocumento(doc2);
        System.out.println("===========================================");
        System.out.println("TENTATIVA 3: Leitura do doc1 pelo Deputado:");
        dep.lerDocumento(doc1);
        System.out.println("===========================================");
        System.out.println("TENTATIVA 4: Leitura do doc3 pelo Ministro:");
        min.lerDocumento(doc3);
        System.out.println("===========================================");
        System.out.println("TENTATIVA 5: Leitura do doc1 pelo Presidente:");
        pres.lerDocumento(doc1);
        System.out.println("===========================================");
        System.out.println("TENTATIVA 6: Leitura do doc1 pelo Ministro:");
        min.lerDocumento(doc1);
    }
}
