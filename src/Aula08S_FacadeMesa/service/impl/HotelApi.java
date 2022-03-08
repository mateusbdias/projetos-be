package Aula08S_FacadeMesa.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HotelApi {

    // Procura os hoteis de acordo com o horário
    public String buscarHoteis(String dataPartida, String dataRetorno, String destino) {
        List<String> hoteis = Arrays.asList("Hotel Fazenda", "Hotel Minuano", "Hotel California", "Hotel Cecil");
        Random r = new Random();
        return hoteis.get(r.nextInt(hoteis.size()));
    }

}
