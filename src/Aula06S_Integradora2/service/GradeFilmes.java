package Aula06S_Integradora2.service;

import Aula06S_Integradora2.model.Filme;

public class GradeFilmes implements InterfaceGradeFilmes {

    @Override
    public Filme getFilme(String titulo) {
        Filme filme = switch (titulo) {
            case "Harry Potter and the Prisoner of Azkaban" -> new Filme("Harry Potter and the Prisoner of Azkaban", "Brasil", "https://www.imdb.com/title/tt0304141/?ref_=nv_sr_srsg_6");
            case "Across the Universe" -> new Filme("Across the Universe", "Argentina", "https://www.imdb.com/title/tt0445922/?ref_=nv_sr_srsg_0");
            case "Ratatouille" -> new Filme("Ratatouille", "Colombia", "https://www.imdb.com/title/tt0382932/?ref_=nv_sr_srsg_0");
            default -> null;
        };
        return filme;
    }

}
