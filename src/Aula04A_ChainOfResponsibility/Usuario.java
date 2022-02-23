package Aula04A_ChainOfResponsibility;

public abstract class Usuario {
    private Usuario proximoUsuario;

    public abstract void lerDocumento(Documento documento);

    public Usuario getProximoUsuario() {
        return proximoUsuario;
    }

    public Usuario setProximoUsuario(Usuario proximoUsuario) {
        this.proximoUsuario = proximoUsuario;
        return this;
    }
}
