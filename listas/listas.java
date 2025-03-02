package listas;

import java.util.ArrayList;
import java.util.List;


public class listas {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Joao");
        list.add("marinalva");
        list.add(2, "marco");


        list.remove("Joao");

        for (String x : list) {

            System.out.println(x);
            System.out.println(list.size());


        }

        list.removeIf(x -> x.charAt(0) == 'm');


        for (String x : list) {

            System.out.println(x);
            System.out.println(list.size());


        }
    }
}
