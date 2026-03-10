package ro.ulbs.proiectaresoftware;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    }
}