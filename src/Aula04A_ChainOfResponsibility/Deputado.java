package Aula04A_ChainOfResponsibility;

public class Deputado extends Usuario {
    @Override
    public void lerDocumento(Documento documento) {
        if (documento.getTipo() == 1) {
            System.out.println("Sou Deputado e posso ler este documento RESERVADO");
            this.getProximoUsuario().lerDocumento(documento);
        } else if (super.getProximoUsuario() != null) {
            this.getProximoUsuario().lerDocumento(documento);
        }
    }
}
