package Ejercicio2;

import java.util.Scanner;

public class CalculadorMedia {
    private int[] numeros;
    private int cantidad;

    public CalculadorMedia(){
        this.numeros = new int[99];
        this.cantidad = 0;
    }
    public void ingresarNumeros(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero #" + i);
            int num = scanner.nextInt();
            numeros[i] = num;
            cantidad++;
        }
    }
    public double calcMedia(){
        int sumatoria = 0;
        double media;
        for (int i = 0; i < cantidad; i++) {
            sumatoria += numeros[i];
        }
        media = sumatoria/cantidad;
        return media;
    }
    public int calcMayorMedia(double media){
        int mayoresMedia = 0;
        for (int numero : numeros) {
            if (numero > media) {
                mayoresMedia++;
            }
        }
        return mayoresMedia;
    }
}
