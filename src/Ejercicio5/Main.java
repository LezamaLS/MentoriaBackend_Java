package Ejercicio5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Perro> perros = new ArrayList<>();

        perros.add(new Perro("Firulais", 3));
        perros.add(new Perro("Moca", 13));
        perros.add(new Perro("Sabi", 9));
        perros.add(new Perro("Cami", 10));
        perros.add(new Perro("Tica", 13));

        for (Perro perro : perros) {
            System.out.println(perro);
        }

        System.out.println("Perro #3: " + perros.get(3).getNombre());
        perros.get(3).setNombre("Terry");
        System.out.println("Perro #3: " + perros.get(3).getNombre());

        for (int i = 0, perrosSize = perros.size(); i < perrosSize; i++) {
            Perro perro = perros.get(i);
            System.out.println("#" + i + ": " + perro);
        }
    }
}
