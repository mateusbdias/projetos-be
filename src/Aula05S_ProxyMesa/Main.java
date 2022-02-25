package Aula05S_ProxyMesa;

import Aula05S_ProxyMesa.model.Usuario;
import Aula05S_ProxyMesa.model.Musica;
import Aula05S_ProxyMesa.service.Download;
import Aula05S_ProxyMesa.service.ServicoDownloadProxy;

public class Main {
    public static void main(String[] args) {
        Usuario user1 = new Usuario(12345, "Premium");
        Usuario user2 = new Usuario(4398, "Free");

        Musica m1 = new Musica("Yellow", "Coldplay", "Parachutes");
        Musica m2 = new Musica("Hey Jude", "The Beatles", "1");

        Download download = new ServicoDownloadProxy();

        download.downloadMusica(m1, user1);
        download.downloadMusica(m2, user2);
        System.out.println("===========================");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(m1);
        System.out.println(m2);
    }
}
