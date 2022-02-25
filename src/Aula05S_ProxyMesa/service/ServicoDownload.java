package Aula05S_ProxyMesa.service;

import Aula05S_ProxyMesa.model.Musica;
import Aula05S_ProxyMesa.model.Usuario;

public class ServicoDownload implements Download {

    @Override
    public void downloadMusica(Musica musica, Usuario usuario) {
        System.out.println("Música \"" + musica.getTitle() + "\", de " + musica.getArtist() +
                ", baixada com sucesso pelo usuário " + usuario.getUserID());
    }
}
