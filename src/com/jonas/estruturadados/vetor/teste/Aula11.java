package com.jonas.estruturadados.vetor.teste;

import com.jonas.estruturadados.vetor.Lista;

public class Aula11 {
    public static void main(String[] args) {

        Lista<String> vetor = new Lista<String>(1);

        vetor.adiciona("elemento 1");

        System.out.println(vetor);

    }
}
