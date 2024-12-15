package com.jonas.estruturadados.vetor.labs;

import com.jonas.estruturadados.vetor.Lista;

public class Exer04 {
    public static void main(String[] args) {

        Lista<String> lista = new Lista<String>(3);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista.obtem(2));
    }
}
