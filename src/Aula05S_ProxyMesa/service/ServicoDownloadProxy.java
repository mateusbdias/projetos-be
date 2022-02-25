package Aula05S_ProxyMesa.service;

import Aula05S_ProxyMesa.model.Musica;
import Aula05S_ProxyMesa.model.Usuario;

public class ServicoDownloadProxy implements Download {

    @Override
    public void downloadMusica(Musica musica, Usuario usuario) {

        if (usuario.getTipoUsuario().equalsIgnoreCase("Premium")) {
            ServicoDownload servicoDownload = new ServicoDownload();
            System.out.println("Download autorizado");
            servicoDownload.downloadMusica(musica, usuario);
        } else {
            System.out.println("O usuário " + usuario.getUserID() + " não tem acesso a downloads");
        }

    }
}
