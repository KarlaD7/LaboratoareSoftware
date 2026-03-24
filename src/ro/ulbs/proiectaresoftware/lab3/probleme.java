package ro.ulbs.proiectaresoftware.lab3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class probleme {
    public static void main(String[] args) {
        String fileNameIn = "in.txt";
        String fileNameOut = "out.txt";

        try {
            List<String> linii = Files.readAllLines(Paths.get(fileNameIn));
            List<String> rezultatFinal = new ArrayList<>();

            // a) parcurgeti fiecare linie din lista si adaugati inca un new line (caracterul \n) pentru fiecare sfarsit de linie, apoi
            //afisati
            for (String linie : linii) {
                String modifA = linie + "\n";
                System.out.print(modifA);
                rezultatFinal.add(modifA);
            }

           //b) parcurgeti fiecare linie si adaugati un newline (caracterul \n) pentru fiecare caracter punct ( .) si apoi afisati
            for (String linie : linii) {
                String[] parti = linie.split("\\.");
                for (String parte : parti) {
                    if (!parte.trim().isEmpty()) {
                        String modifB = parte.trim() + ".\n";
                        System.out.print(modifB);
                        rezultatFinal.add(modifB);
                    }
                }
            }
            //c) salvati in fisierul out.txt rezultatul modificarilor de la a) si b)
            Files.write(Paths.get(fileNameOut), rezultatFinal);
            System.out.println("\n>>> out.txt ");
        }
            catch (IOException e){
                System.out.println("Eroare");
                e.printStackTrace();
            }

    }
}