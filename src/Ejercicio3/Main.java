package Ejercicio3;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> listaRotar = new ArrayList<>();
        listaRotar.add(1);
        listaRotar.add(2);
        listaRotar.add(3);
        listaRotar.add(4);
        listaRotar.add(5);
        listaRotar.add(6);
        listaRotar.add(7);
        listaRotar.add(8);
        listaRotar.add(9);

        ArrayRotacion.invertirArrayList(listaRotar);
        System.out.println(listaRotar);
    }
}