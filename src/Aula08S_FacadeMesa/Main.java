package Aula08S_FacadeMesa;

import Aula08S_FacadeMesa.model.Viagem;
import Aula08S_FacadeMesa.service.impl.FacadeTurismo;

public class Main {

    public static void main(String[] args) {

        FacadeTurismo facade = new FacadeTurismo();

        Viagem viagem1 = new Viagem("2022-05-23", "2022-05-30", "São Paulo", "Sevilla");
        Viagem viagem2 = new Viagem("2022-09-10", "2022-09-20", "Los Angeles", "Paris");

        System.out.println(facade.buscar(viagem1));
        System.out.println(facade.buscar(viagem2));

    }

}
