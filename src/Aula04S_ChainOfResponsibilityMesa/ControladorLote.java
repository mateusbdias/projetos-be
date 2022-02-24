package Aula04S_ChainOfResponsibilityMesa;

public class ControladorLote extends Controlador {
    @Override
    public void verificar(Artigo artigo) {
        if (artigo.getLote() >= 1000 && artigo.getLote() <= 2000) {
            artigo.setQualityLote(true);
        } else {
            artigo.setQualityLote(false);
            System.out.println("O lote está errado!");
        }
        if (this.getSeguinte() != null) {
            this.getSeguinte().verificar(artigo);
        }
    }
}
