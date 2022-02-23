package Aula04A_ChainOfResponsibility;

public class Presidente extends Usuario {
    @Override
    public void lerDocumento(Documento documento) {
        if (documento.getTipo() == 1) {
            System.out.println("Sou Presidente e posso ler este documento RESERVADO");
        } else if (documento.getTipo() == 2) {
            System.out.println("Sou Presidente e posso ler este documento SECRETO");
        } else if (documento.getTipo() == 3) {
            System.out.println("Sou Presidente e posso ler este documento MUITO SECRETO");
        }
    }
}
