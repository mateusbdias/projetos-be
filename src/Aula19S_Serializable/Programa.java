package Aula19S_Serializable;

import Aula19S_Serializable.model.Cachorro;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Programa {

    public static void main(String[] args) {

        List<Cachorro> cachorros = new ArrayList<>();

        Cachorro c1 = new Cachorro();
        c1.setNome("Pluto");
        c1.setRaca("Fila");
        c1.setIdade(3);
        c1.setEndereco("Av. Bento Gonçalves, 254");

        Cachorro c2 = new Cachorro("Tob", "Beagle", 2, "Rua das Hortências, 52");

        cachorros.add(c1);
        cachorros.add(c2);

        // Salvar a coleção cachorros em um arquivo
        FileOutputStream fo = null;

        try {
            fo = new FileOutputStream("src/Aula19S_Serializable/OutputFile.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(cachorros);
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Recuperar a coleção cachorros de um arquivo
        List<Cachorro> recuperaCachorros = null;
        FileInputStream fi = null;

        try {
            fi = new FileInputStream("src/Aula19S_Serializable/OutputFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            recuperaCachorros = (ArrayList)ois.readObject();
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        for (Cachorro c : recuperaCachorros) {
            System.out.println(
                    c.getNome() + " | " +
                    c.getRaca() + " | " +
                    c.getIdade() + " | " +
                    c.getEndereco()
            );
        }

    }

}
