package Aula05S_ProxyMesa.service;

import Aula05S_ProxyMesa.model.Musica;
import Aula05S_ProxyMesa.model.Usuario;

public interface Download {
    public void downloadMusica(Musica musica, Usuario usuario);
}
