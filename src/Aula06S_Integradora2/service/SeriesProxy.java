package Aula06S_Integradora2.service;

import Aula06S_Integradora2.exceptions.SerieNaoHabilitadaException;

public class SeriesProxy implements InterfaceSeries {
    private int qtdViews = 0;

    public int getQtdViews() {
        return qtdViews;
    }

    public void setQtdViews(int qtdViews) {
        this.qtdViews = qtdViews;
    }

    @Override
    public String getSerie(String titulo) throws SerieNaoHabilitadaException {
        Series series = new Series();
        if (getQtdViews() >= 5) {
            throw new SerieNaoHabilitadaException("Excedido o número de reproduções permitidas");
        } else {
            setQtdViews(getQtdViews() + 1);
            return series.getSerie(titulo);
        }
    }
}
