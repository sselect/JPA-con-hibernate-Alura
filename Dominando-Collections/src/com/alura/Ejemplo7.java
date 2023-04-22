package com.alura;

import model.Aula;
import model.Curso;
import java.util.ArrayList;
import java.util.List;

public class Ejemplo7 {

    public static void main(String[] args) {

        Curso curso1 = new Curso("Java", 30);
        curso1.addAula(new Aula("Arraylist"));
        curso1.addAula(new Aula("List"));
        curso1.addAula(new Aula("linkedList"));
        curso1.addAula(new Aula("Inmutable"));

        List<Aula> aulaList = curso1.getClaseList();

        //aulaList.add(new Aula("Inmutable"));

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);

        System.out.println(cursos.get(0).getClaseList());

    }

}
