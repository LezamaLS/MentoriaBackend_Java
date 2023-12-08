package Ejercicio4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("String numero I");
        listaStrings.add("String numero II");
        listaStrings.add("String numero III");

        System.out.println(LongestString.encontrarLargo(listaStrings));
    }
}
