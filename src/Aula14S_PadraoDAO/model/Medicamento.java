package Aula14S_PadraoDAO.model;

public class Medicamento {

    private Integer id;
    private String nome;
    private String laboratorio;
    private Integer qtd;
    private Double preco;

    public Medicamento() {
    }

    public Medicamento(Integer id, String nome, String laboratorio, Integer qtd, Double preco) {
        this.id = id;
        this.nome = nome;
        this.laboratorio = laboratorio;
        this.qtd = qtd;
        this.preco = preco;
    }

    public Medicamento(String nome, String laboratorio, Integer qtd, Double preco) {
        this.nome = nome;
        this.laboratorio = laboratorio;
        this.qtd = qtd;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", laboratorio='" + laboratorio + '\'' +
                ", qtd=" + qtd +
                ", preco=" + preco +
                '}';
    }
}
