package Ejercicio3;
import java.util.ArrayList;

public class ArrayRotacion {

    public static void invertirArrayList(ArrayList<Integer> original) {

        //Hacemos un ciclo por indice que solo recorrala mitad del ArrayList
        for (int i = 0; i < original.size() / 2; i++) {

            //Variable temporal para guardar el valor del indice
            Integer save = original.get(i);

            //Ahora intercambiamos los valores del actual y su contraparte en la otra mitad
            original.set(i, original.get(original.size() - 1 - i));
            original.set(original.size() - 1 - i, save);
        }
    }
}