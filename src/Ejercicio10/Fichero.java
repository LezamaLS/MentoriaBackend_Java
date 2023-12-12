package Ejercicio10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Fichero {
    static void imprimirFicheroScanner(String archivo) {
        try (Scanner scanner = new Scanner(new File(archivo))) {
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer Fichero: " + e.getMessage());
        }
    }
}

