package Aula06S_Integradora2.service;

import Aula06S_Integradora2.exceptions.FilmeNaoHabilitadoException;
import Aula06S_Integradora2.model.Filme;
import Aula06S_Integradora2.model.IP;

public class GradeFilmesProxy implements InterfaceGradeFilmes {

    private IP ip;

    public IP getIp() {
        return ip;
    }

    public void setIp(IP ip) {
        this.ip = ip;
    }

    @Override
    public Filme getFilme(String titulo) throws FilmeNaoHabilitadoException {
        Filme filme = new GradeFilmes().getFilme(titulo);
        if (!(this.getIp().getPais().equalsIgnoreCase(filme.getPais()))) {
            throw new FilmeNaoHabilitadoException("O filme \"" + titulo + "\" não está disponível em seu país");
        } else {
            return filme;
        }
    }

}
