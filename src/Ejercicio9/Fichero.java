package Ejercicio9;

import java.io.FileReader;
import java.io.IOException;

class Fichero {
    static void imprimirFicheroPorCaracter(String archivo) {
        try (FileReader reader = new FileReader(archivo)) {
            int caracter;
            while ((caracter = reader.read()) != -1) {
                System.out.print((char) caracter);
            }
        } catch (IOException e) {
            System.err.println("Error al leer Fichero: " + e.getMessage());
        }
    }
}


