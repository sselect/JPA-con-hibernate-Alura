package com.alura;

import model.Aula;
import model.Curso;

import java.util.ArrayList;

public class Ejemplo6 {

    public static void main(String[] args) {

        Curso curso1 = new Curso("Java", 30);
        curso1.addAula(new Aula("Arraylist"));
        curso1.addAula(new Aula("List"));
        curso1.addAula(new Aula("linkedList"));


        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);


        System.out.println(cursos.get(0).getClaseList());

    }
  }
