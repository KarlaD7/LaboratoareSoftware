package proiectaresoftware;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(c);
        }
        String alfabet = sb.toString();

        System.out.println("Litere mici: " + alfabet.toLowerCase());
        System.out.println("Litere mari: " + alfabet.toUpperCase());
        System.out.println("---");

        List<String> rezultat = new ArrayList<>();
        Pattern pattern = Pattern.compile("[aeiou][^aeiou]*");
        Matcher matcher = pattern.matcher(alfabet);

        while (matcher.find()) {
            rezultat.add(matcher.group());
        }

        for (int i = 0; i < rezultat.size(); i++) {
            System.out.println("array[" + i + "] = \"" + rezultat.get(i) + "\"");
        }

        // 9.3.1
        System.out.println("\n--- Rezultate Problema 9.3.1 ---");

        Random random = new Random();

        List<Integer> numere = IntStream.range(0, 10)
                .map(i -> 5 + random.nextInt(21))
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Lista initiala: " + numere);

        // a) Calculati suma elementelor folosind java streams
        int suma = numere.stream()
                .reduce(0, Integer::sum);
        System.out.println("a) Suma elementelor: " + suma);

        // b) Calculati valoarea maxima si minima in lista
        int max = numere.stream().max(Comparator.naturalOrder()).orElse(0);
        int min = numere.stream().min(Comparator.naturalOrder()).orElse(0);
        System.out.println("b) Max: " + max + ", Min: " + min);

        //c) Parcurgeti lista si creati o alta lista prin pastrarea doar a elementelor in intervalul [10..20].
        List<Integer> listaFiltrata = numere.stream()
                .filter(n -> n >= 10 && n <= 20)
                .collect(Collectors.toList());
        System.out.println("c) Lista filtrata [10..20]: " + listaFiltrata);

        // d) Transformarea (maparea) listei de Integer in lista de Double
        List<Double> listaDouble = numere.stream()
                .map(n -> n.doubleValue())
                .collect(Collectors.toList());
        System.out.println("d) Lista Double: " + listaDouble);

        // e) Verificarea existentei valorii 12 in lista
        boolean gasit12 = numere.stream()
                .anyMatch(n -> n == 12);
        System.out.println("e) Contine valoarea 12? " + (gasit12 ? "Da" : "Nu"));

    }
}