package Aula06S_Integradora2.service;

import Aula06S_Integradora2.exceptions.SerieNaoHabilitadaException;

public interface InterfaceSeries {

    String getSerie(String titulo) throws SerieNaoHabilitadaException;

}
