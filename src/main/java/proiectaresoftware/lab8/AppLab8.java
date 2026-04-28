package proiectaresoftware.lab8;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppLab8 {

    public static void main(String[] args) {
        String input = "laborator8_input.xlsx";

        // ex 8.5.1
        System.out.println("--- Citire Date (8.5.1) ---");
        citireConsola(input);

        // ex 8.5.2
        System.out.println("\n--- Generare Output 2 (Media prin Java) ---");
        generareMediaJava(input, "laborator8_output2.xlsx");

        // ex 8.5.3
        System.out.println("--- Generare Output 3 (Media prin Formule) ---");
        generareMediaFormula(input, "laborator8_output3.xlsx");
    }

    // 8.5.1:
    public static void citireConsola(String numeFisier) {
        try (FileInputStream fis = new FileInputStream(new File(numeFisier));
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                for (Cell cell : row) {
                    afisareCelula(cell);
                }
                System.out.println();
            }
        } catch (IOException e) { e.printStackTrace(); }
    }

    // 8.5.2:
    public static void generareMediaJava(String inputPath, String outputPath) {
        try (FileInputStream fis = new FileInputStream(new File(inputPath));
             Workbook workbook = new XSSFWorkbook(fis);
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                int lastCellNum = row.getLastCellNum();
                Cell mediaCell = row.createCell(lastCellNum);

                if (row.getRowNum() == 0) {
                    mediaCell.setCellValue("Media (Java)");
                } else {
                    double suma = 0;
                    int count = 0;
                    for (int i = 3; i <= 5; i++) {
                        Cell c = row.getCell(i);
                        if (c != null && c.getCellType() == CellType.NUMERIC) {
                            suma += c.getNumericCellValue();
                            count++;
                        }
                    }
                    if (count > 0) mediaCell.setCellValue(suma / count);
                }
            }
            workbook.write(fos);
            System.out.println("Fișier generat: " + outputPath);
        } catch (IOException e) { e.printStackTrace(); }
    }

    // 8.5.3:
    public static void generareMediaFormula(String inputPath, String outputPath) {
        try (FileInputStream fis = new FileInputStream(new File(inputPath));
             Workbook workbook = new XSSFWorkbook(fis);
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                int lastCellNum = row.getLastCellNum();
                Cell formulaCell = row.createCell(lastCellNum);

                if (row.getRowNum() == 0) {
                    formulaCell.setCellValue("Media (Formula)");
                } else {
                    int rowNum = row.getRowNum() + 1;
                    String formula = "AVERAGE(D" + rowNum + ":F" + rowNum + ")";
                    formulaCell.setCellFormula(formula); }
            }
            workbook.write(fos);
            System.out.println("Fișier generat: " + outputPath);
        } catch (IOException e) { e.printStackTrace(); }
    }

    private static void afisareCelula(Cell cell) {
        switch (cell.getCellType()) {
            case STRING: System.out.print(cell.getStringCellValue() + "\t"); break;
            case NUMERIC: System.out.print(cell.getNumericCellValue() + "\t"); break;
            default: System.out.print(" \t");
        }
    }
}