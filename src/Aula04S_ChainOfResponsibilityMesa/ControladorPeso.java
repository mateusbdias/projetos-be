package Aula04S_ChainOfResponsibilityMesa;

public class ControladorPeso extends Controlador {
    @Override
    public void verificar(Artigo artigo) {
        if (artigo.getPeso() >= 1200 && artigo.getPeso() <= 1300) {
            artigo.setQualityPeso(true);
        } else {
            artigo.setQualityPeso(false);
            System.out.println("O peso está errado!");
        }
        if (this.getSeguinte() != null) {
            this.getSeguinte().verificar(artigo);
        }
    }
}
