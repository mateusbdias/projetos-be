package Aula06S_Integradora2.model;

public class Filme {
    private String titulo;
    private String pais;
    private String linkReproducao;

    public Filme(String titulo, String pais, String linkReproducao) {
        this.titulo = titulo;
        this.pais = pais;
        this.linkReproducao = linkReproducao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLinkReproducao() {
        return linkReproducao;
    }

    public void setLinkReproducao(String linkReproducao) {
        this.linkReproducao = linkReproducao;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", pais='" + pais + '\'' +
                ", linkReproducao='" + linkReproducao + '\'' +
                '}';
    }
}
