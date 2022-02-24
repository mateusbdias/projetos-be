package Aula04S_ChainOfResponsibilityMesa;

public class Main {
    public static void main(String[] args) {
        CheckQuality verificador = new CheckQuality();

        verificador.verificar(new Artigo("Biscoitos", 1200, 1200, "saudável"));
        System.out.println("=========================");
        verificador.verificar(new Artigo("Tomates", 900, 1400, "danificada"));
        System.out.println("=========================");
        verificador.verificar(new Artigo("Café", 1100, 1400, "quase saudável"));
        System.out.println("=========================");
    }
}
