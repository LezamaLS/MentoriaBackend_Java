package Ejercicio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe tus lineas de texto. [Escribe 'terminar' para finalizar y agregarlas");
        StringBuilder texto = new StringBuilder();
        try {
            String linea;
            while (!(linea = reader.readLine()).equalsIgnoreCase("terminar")) {
                texto.append(linea).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error en lectura de tu linea " + e.getMessage());
        }
        Fichero.insertarAFichero("EjerciciosFichero.txt", texto.toString());
    }
}