package com.jonas.estruturadados.vetor.teste;

import com.jonas.estruturadados.vetor.Vetor;

public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");

        System.out.println(vetor);

        vetor.remove(1);

        System.out.println(vetor);

        int posicaoE = vetor.busca("E");

        System.out.println("A posição do elemento E é: " + posicaoE);

        if (posicaoE > -1) {
            vetor.remove(posicaoE);
        } else {
            System.out.println("Elemento nao encontrado");
        }

        System.out.println(vetor);

    }
}
