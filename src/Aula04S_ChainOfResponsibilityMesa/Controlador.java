package Aula04S_ChainOfResponsibilityMesa;

public abstract class Controlador {
    protected Controlador controladorSeguinte;

    public Controlador getSeguinte() {
        return controladorSeguinte;
    }

    public void setSeguinte(Controlador controladorSeguinte) {
        this.controladorSeguinte = controladorSeguinte;
    }

    public abstract void verificar(Artigo artigo);
}
