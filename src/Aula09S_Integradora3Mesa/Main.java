package Aula09S_Integradora3Mesa;

import Aula09S_Integradora3Mesa.model.Roupa;
import Aula09S_Integradora3Mesa.service.FlyweightFactory;

public class Main {

    public static void main(String[] args) {

        FlyweightFactory factory = new FlyweightFactory();

        Roupa roupa1 = factory.getRoupa("xs", "calça", true, false);
        Roupa roupa2 = factory.getRoupa("s", "calça", true, true);
        Roupa roupa3 = factory.getRoupa("xs", "camisa", true, false);
        Roupa roupa4 = factory.getRoupa("m", "calça", false, true);
        Roupa roupa5 = factory.getRoupa("s", "bermuda", true, false);
        Roupa roupa6 = factory.getRoupa("xs", "calça", true, false);

        System.out.println(roupa1);
        System.out.println(roupa2);
        System.out.println(roupa3);
        System.out.println(roupa4);
        System.out.println(roupa5);
        System.out.println(roupa6);

    }

}
