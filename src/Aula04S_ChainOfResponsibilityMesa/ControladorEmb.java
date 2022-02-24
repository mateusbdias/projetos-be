package Aula04S_ChainOfResponsibilityMesa;

public class ControladorEmb extends Controlador {
    @Override
    public void verificar(Artigo artigo){
        if (artigo.getEmbalagem().equalsIgnoreCase("saudável") ||
                artigo.getEmbalagem().equalsIgnoreCase("quase saudável")) {
            artigo.setQualityEmb(true);
        } else {
            artigo.setQualityEmb(false);
            System.out.println("A embalagem está errada!");
        }
    }
}
