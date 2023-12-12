package Ejercicio6;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe tus lineas de texto. [Escribe 'terminar' para finalizar y crear");
        StringBuilder texto = new StringBuilder();
        try {
            String linea;
            while (!(linea = reader.readLine()).equalsIgnoreCase("terminar")) {
                texto.append(linea).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error en lectura de tu linea " + e.getMessage());
        }
        Fichero.escribirFichero("EjerciciosFichero.txt", texto.toString());
    }
}
