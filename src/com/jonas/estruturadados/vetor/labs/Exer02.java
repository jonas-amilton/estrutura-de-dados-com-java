package com.jonas.estruturadados.vetor.labs;

import com.jonas.estruturadados.vetor.Lista;

public class Exer02 {
    public static void main(String[] args) {

        Lista<String> lista = new Lista<String>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista.ultimoIndice("C"));
    }
}
