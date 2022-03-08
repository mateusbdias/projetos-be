package Aula08S_FacadeMesa.service.impl;

import Aula08S_FacadeMesa.model.Viagem;
import Aula08S_FacadeMesa.service.IFacadeTurismo;

public class FacadeTurismo implements IFacadeTurismo {

    private VooApi vooApi;
    private HotelApi hotelApi;

    public FacadeTurismo() {
        vooApi = new VooApi();
        hotelApi = new HotelApi();
    }

    public Viagem buscar(Viagem viagem) {
        viagem.setLinhaAerea(vooApi.buscarVoos(viagem.getDataPartida(), viagem.getDataRetorno(), viagem.getOrigem(), viagem.getDestino()));
        viagem.setHotel(hotelApi.buscarHoteis(viagem.getDataPartida(), viagem.getDataRetorno(), viagem.getDestino()));
        return viagem;
    }
}
