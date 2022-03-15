package Aula17S_Checkpoint1.model;

public class Filial {

    private Integer id;
    private String nome;
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private boolean cincoEstrelas;

    public Filial() {
    }

    public Filial(Integer id, String nome, String rua, String numero, String cidade, String estado, boolean cincoEstrelas) {
        this.id = id;
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cincoEstrelas = cincoEstrelas;
    }

    public Filial(String nome, String rua, String numero, String cidade, String estado, boolean cincoEstrelas) {
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cincoEstrelas = cincoEstrelas;
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

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isCincoEstrelas() {
        return cincoEstrelas;
    }

    public void setCincoEstrelas(boolean cincoEstrelas) {
        this.cincoEstrelas = cincoEstrelas;
    }

    @Override
    public String toString() {
        return "Filial{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", cincoEstrelas=" + cincoEstrelas +
                '}';
    }
}
