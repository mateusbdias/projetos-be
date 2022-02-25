package Aula05S_ProxyMesa.model;

public class Usuario {
    private int userID;
    private String tipoUsuario;

    public Usuario(int userID, String tipoUsuario) {
        this.userID = userID;
        this.tipoUsuario = tipoUsuario;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "userID=" + userID +
                ", tipoUsuario='" + tipoUsuario + '\'' +
                '}';
    }
}
