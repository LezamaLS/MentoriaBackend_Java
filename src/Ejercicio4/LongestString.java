package Ejercicio4;
import java.util.ArrayList;
public class LongestString {
    public static String encontrarLargo(ArrayList<String> original){
        String longest = "";
        for (String temp : original) {
            if (temp.length() > longest.length()) {
                longest = temp;
            }
        }
        return longest;
    }
}
