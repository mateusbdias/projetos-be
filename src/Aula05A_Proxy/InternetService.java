package Aula05A_Proxy;

public class InternetService implements IConexionInternet {


    @Override
    public void conectarCom(String url) {
        System.out.println("Conectando com "+url);
    }
}
