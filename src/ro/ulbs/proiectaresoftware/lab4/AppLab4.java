package ro.ulbs.proiectaresoftware.lab4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AppLab4{
    public static void main(String[] args){
        HashMap<String, Integer>varste=new HashMap<>();
        varste.put("Ioan", 21);
        varste.put("Maria", 22);
        varste.put("Victor", 20);
        varste.put("Simina", 20);
        varste.put("Marius", 21);
        varste.put("Mihai", 21);
        varste.put("Daniela", 23);
        Map<String, String> adrese = Map.of("Ioan", "Sibiu", "Maria", "Bucuresti", "Victor",
                "Cluj","Simina", "Alba-Iulia","Marius", "Medias", "Mihai", "Cisnadie","Daniela", "Sibiu");
        System.out.println(varste);

        varste.put("Vlad", 19);
        varste.put("Iulia", 19);

        System.out.println(varste);

        Tanar t = new Tanar("Vlad", 19, "Necunoscut");
        System.out.println("Exemplu obiect Tanar: " + t);

        HashMap<String, Tanar> tineri = new HashMap<>();
        Iterator<String> itr = varste.keySet().iterator();
        while(itr.hasNext()){
            String nume = itr.next();
            Integer v = varste.get(nume);
            String adresa = adrese.getOrDefault(nume, "Adresa necunoscuta");

            tineri.put(nume, new Tanar(nume, v, adresa));
        }

        System.out.println();
        for (String nume : tineri.keySet()) {
            System.out.println("Nume: " + nume + " | Date: " + tineri.get(nume));
        }
    }

}