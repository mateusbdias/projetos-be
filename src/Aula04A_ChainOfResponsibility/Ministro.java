package Aula04A_ChainOfResponsibility;

public class Ministro extends Usuario {
    @Override
    public void lerDocumento(Documento documento) {
        if (documento.getTipo() == 1) {
            System.out.println("Sou Ministro e posso ler este documento RESERVADO");
            this.getProximoUsuario().lerDocumento(documento);
        } else if (documento.getTipo() == 2) {
            System.out.println("Sou Ministro e posso ler este documento SECRETO");
            this.getProximoUsuario().lerDocumento(documento);
        } else if (super.getProximoUsuario() != null) {
            this.getProximoUsuario().lerDocumento(documento);
        }
    }
}
