package Ejercicio8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Fichero {
    static void imprimirFichero(String archivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer Fichero: " + e.getMessage());
        }
    }
}

