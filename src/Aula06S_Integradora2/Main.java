package Aula06S_Integradora2;

import Aula06S_Integradora2.exceptions.FilmeNaoHabilitadoException;
import Aula06S_Integradora2.model.IP;
import Aula06S_Integradora2.service.GradeFilmesProxy;

public class Main {
    public static void main(String[] args) {
        GradeFilmesProxy filmesProxy = new GradeFilmesProxy();
        filmesProxy.setIp(new IP(93, 209, 1, 120));

        try {
            System.out.println(filmesProxy.getFilme("Across the Universe").getLinkReproducao());
        } catch (FilmeNaoHabilitadoException e) {
            System.out.println(e);
        }

        try {
            System.out.println(filmesProxy.getFilme("Ratatouille").getLinkReproducao());
        } catch (FilmeNaoHabilitadoException e) {
            System.out.println(e);
        }

    }
}
