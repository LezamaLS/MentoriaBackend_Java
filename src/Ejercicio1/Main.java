package Ejercicio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(179));
        students.add(new Student(167));
        students.add(new Student(182));
        students.add(new Student(191));
        students.add(new Student(155));

        double mediumStudent = Student.getMediumHeight(students);
        System.out.println("La altura media es: " + mediumStudent);
    }


}