package com.alura;

import model.Alumno;
import model.Curso;

import java.util.Iterator;
import java.util.Optional;

public class Ejemplo18 {

    //TODO: https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
    //TODO: https://docs.oracle.com/javase/8/docs/api/index.html?java/util/Collection.html

    public static void main(String[] args) {

        Curso curso1 = new Curso("Historia", 30);

        Alumno alumno1 = new Alumno("Luis Miguel", "001");
        Alumno alumno2 = new Alumno("Pepito los palotes", "002");
        Alumno alumno3 = new Alumno("Juan Carlos", "003");
        Alumno alumno4 = new Alumno("Pedro Pedrito", "004");
        Alumno alumno5 = new Alumno("Gustavo Sanchez", "005");
        Alumno alumno6 = new Alumno("Marcia Maria", "006");
        Alumno alumno7 = new Alumno("Ely santiago", "007");
        Alumno alumno8 = new Alumno("Claudia Maria", "008");

        //Set no imprime o guarda Objetos Duplicados.
        // Set<String> listaAlumnos = new HashSet<>();

        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        curso1.addAlumno(alumno7);
        curso1.addAlumno(alumno8);

        //curso1.getAlumnos().forEach(System.out::println);

        Optional<Alumno> alumno = curso1.getAlumnos().stream().filter(a -> "003".equalsIgnoreCase(a.getCodigo())).findFirst();

        if(alumno.isPresent()){
            System.out.println(alumno.get());
        }

        Alumno alumnoMap =   curso1.getAlumnoMap().get("003");
        System.out.println(alumnoMap);

    }
}