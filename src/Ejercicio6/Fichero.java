package Ejercicio6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Fichero {
    static void escribirFichero(String archivo, String texto) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            writer.write(texto);
            System.out.println("Fichero creado con tus lineas");
        } catch (IOException e) {
            System.err.println("Error al escribir Fichero " + e.getMessage());
        }
    }
}

