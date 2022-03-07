package Aula07S_Flyweight;

import Aula07S_Flyweight.factory.ComputerFactory;
import Aula07S_Flyweight.model.Computer;

public class Program {

    public static void main(String[] args) {

        ComputerFactory factory = new ComputerFactory();
        Computer mac1 = factory.getComputer(16, 500);
        Computer windows = factory.getComputer(2, 256);
        Computer mac2 = factory.getComputer(16, 500);
        Computer windows2 = factory.getComputer(8, 1024);
        Computer windows3 = factory.getComputer(8, 1024);

        System.out.println(mac1.toString());
        System.out.println(mac2.toString());
        System.out.println(windows.toString());
        System.out.println(windows2.toString());
        System.out.println(windows3.toString());

    }

}
