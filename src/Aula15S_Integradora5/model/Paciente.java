package Aula15S_Integradora5.model;

public class Paciente {

    private Integer id;
    private String nome;
    private String sobrenome;
    private String rg;
    private String dataCadastro;
    private Integer idEndereco;

    public Paciente() {
    }

    public Paciente(Integer id, String nome, String sobrenome, String rg, String dataCadastro, Integer idEndereco) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.dataCadastro = dataCadastro;
        this.idEndereco = idEndereco;
    }

    public Paciente(String nome, String sobrenome, String rg, String dataCadastro, Integer idEndereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.dataCadastro = dataCadastro;
        this.idEndereco = idEndereco;
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", rg='" + rg + '\'' +
                ", dataCadastro='" + dataCadastro + '\'' +
                ", idEndereco=" + idEndereco +
                '}';
    }
}
