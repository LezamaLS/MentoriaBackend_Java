package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        CalculadorMedia calculador = new CalculadorMedia();
        System.out.println("Ingresa los 99 numeros");
        calculador.ingresarNumeros();

        double media = calculador.calcMedia();
        System.out.println("La media es " + media);
        System.out.println("Hay " + calculador.calcMayorMedia(media) + " numeros mayores que la media");

    }
}
