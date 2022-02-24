package Aula04S_ChainOfResponsibilityMesa;

public class Artigo {
    private String nome;
    private int lote;
    private int peso;
    private String embalagem;
    private boolean qualityLote;
    private boolean qualityPeso;
    private boolean qualityEmb;

    public Artigo(String nome, int lote, int peso, String embalagem) {
        this.nome = nome;
        this.lote = lote;
        this.peso = peso;
        this.embalagem = embalagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public boolean isQualityLote() {
        return qualityLote;
    }

    public void setQualityLote(boolean qualityLote) {
        this.qualityLote = qualityLote;
    }

    public boolean isQualityPeso() {
        return qualityPeso;
    }

    public void setQualityPeso(boolean qualityPeso) {
        this.qualityPeso = qualityPeso;
    }

    public boolean isQualityEmb() {
        return qualityEmb;
    }

    public void setQualityEmb(boolean qualityEmb) {
        this.qualityEmb = qualityEmb;
    }
}
