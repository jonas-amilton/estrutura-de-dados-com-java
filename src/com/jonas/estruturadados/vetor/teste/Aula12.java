package com.jonas.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList);

        arrayList.add(1, "B");

        System.out.println(arrayList);

        boolean existe = arrayList.contains("A"); // contains retorna true or false

        if (existe) {
            System.out.println("Contem o elemento no array.");
        } else {
            System.out.println("Nao contem o elemento A no array.");
        }

        int pos = arrayList.indexOf("C");

        if (pos > -1) {
            System.out.println("Elemento encontrado na posição " + pos);
        } else {
            System.out.println("Elemento não encontrado.");
        }

        System.out.println(arrayList.get(0));

        arrayList.remove(0);
        arrayList.remove("A");

        System.out.println(arrayList);

        System.out.println(arrayList.size());
    }
}
