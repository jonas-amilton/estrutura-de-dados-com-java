package com.jonas.estruturadados.vetor.teste;

import com.jonas.estruturadados.vetor.Vetor;

public class Aula03 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(2);

        // utilizando exception
        // try {
        // vetor.adiciona("elemento 1");
        // vetor.adiciona("elemento 2");
        // vetor.adiciona("elemento 3");
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // utilizando boolean
        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

    }
}
