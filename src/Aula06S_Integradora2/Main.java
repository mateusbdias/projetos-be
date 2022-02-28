package Aula06S_Integradora2;

import Aula06S_Integradora2.exceptions.FilmeNaoHabilitadoException;
import Aula06S_Integradora2.exceptions.SerieNaoHabilitadaException;
import Aula06S_Integradora2.model.IP;
import Aula06S_Integradora2.service.GradeFilmesProxy;
import Aula06S_Integradora2.service.SeriesProxy;

public class Main {
    public static void main(String[] args) {
        // Exercício Filmes
        GradeFilmesProxy filmesProxy = new GradeFilmesProxy();
        filmesProxy.setIp(new IP(123, 209, 1, 120));

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

        // Exercício Séries
        SeriesProxy seriesProxy = new SeriesProxy();

        try {
            System.out.println(seriesProxy.getSerie("Friends"));
        } catch (SerieNaoHabilitadaException e) {
            System.out.println(e);
        }

        try {
            System.out.println(seriesProxy.getSerie("Brooklyn Nine-Nine"));
        } catch (SerieNaoHabilitadaException e) {
            System.out.println(e);
        }

        try {
            System.out.println(seriesProxy.getSerie("Modern Family"));
        } catch (SerieNaoHabilitadaException e) {
            System.out.println(e);
        }

        try {
            System.out.println(seriesProxy.getSerie("Gilmore Girls"));
        } catch (SerieNaoHabilitadaException e) {
            System.out.println(e);
        }

        try {
            System.out.println(seriesProxy.getSerie("Seinfeld"));
        } catch (SerieNaoHabilitadaException e) {
            System.out.println(e);
        }

        try {
            System.out.println(seriesProxy.getSerie("The X Files"));
        } catch (SerieNaoHabilitadaException e) {
            System.out.println(e);
        }

        try {
            System.out.println(seriesProxy.getSerie("Lost"));
        } catch (SerieNaoHabilitadaException e) {
            System.out.println(e);
        }
    }
}
