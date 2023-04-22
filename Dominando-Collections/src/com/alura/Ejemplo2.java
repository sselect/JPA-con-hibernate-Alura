package com.alura;

import java.util.ArrayList;

public class Ejemplo2 {

    public static void main(String[] args) {
        String variable1 = "Ejemplo1";
        String variable2 = "Ejemplo2";
        String variable3 = "Ejemplo3";
        String variable4 = "Ejemplo4";

        ArrayList<String> listaString = new ArrayList<>();
        listaString.add(variable1);
        listaString.add(variable2);
        listaString.add(variable3);
        listaString.add(variable4);

        System.out.println(listaString);

        // 1 - (for tradicional)forma de leer una lista o Arrays
       /* for (int i = 0; i < listaString.size(); i++) {
            System.out.println(listaString.get(i)); */

        // 2 - (for tipo foreach)forma de leer una lista o Arrays
        /* for (String ejemplo: listaString){
           System.out.println(ejemplo);
         } */

        // 3 - (foreach recurso de lambida)forma de leer una lista o Arrays
        listaString.forEach(ejemplo -> {
            System.out.println(ejemplo);
        });
    }

}
