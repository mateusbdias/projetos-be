package Aula06S_Integradora2.service;

public class Series implements InterfaceSeries {

    @Override
    public String getSerie(String titulo) {
        return "Link para \"" + titulo + "\": www." + titulo.replace(" ", "").toLowerCase() + ".com";
    }

}
