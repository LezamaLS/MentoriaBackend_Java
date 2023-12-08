package Ejercicio1;

import java.util.ArrayList;

public class Student {
    private final double height;
    public Student(double height){
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public static double getMediumHeight(ArrayList<Student> students){
        double totalHeight = 0.0;
        for (Student student : students){
            totalHeight += student.getHeight();
        }
        return totalHeight / students.size();
    }
}
