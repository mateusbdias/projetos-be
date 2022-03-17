package Aula20S_Integradora6;

import Aula20S_Integradora6.model.Empresa;
import Aula20S_Integradora6.model.Funcionario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Instanciar empresa e funcionários
        Empresa emp1 = new Empresa("12.345.678/0001-90", "Indústrias Java S/A");

        Funcionario func1 = new Funcionario("John", "Doe", "98.765.432-1", 2500.0);
        Funcionario func2 = new Funcionario("Jane", "Doe", "135.248.790-00", 3500.0);
        Funcionario func3 = new Funcionario("Mark", "Smith", "23.456.880-4", 1500.0);
        Funcionario func4 = new Funcionario("Susan", "Boyle", "34.654.232-3", 2800.0);

        // Adicionar funcionários à empresa
        emp1.addFuncionario(func1);
        emp1.addFuncionario(func2);
        emp1.addFuncionario(func3);
        emp1.addFuncionario(func4);

        // Salvar a lista de funcionários em um arquivo
        FileOutputStream fo = null;

        try {
            fo = new FileOutputStream("src/Aula20S_Integradora6/OutputFile.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(emp1.getFuncionarios());
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Recuperar a lista de funcionários de um arquivo
        List<Funcionario> recuperaFuncionarios = null;
        FileInputStream fi = null;

        try {
            fi = new FileInputStream("src/Aula20S_Integradora6/OutputFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            recuperaFuncionarios = (ArrayList)ois.readObject();
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        for (Funcionario c : recuperaFuncionarios) {
            System.out.println(
                    c.getNome() + " | " +
                    c.getSobrenome() + " | " +
                    c.getDocumento() + " | " +
                    c.getSalario()
            );
        }

        FileInputStream inputStream;
        try {
            inputStream = new FileInputStream("src/Aula20S_Integradora6/empregados.txt");
            int i = inputStream.read();
            while (i != -1) {
                System.out.println((char)i);
                i = inputStream.read();
            }
            inputStream.close();
        }
        catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        catch (IOException e2) {
            e2.printStackTrace();
        }

    }

}
