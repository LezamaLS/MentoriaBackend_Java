package Ejercicio7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Fichero {
    static void insertarAFichero(String archivo, String texto) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
            writer.write(texto);
            System.out.println("Lineas insertadas en el fichero");
        } catch (IOException e) {
            System.err.println("Error al escribir Fichero " + e.getMessage());
        }
    }
}





