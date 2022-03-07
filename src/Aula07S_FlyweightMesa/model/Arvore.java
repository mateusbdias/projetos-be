package Aula07S_FlyweightMesa.model;

public class Arvore {

    private int altura;
    private int largura;
    private String cor;
    private String tipo;
    private static int contador;

    public Arvore(String tipo) {
        this.tipo = tipo.toLowerCase();

        if (tipo.equalsIgnoreCase("ornamental")) {
            this.altura = 200;
            this.largura = 400;
            this.cor = "verde";
        } else if (tipo.equalsIgnoreCase("frutifera")) {
            this.altura = 500;
            this.largura = 300;
            this.cor = "vermelho";
        } else if (tipo.equalsIgnoreCase("florifera")) {
            this.altura = 100;
            this.largura = 200;
            this.cor = "azul";
        }
        contador++;
        System.out.println("Contagem: " + contador);
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Arvore{" +
                "altura=" + altura +
                ", largura=" + largura +
                ", cor='" + cor + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
