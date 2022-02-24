package Aula04S_ChainOfResponsibilityMesa;

public class CheckQuality {
    private Controlador inicial;

    public CheckQuality() {
        this.inicial = new ControladorLote();
        Controlador ctrlPeso = new ControladorPeso();
        Controlador ctrlEmb = new ControladorEmb();

        inicial.setSeguinte(ctrlPeso);
        ctrlPeso.setSeguinte(ctrlEmb);
    }

    public void verificar(Artigo artigo) {
        inicial.verificar(artigo);
        if (artigo.isQualityLote() && artigo.isQualityPeso() && artigo.isQualityEmb()) {
            System.out.println("O artigo atendeu a todos os critérios e foi aceito!");
        } else if (!artigo.isQualityLote() && !artigo.isQualityPeso() && !artigo.isQualityEmb()) {
            System.out.println("O artigo não atendeu a nenhum critério e foi rejeitado!");
        } else {
            System.out.println("Há critérios que não foram atendidos, por favor verificar o artigo.");
        }
    }
}
