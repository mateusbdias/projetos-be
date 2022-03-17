package Aula19S_SerializableMesa;

import Aula19S_SerializableMesa.model.Contato;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Instanciar contatos e acrescentar à lista
        List<Contato> contatos = new ArrayList<>();

        Contato contato1 = new Contato("Tim Cook", "tim@apple.com", "(212) 555-5555");
        Contato contato2 = new Contato();
        contato2.setNome("Bill Gates");
        contato2.setEmail("wgates@microsoft.com");
        contato2.setTelefone("(801) 123-4567");
        Contato contato3 = new Contato("Jeff Bezos", "jeff@amazon.com", "(450) 789-0123");

        contatos.add(contato1);
        contatos.add(contato2);
        contatos.add(contato3);

        // Salvar a lista de contatos em um arquivo
        FileOutputStream fo = null;

        try {
            fo = new FileOutputStream("src/Aula19S_SerializableMesa/OutputFile.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(contatos);
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Recuperar a lista de contatos de um arquivo
        List<Contato> recuperaContatos = null;
        FileInputStream fi = null;

        try {
            fi = new FileInputStream("src/Aula19S_SerializableMesa/OutputFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            recuperaContatos = (ArrayList)ois.readObject();
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        for (Contato c : recuperaContatos) {
            System.out.println(
                    c.getNome() + " | " +
                    c.getEmail() + " | " +
                    c.getTelefone()
            );
        }

    }

}
